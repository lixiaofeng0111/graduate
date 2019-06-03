package edu.graduate.web.controller;

import java.io.IOException;

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

import edu.graduate.bean.Nutrition;
import edu.graduate.bean.PregnantDescription;
import edu.graduate.bean.extend.PregnantDescriptionVM;
import edu.graduate.service.INutritionService;
import edu.graduate.service.IPregnantDescriptionService;

@RestController
public class ManagerRecommendController {
	@Autowired
	private IPregnantDescriptionService ipregnantDescriptionService;
	@Autowired
	private INutritionService iNutritionService;
	
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
	
	//以下是验证内容
		@PostMapping("/checkRecomment")
		public void saveRegister(HttpServletRequest request , HttpServletResponse response) throws Exception {
			
		/*
		 * "time" : time1_val, "effect" : effect1_val, "description" : description1_val,
		 */
			String result = "";
			String time = request.getParameter("time");
			PregnantDescription selectByTime = ipregnantDescriptionService.selectByTime(time);
			if(selectByTime!=null) {
				result = "该孕月已经被添加，请重新输入话题名！";
				response.setContentType("text/html");
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write(result);
			}
			else {
			String effect = request.getParameter("effect");
			String description = request.getParameter("description");
			
			PregnantDescription pregnantDescription = new PregnantDescription();
			pregnantDescription.setTime(time);
			pregnantDescription.setEffect(effect);
			pregnantDescription.setDescription(description);
			
			ipregnantDescriptionService.savePregnantDescription(pregnantDescription);

			result = "ok";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
			}
		}
		//以下是推荐的编辑内容
		@GetMapping("/editSelectRecommentById")
		public ModelAndView editSelectById(Map<String, Object> map,@RequestParam Integer id) throws Exception{
			PregnantDescription selectRecommendById = ipregnantDescriptionService.selectById(id);
			map.put("editSelectRecommentById",selectRecommendById);
			return new ModelAndView("admin/editrecommendInformation",map);
		}
		
	//以下使推荐修改验证内容	
		@PostMapping("/checkUpdateRecommend")
		public void checkUpdateRecommend(PregnantDescription pregnantDescription ,HttpServletResponse response)  {
			String result = "";
			System.out.println(pregnantDescription);
			try {
				ipregnantDescriptionService.update(pregnantDescription);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			result = "ok";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			try {
				response.getWriter().write(result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
