package edu.graduate.web.controller;

import java.io.File;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import edu.graduate.bean.Fruit;
import edu.graduate.bean.ImgIndexButtom;
import edu.graduate.bean.Nutrition;
import edu.graduate.bean.NutritionFruit;
import edu.graduate.bean.Reason;
import edu.graduate.bean.extend.FruitVM;
import edu.graduate.bean.extend.NutritionVM;
import edu.graduate.service.IFruitService;
import edu.graduate.service.INutritionFruitService;
import edu.graduate.service.INutritionService;
import edu.graduate.service.IReasonService;
import edu.graduate.util.ImgUtil;

@RestController
public class ManagerFruitController {
	@Autowired
	private IFruitService iFruitService;
	@Autowired
	private IReasonService iReasonService;
	@Autowired
	private INutritionService iNutritionService;
	
	@Autowired
	private INutritionFruitService iNutritionFruitService;

//水果信息总	
	@GetMapping("/fruitInformation")
	public ModelAndView fruitInformation(@RequestParam(value = "page", defaultValue = "1") Integer page,
			HttpServletRequest request, Map<String, Object> map) throws Exception {
		PageHelper.startPage(page, 8);
		List<FruitVM> selectAllFruitList = iFruitService.selectAllFruitVM();
		PageInfo<FruitVM> pageInfofruitInformation = new PageInfo<>(selectAllFruitList);
		List<FruitVM> pageListfruitInformation = pageInfofruitInformation.getList();

		map.put("currentPage", page);
		map.put("totalPage", pageInfofruitInformation.getPages()); // 获取总页面
		map.put("fruitInformation", pageListfruitInformation);
		return new ModelAndView("admin/fruitInformation", map);

	}
//在全部水果信息中添加营养信息
	@GetMapping("/addNutrition")
	public ModelAndView addCheckNutrition(Map<String, Object> map) throws Exception {
		List<NutritionVM> seleAllNutritionList = iNutritionService.selectAllNutritionVM();
		map.put("addNutrition", seleAllNutritionList);
		return new ModelAndView("admin/addfruitInformation", map);
	}
	@PostMapping("/searchFruitByNameDim")
	public ModelAndView searchFruitByNameDim(@RequestParam(value = "page", defaultValue = "1") Integer page,
			HttpServletRequest request, Map<String, Object> map, @RequestParam String fruitName) throws Exception {
		PageHelper.startPage(page, 8);
		List<FruitVM> selectAllFruitList = iFruitService.selectFruitVMByName(fruitName);
		PageInfo<FruitVM> pageInfofruitInformation = new PageInfo<>(selectAllFruitList);
		List<FruitVM> pageListfruitInformation = pageInfofruitInformation.getList();

		map.put("currentPage", page);
		map.put("totalPage", pageInfofruitInformation.getPages()); // 获取总页面
		map.put("fruitInformation", pageListfruitInformation);
		return new ModelAndView("admin/fruitInformation", map);

	}

//水果add信息验证
	@PostMapping("/checkFruitInfrmation")
	public void checkFruitInfrmation(@RequestParam("file") MultipartFile file,HttpServletRequest request, HttpServletResponse response) throws Exception {

		String result = "";
		String name = request.getParameter("name");
		Fruit selectByName = iFruitService.selectByName(name);
		NutritionFruit qiao = new NutritionFruit();
		if (selectByName != null) {
			result = "该水果已经被添加，请重新输入！";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		} else {
			if(file.isEmpty()) {
				result = "请选择图片";
			}
			String upload = ImgUtil.upload(null, file, request);
			String brief = request.getParameter("brief");
			String description = request.getParameter("description");
			String pregnanteat = request.getParameter("pregnanteat");
			String momeat = request.getParameter("momeat");
			String babyeat = request.getParameter("babyeat");
			String[] str = request.getParameterValues("str[]");
			FruitVM fruitVM = new FruitVM();
			fruitVM.setName(name);
			fruitVM.setPicture(upload);
			fruitVM.setBrief(brief);
			fruitVM.setDescription(description);
			fruitVM.setPregnantEat(pregnanteat);
			fruitVM.setMomEat(momeat);
			fruitVM.setBabyEat(babyeat);
			iFruitService.insertQiao(fruitVM);
			Long fruitId = fruitVM.getId();
		    for(int i=0;i<str.length;i++) 
		    	{
			    	qiao.setFruitId(fruitId);
			    	qiao.setNutritionId(Long.parseLong(str[i]));
			    	iNutritionFruitService.insert(qiao);
		    	}
			result = "ok";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		}
	}

	// 以下是水果全部的编辑内容
	@GetMapping("/editSelectfruitinformationById")
	public ModelAndView editSelectfruitinformationById(Map<String, Object> map, @RequestParam String id)
			throws Exception {
		Long ids = Long.parseLong(id);
		FruitVM selectFruitinformationById = iFruitService.selectFruitVMById(ids);
		List<NutritionVM> addNutrition = iNutritionService.selectNutritionByFruitId(ids);
		List<NutritionVM> seleAllNutritionList = iNutritionService.selectAllNutritionVM();
		map.put("searchNutrition", seleAllNutritionList);
		map.put("addNutrition", addNutrition);
		map.put("editSelectfruitinformationById", selectFruitinformationById);
		return new ModelAndView("admin/editfruitInformation", map);
	}

	// 以下使水果全部修改验证内容
	@PostMapping("/checkUpdateFruitinformation")
	public void checkUpdateFruitinformation(Fruit fruit, HttpServletResponse response,HttpServletRequest request) throws Exception {
		String result = "";
		String[] str = request.getParameterValues("str[]");
		iFruitService.update(fruit);
		Long fruitId = fruit.getId();
		iNutritionFruitService.deleteByFruitId(fruitId);
		NutritionFruit qiao = new NutritionFruit();
	    for(int i=0;i<str.length;i++) 
	    	{
		    	qiao.setFruitId(fruitId);
		    	qiao.setNutritionId(Long.parseLong(str[i]));
		    	iNutritionFruitService.insert(qiao);
	    	}
		result = "ok";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(result);
	}

	// 以下是水果全部删除内容
	@GetMapping("/deleteFruitinformationById")
	public ModelAndView deleteFruitinformationById(@RequestParam(value = "page", defaultValue = "1") Integer page,
			HttpServletRequest request, @RequestParam Long id, Map<String, Object> map) throws Exception {
		FruitVM  selectOne = iFruitService.selectFruitVMById(id);
		String picture = selectOne.getPicture();
		String dir = request.getServletContext().getRealPath("/upload");
		File old = new File(dir + "/" + picture);
		if(old.exists()) {
			old.delete();
		}
		
		iFruitService.delete(id);
		return fruitInformation(page, request, map);
	}

	// 以下是水果全部批量删除内容
	@PostMapping("/batchdeleteFruitinformationById")
	public ModelAndView batchdeleteFruitinformationById(@RequestParam String fruitInformationList,
			HttpServletRequest request, Map<String, Object> map) throws Exception {
		System.out.println(fruitInformationList);
		String[] strs = fruitInformationList.split(",");
		for (int i = 0; i < strs.length; i++) {
			FruitVM  selectOne = iFruitService.selectFruitVMById(Long.parseLong(strs[i]));
			String picture = selectOne.getPicture();
			String dir = request.getServletContext().getRealPath("/upload");
			File old = new File(dir + "/" + picture);
			if(old.exists()) {
				old.delete();
			}
			iFruitService.delete(Long.parseLong(strs[i]));
		}
		return fruitInformation(1, request, map);
	}

///////////////////////////////////以上水果全部详细信息	
	@GetMapping("/fruitReason")
	public ModelAndView fruitReason(@RequestParam(value = "page", defaultValue = "1") Integer page,
			HttpServletRequest request, Map<String, Object> map) throws Exception {
		PageHelper.startPage(page, 8);
		List<Reason> selectAllReasonList = iReasonService.findAll();
		PageInfo<Reason> pageInfoReason = new PageInfo<>(selectAllReasonList);
		List<Reason> pageListReason = pageInfoReason.getList();

		map.put("currentPage", page);
		map.put("totalPage", pageInfoReason.getPages());
		map.put("fruitReason", pageListReason);
		return new ModelAndView("admin/fruitReason", map);
	}

	@GetMapping("/addFruit")
	public ModelAndView addFruit(Map<String, Object> map) throws Exception {
		List<Fruit> findAll = iFruitService.findAllFruit();
		map.put("searchFruit", findAll);
		return new ModelAndView("admin/addfruitReason", map);
	}

//验证信息
	@PostMapping("/checkfruitReason")
	public void checkfruitReason(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String result = "";
		String fruit = request.getParameter("fruit");
		Long fruit1 = Long.parseLong(fruit);
		System.out.println(fruit1);
		Reason selectByFruitId = iReasonService.selectByFruitId(fruit1);
		if (selectByFruitId != null) {
			result = "该水果原因已经被添加，请重新输入！";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		} else {
			String pregnanteat = request.getParameter("pregnanteat");
			String momeat = request.getParameter("momeat");
			String babyeat = request.getParameter("babyeat");
			Reason reason = new Reason();
			reason.setPregnanteat(pregnanteat);
			reason.setBabyeat(babyeat);
			reason.setMomeat(momeat);
			reason.setFruitId(Long.parseLong(fruit));
			iReasonService.saveReason(reason);

			result = "ok";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		}

	}
	//以下是水果能吃或慎吃原因的编辑内容
		@GetMapping("/editFruitReasonById")
		public ModelAndView editFruitReason(Map<String, Object> map,@RequestParam Integer id) throws Exception{
			Reason selectById = iReasonService.selectAllVMById(id);
			List<Fruit> findAll = iFruitService.findAllFruit();
			map.put("searchFruit", findAll);
			map.put("editFruitReasonById", selectById);
			return new ModelAndView("admin/editfruitReason",map);
		}
		
	//修改水果原因验证内容
		@PostMapping("/checkUpdateFruitReason")
		public void checkUpdateProfessor(Reason reason,HttpServletResponse response,HttpServletRequest request) throws Exception{
			String result = "";
			String fruitId = request.getParameter("fruitId");
			Long fruit1 = Long.parseLong(fruitId);
			System.out.println(fruit1);
			Reason selectByFruitId = iReasonService.selectByFruitId(fruit1);
			if (selectByFruitId != null) {
				result = "该水果原因已经被添加，请重新输入！";
				response.setContentType("text/html");
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write(result);
			} else {
			System.out.println(reason);
			try {
				
				iReasonService.update(reason);
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
		}

//删除和批量删除的功能
	// 以下是水果全部删除内容
	@GetMapping("/deleteFruitReasonById")
	public ModelAndView deleteFruitReasonById(@RequestParam(value = "page", defaultValue = "1") Integer page,
			HttpServletRequest request, @RequestParam Integer id, Map<String, Object> map) throws Exception {
		iReasonService.delete(id);
		return fruitReason(page, request, map);
	}

//以下是水果全部批量删除内容
	@PostMapping("/batchdeleteFruitreasonById")
	public ModelAndView batchdeleteFruitreasonById(@RequestParam String fruitReasonList, HttpServletRequest request,
			Map<String, Object> map) throws Exception {
		System.out.println(fruitReasonList);
		String[] strs = fruitReasonList.split(",");
		for (int i = 0; i < strs.length; i++) {
			iReasonService.delete(Integer.parseInt(strs[i]));
		}
		return fruitReason(1, request, map);
	}

//////////////////////////////////////以上是水果能吃不能吃的原因
	@GetMapping("/fruitNutritionInformation")
	public ModelAndView fruitNutritionInformation(@RequestParam(value = "page", defaultValue = "1") Integer page,
			HttpServletRequest request, Map<String, Object> map) throws Exception {

		PageHelper.startPage(page, 8);
		List<Nutrition> selectAllNutritionList = iNutritionService.findAllNutrition();
		PageInfo<Nutrition> pageInfoNutrition = new PageInfo<>(selectAllNutritionList);
		List<Nutrition> pageListNutrition = pageInfoNutrition.getList();

		map.put("currentPage", page);
		map.put("totalPage", pageInfoNutrition.getPages());
		map.put("fruitNutritionInformation", pageListNutrition);
		return new ModelAndView("admin/fruitNutritionInformation", map);
	}

	@PostMapping("/searchNutritionDim")
	public ModelAndView searchNutritionDim(@RequestParam(value = "page", defaultValue = "1") Integer page,
			HttpServletRequest request, Map<String, Object> map, @RequestParam String nutritionName) throws Exception {

		PageHelper.startPage(page, 8);
		List<NutritionVM> selectAllNutritionList = iNutritionService.selectNutritionVMByName(nutritionName);
		PageInfo<NutritionVM> pageInfoNutrition = new PageInfo<>(selectAllNutritionList);
		List<NutritionVM> pageListNutrition = pageInfoNutrition.getList();

		map.put("currentPage", page);
		map.put("totalPage", pageInfoNutrition.getPages());
		map.put("fruitNutritionInformation", pageListNutrition);
		return new ModelAndView("admin/fruitNutritionInformation", map);
	}

	// 水果营养信息验证
	@PostMapping("/checkFruitNutritionInfrmation")
	public void checkFruitNutritionInfrmation(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String result = "";
		String name = request.getParameter("name");
		Nutrition selectByName = iNutritionService.selectByName(name);
		if (selectByName != null) {
			result = "该营养已经被添加，请重新输入！";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		} else {
			String name1 = request.getParameter("name");
			String description = request.getParameter("description");
			Nutrition nutrition = new Nutrition();
			nutrition.setName(name1);
			nutrition.setDescription(description);
			iNutritionService.saveNutrition(nutrition);

			result = "ok";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		}
	}

	// 以下是水果营养信息的编辑内容
	@GetMapping("/editSelectNutritionById")
	public ModelAndView editSelectById(Map<String, Object> map, @RequestParam Long id) throws Exception {
		Nutrition selectFruitNutritionById = iNutritionService.selectNutritionById(id);
		map.put("editSelectNutritionById", selectFruitNutritionById);
		return new ModelAndView("admin/editfruitNutritionInformation", map);
	}

	// 以下使水果营养信息修改验证内容
	@PostMapping("/checkUpdateFruitNutrition")
	public void checkUpdateFruitNutrition(Nutrition nutrition, HttpServletResponse response) {
		String result = "";
		try {
			System.out.println(nutrition);
			iNutritionService.update(nutrition);
		} catch (Exception e) {
			e.printStackTrace();
		}
		result = "ok";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		try {
			response.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 以下是水果营养信息删除内容
	@GetMapping("/deleteFruitNutritionById")
	public ModelAndView deleteFruitNutritionById(@RequestParam(value = "page", defaultValue = "1") Integer page,
			HttpServletRequest request, @RequestParam Long id, Map<String, Object> map) throws Exception {
		iNutritionService.delete(id);
		return fruitNutritionInformation(page, request, map);
	}

	// 以下是水果营养信息批量删除内容
	@PostMapping("/batchdeleteFruitNutritionById")
	public ModelAndView batchDelete(@RequestParam String fruitNutritionList,
			@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception {
		System.out.println(fruitNutritionList);
		String[] strs = fruitNutritionList.split(",");
		for (int i = 0; i < strs.length; i++) {
			iNutritionService.delete(Long.parseLong(strs[i]));
		}
		return fruitNutritionInformation(page, request, map);
	}

}
