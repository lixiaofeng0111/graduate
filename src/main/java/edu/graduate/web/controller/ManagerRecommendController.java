package edu.graduate.web.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import edu.graduate.bean.Npd;
import edu.graduate.bean.Nutrition;
import edu.graduate.bean.PregnantDescription;
import edu.graduate.bean.extend.NutritionVM;
import edu.graduate.bean.extend.PregnantDescriptionVM;
import edu.graduate.service.INpdService;
import edu.graduate.service.INutritionService;
import edu.graduate.service.IPregnantDescriptionService;

@RestController
public class ManagerRecommendController {
	@Autowired
	private IPregnantDescriptionService ipregnantDescriptionService;
	
	@Autowired
	private INutritionService iNutritionService;
	
	@Autowired
	private INpdService iNpdService;
	
	@GetMapping("/recommendPregnantDescription")
	public ModelAndView recommendPregnantDescription(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception{
		PageHelper.startPage(page, 5);
		List<PregnantDescriptionVM> selectAllPregnantDescriptionList = ipregnantDescriptionService.selectAllPregnantDescriptionVM();
		PageInfo<PregnantDescriptionVM> pageInfoPregnantDescription = new PageInfo<>(selectAllPregnantDescriptionList);
		List<PregnantDescriptionVM> pageListPregnantDescription = pageInfoPregnantDescription.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoPregnantDescription.getPages()); 
		map.put("recommendPregnantDescription", pageListPregnantDescription);
		return new ModelAndView("admin/recommendInformation",map);
	}
	@GetMapping("/checkNutrition")
	public ModelAndView checkNutrition( Map<String, Object> map) throws Exception{
		List<Nutrition> selectNutrition = iNutritionService.findAllNutrition();
		map.put("checkNutrition", selectNutrition);
		return new ModelAndView("admin/addrecommendInformation",map);
	}
	
	@PostMapping("/searchRecommendDim")
	public ModelAndView searchRecommendDim(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map,@RequestParam String descriptionName) throws Exception{
		PageHelper.startPage(page, 5);
		List<PregnantDescriptionVM> selectAllPregnantDescriptionList = ipregnantDescriptionService.selectByDName(descriptionName);
		PageInfo<PregnantDescriptionVM> pageInfoPregnantDescription = new PageInfo<>(selectAllPregnantDescriptionList);
		List<PregnantDescriptionVM> pageListPregnantDescription = pageInfoPregnantDescription.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoPregnantDescription.getPages()); 
		map.put("recommendPregnantDescription", pageListPregnantDescription);
		return new ModelAndView("admin/recommendInformation",map);
	}
	
	//以下是添加推荐信息验证内容
		@PostMapping("/checkRecomment")
		public void saveRegister(HttpServletRequest request , HttpServletResponse response) throws Exception {
			String result = "";
			String time = request.getParameter("time");
			PregnantDescription selectByTime = ipregnantDescriptionService.selectByTime(time);
			Npd qiaoNpd = new Npd();
			if(selectByTime!=null) {
				result = "该孕月已经被添加，请重新输入话题名！";
				response.setContentType("text/html");
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write(result);
			}
			else {
			String effect = request.getParameter("effect");
			String description = request.getParameter("description");
			String[] str = request.getParameterValues("str[]");
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			
			PregnantDescriptionVM pregnantDescriptionVM = new PregnantDescriptionVM();
			pregnantDescriptionVM.setTime(time);
			pregnantDescriptionVM.setEffect(effect);
			pregnantDescriptionVM.setDescription(description);
			//插入孕月数据
			ipregnantDescriptionService.insertQiao(pregnantDescriptionVM);
			Integer pregnantDescriptionId = pregnantDescriptionVM.getId();
			for (int i = 0; i < str.length; i++) {
				qiaoNpd.setNutritionId(Long.parseLong(str[i]));
				qiaoNpd.setPregnantdescriptionId(pregnantDescriptionId);
				iNpdService.insert(qiaoNpd);
			}

			result = "ok";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
			}
		}
		//以下是推荐的编辑内容
		@GetMapping("/editSelectRecommentById")
		public ModelAndView editSelectById(Map<String, Object> map,@RequestParam Integer id) throws Exception{
			//根据Id查询孕月的所有信息
			PregnantDescriptionVM selectRecommendById = ipregnantDescriptionService.selectDescriptionVMById(id);
			List<NutritionVM> showNutrition = iNutritionService.selectNutritionByPregnantDescriptionId(id);
		
			List<NutritionVM> seleAllNutritionList = iNutritionService.selectAllNutritionVM();
			map.put("searchNutrition", seleAllNutritionList);
			map.put("show", showNutrition);
			map.put("editSelectRecommentById",selectRecommendById);
			return new ModelAndView("admin/editrecommendInformation",map);
		}
		
	//以下使推荐修改验证内容	
		@PostMapping("/checkUpdateRecommend")
		public void checkUpdateRecommend(PregnantDescription pregnantDescription ,HttpServletResponse response,HttpServletRequest request)  throws Exception{
			String result = "";
			String[] str = request.getParameterValues("str[]");
			ipregnantDescriptionService.update(pregnantDescription);
			Integer pregnantDescriptionId = pregnantDescription.getId();
			iNpdService.deleteBypregnantDescriptionId(pregnantDescriptionId);
			Npd qiaoNpd = new Npd();
			for(int i=0;i<str.length;i++) 
	    	{
				qiaoNpd.setPregnantdescriptionId(pregnantDescriptionId);
				qiaoNpd.setNutritionId(Long.parseLong(str[i]));
		    	iNpdService.insert(qiaoNpd);
	    	}
			result = "ok";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
			
		}
	//以下是推荐删除内容	
		@GetMapping("/deleteRecommendById")
		public ModelAndView deleteRecommendById(@RequestParam(value = "page", defaultValue = "1") Integer page,HttpServletRequest request,@RequestParam Integer id,Map<String, Object> map) throws Exception{
			ipregnantDescriptionService.delete(id);
			return recommendPregnantDescription(page,request,map);
		}
		
	//以下是推荐批量删除内容
		@PostMapping("/batchdeleteRecommendById")
		public ModelAndView batchDelete(@RequestParam(value = "page", defaultValue = "1") Integer page,@RequestParam String RecommendList,HttpServletRequest request,Map<String, Object> map) throws Exception{
		    System.out.println(RecommendList);
			String[] strs = RecommendList.split(",");
		    for (int i = 0; i < strs.length; i++) {
		    	ipregnantDescriptionService.delete(Integer.parseInt(strs[i]));
		    }
		    return recommendPregnantDescription(page,request,map);
		}	
		
		
		

}
