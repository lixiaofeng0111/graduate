package edu.graduate.web.controller;

import java.io.IOException;
import java.text.ParseException;
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

import edu.graduate.bean.PregnantAnalysis;
import edu.graduate.bean.Kind;
import edu.graduate.bean.MeituShow;
import edu.graduate.bean.PregnantWeek;
import edu.graduate.bean.Yqbd;
import edu.graduate.service.IKindService;
import edu.graduate.service.IMeituShowService;
import edu.graduate.service.IPregnantAnalysisService;
import edu.graduate.service.IPregnantWeekService;
import edu.graduate.service.IYqbdService;

@RestController
public class ManagerPregnantAnalysisController {
	@Autowired
	private IPregnantWeekService iPregnantWeekService;
	@Autowired
	private IYqbdService iYqbdService;
	@Autowired
	private IKindService iKindService;
	@Autowired
	private IPregnantAnalysisService iPregnantAnalysisService;
	@Autowired
	private IMeituShowService iMeituShowService;
	
//以下是孕周的各个阶段的查询全部	
	@GetMapping("/pregnantAnalysisPregantWeek")
	public ModelAndView pregnantAnalysisPregantWeek(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception{
		PageHelper.startPage(page, 7);
		List<PregnantWeek> selectAllPregantWeekList = iPregnantWeekService.selectAllPregnantWeek();
		PageInfo<PregnantWeek> pageInfoPregnantWeek = new PageInfo<>(selectAllPregantWeekList);
		List<PregnantWeek> pageListPregnantWeek = pageInfoPregnantWeek.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoPregnantWeek.getPages());
		map.put("pregnantAnalysisPregantWeek", pageListPregnantWeek);
		return new ModelAndView("admin/pregnantAnalysisWeek",map);
	}
//以下是验证孕周的信息的阶段
	@PostMapping("/checkPregnantAnalysisweek")
	public void checkPregnantAnalysisweek(HttpServletRequest request , HttpServletResponse response) throws Exception {
		
		String result = "";
		String week1 = request.getParameter("week");
		Integer week = Integer.parseInt(week1);
		PregnantWeek selectByweek = iPregnantWeekService.selectPregnantWeekByweek(week);
		if(selectByweek!=null) {
			result = "该类名已经被添加，请重新输入！";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		}
		else {
		String pictrue = request.getParameter("picture");
		String yqts = request.getParameter("yqts");
		String bbfy = request.getParameter("bbfy");
		String yyts = request.getParameter("yyts");
		String bmxz = request.getParameter("bmxz");
		String mmbh = request.getParameter("mmbh");
		
		PregnantWeek pregnantWeek = new PregnantWeek();
		pregnantWeek.setPictrue(pictrue);
		pregnantWeek.setWeek(week);
		pregnantWeek.setYqts(yqts);
		pregnantWeek.setBbfy(bbfy);
		pregnantWeek.setYyts(yyts);
		pregnantWeek.setBmxz(bmxz);
		pregnantWeek.setMmbh(mmbh);
		
		
		iPregnantWeekService.savePregnantWeek(pregnantWeek);

		result = "ok";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(result);
		}
	}
	
	//以下是孕周的编辑内容
		@GetMapping("/editweekSelectById")
		public ModelAndView editweekSelectById(Map<String, Object> map,@RequestParam Integer id) throws Exception{
			PregnantWeek selectPregnantWeekById = iPregnantWeekService.selectPregnantWeekById(id);
			map.put("editweekSelectById",selectPregnantWeekById);
			return new ModelAndView("admin/editpregnantAnalysisWeek",map);
		}
	//以下使孕周修改验证内容	
		@PostMapping("/checkUpdateweek")
		public void checkUpdateweek(PregnantWeek pregnantWeek,HttpServletResponse response) throws ParseException  {
			String result = "";
			try {
				iPregnantWeekService.update(pregnantWeek);
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
	//以下是孕周删除内容	
		@GetMapping("/deleteweekById")
		public ModelAndView deleteweekById(@RequestParam(value = "page", defaultValue = "1") Integer page,HttpServletRequest request,@RequestParam Integer id,Map<String, Object> map) throws Exception{
			iPregnantWeekService.delete(id);
			return pregnantAnalysisPregantWeek(page,request,map);
		}
		
	//以下是孕周批量删除内容
		@PostMapping("/batchdeleteweekById")
		public ModelAndView batchDelete(@RequestParam String weekList,HttpServletRequest request,Map<String, Object> map) throws Exception{
			String[] strs = weekList.split(",");
		    for (int i = 0; i < strs.length; i++) {
		    	iPregnantWeekService.delete(Integer.parseInt(strs[i]));
		    }
		    return pregnantAnalysisPregantWeek(1,request,map);
		}
		
	
//////////////////////////////////////////////////////////////////////////	
//以下是孕期必读查询全部部分
	@GetMapping("/pregnantAnalysisYqbd")
	public ModelAndView pregnantAnalysisYqbd(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception{
		PageHelper.startPage(page, 7);
		List<Yqbd> selectAllyqbdList = iYqbdService.selectAllYqbd();
		PageInfo<Yqbd> pageInfoYqbd = new PageInfo<>(selectAllyqbdList);
		List<Yqbd> pageListYqbd = pageInfoYqbd.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoYqbd.getPages());
		map.put("pregnantAnalysisYqbd", pageListYqbd);
		return new ModelAndView("admin/pregnantAnalysisYqbd",map);
	}
	
//以下是验证孕期必读部分
	@PostMapping("/checkPregnantAnalysisYqbd")
	public void checkPregnantAnalysisYqbd(HttpServletRequest request , HttpServletResponse response) throws Exception {
		String result = "";
		String name = request.getParameter("name");
		Yqbd selectByname = iYqbdService.selectByName(name);
		if(selectByname!=null) {
			result = "该名已经被添加，请重新输入！";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		}
		else {
		String showpicture = request.getParameter("showpicture");
		String picture = request.getParameter("picture");
		String description = request.getParameter("description");
		
		Yqbd yqbd = new Yqbd();
		yqbd.setShowpicture(showpicture);
		yqbd.setName(name);
		yqbd.setPicture(picture);
		yqbd.setDiscription(description);
		
		iYqbdService.saveYqbd(yqbd);

		result = "ok";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(result);
		}
	}
	//以下是孕期必读的编辑内容
		@GetMapping("/editSelectYqbdById")
		public ModelAndView editSelectById(Map<String, Object> map,@RequestParam Integer id) throws Exception{
			Yqbd selectYqbdById = iYqbdService.selectById(id);
			map.put("editSelectYqbdById",selectYqbdById);
			return new ModelAndView("admin/editpregnantAnalysisYqbd",map);
		}
		
	//以下使孕期必读修改验证内容	
		@PostMapping("/checkUpdateYqbd")
		public void checkUpdateYqbd(Yqbd yqbd,HttpServletResponse response)  {
			String result = "";
			try {
				iYqbdService.update(yqbd);
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
	//以下是孕期必读删除内容	
		@GetMapping("/deleteYqbdById")
		public ModelAndView deleteYqbdById(@RequestParam(value = "page", defaultValue = "1") Integer page,HttpServletRequest request,@RequestParam Integer id,Map<String, Object> map) throws Exception{
			iYqbdService.delete(id);
			return pregnantAnalysisYqbd(page,request,map);
		}
		
	//以下是孕期必读批量删除内容
		@PostMapping("/batchdeleteYqbdById")
		public ModelAndView batchdeleteYqbdById(@RequestParam String yqbdList,HttpServletRequest request,Map<String, Object> map) throws Exception{
		    System.out.println(yqbdList);
			String[] strs = yqbdList.split(",");
		    for (int i = 0; i < strs.length; i++) {
		    	iYqbdService.delete(Integer.parseInt(strs[i]));
		    }
		    return pregnantAnalysisYqbd(1,request,map);
		}
	
///////////////////////////////////////////////////////////////////////////	
//以下是孕期类别的查询全部信息
	@GetMapping("/pregnantAnalysisKind")
	public ModelAndView pregnantAnalysisKind(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception{
		PageHelper.startPage(page, 7);
		List<Kind> selectAllKindList = iKindService.selectAllKind();
		PageInfo<Kind> pageInfoKind = new PageInfo<>(selectAllKindList);
		List<Kind> pageListKind = pageInfoKind.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoKind.getPages());
		map.put("pregnantAnalysisKind", pageListKind);
		return new ModelAndView("admin/pregnantAnalysisKind",map);
	}
//以下是验证孕期类别方法
	@PostMapping("/checkPregnantAnalysisKind")
	public void checkPregnantAnalysisKind(HttpServletRequest request , HttpServletResponse response) throws Exception {
		
		String result = "";
		String kind = request.getParameter("kind");
		Kind selectByName = iKindService.selectKindByKind(kind);
		if(selectByName!=null) {
			result = "该类名已经被添加，请重新输入！";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		}
		else {
		
		Kind kinds = new Kind();
		kinds.setKind(kind);
		
		iKindService.saveKind(kinds);

		result = "ok";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(result);
		}
	}
	//以下是孕期分析类别的编辑内容
		@GetMapping("/editSelectKindById")
		public ModelAndView editSelectById(Map<String, Object> map,@RequestParam Long id) throws Exception{
			Kind selectKindById = iKindService.selectKindById(id);
			map.put("editSelectKindById",selectKindById);
			return new ModelAndView("admin/editpregnantAnalysisKind",map);
		}
		
	//以下使孕期分析类别修改验证内容	
		@PostMapping("/checkUpdatepregnantKind")
		public void checkUpdatepregnantKind(Kind kind,HttpServletResponse response)  {
			String result = "";
			try {
				iKindService.update(kind);
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
	//以下是孕期分析类别删除内容	
		@GetMapping("/deletepregnantKindById")
		public ModelAndView deletepregnantKindById(@RequestParam(value = "page", defaultValue = "1") Integer page,HttpServletRequest request,@RequestParam Long id,Map<String, Object> map) throws Exception{
			iKindService.delete(id);
			return pregnantAnalysisKind(page,request,map);
		}
		
	//以下是孕期分析类别批量删除内容
		@PostMapping("/batchdeletepregnantKindById")
		public ModelAndView batchdeletepregnantKindById(@RequestParam(value = "page", defaultValue = "1") Integer page,@RequestParam String AnalysisKindList,HttpServletRequest request,Map<String, Object> map) throws Exception{
		    System.out.println(AnalysisKindList);
			String[] strs = AnalysisKindList.split(",");
		    for (int i = 0; i < strs.length; i++) {
		    	iKindService.delete(Long.parseLong(strs[i])); 
		    	
		    }
		    return pregnantAnalysisKind(page,request,map);
		}
	
	
	
/////////////////////////////////////////////////////////////////////////////	
//孕期分析查询全部
	@GetMapping("/pregnantAnalysis")
	public ModelAndView pregnantAnalysis(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception{
		PageHelper.startPage(page, 7);
		List<PregnantAnalysis> selectAllPregnantAnalysisList = iPregnantAnalysisService.selectAllPregnantAnalysis();
		PageInfo<PregnantAnalysis> pageInfoPregnantAnalysis = new PageInfo<>(selectAllPregnantAnalysisList);
		List<PregnantAnalysis> pageListPregnantAnalysis = pageInfoPregnantAnalysis.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoPregnantAnalysis.getPages());
		map.put("pregnantAnalysis", pageListPregnantAnalysis);
		return new ModelAndView("admin/pregnantAnalysis",map);
	}
	
//孕期分析添加验证
	@PostMapping("/checkPregnantAnalysis")
	public void checkIndexFruit(HttpServletRequest request , HttpServletResponse response) throws Exception {
		
		String result = "";
		String name = request.getParameter("name");
		PregnantAnalysis selectByName = iPregnantAnalysisService.selectByName(name);
		if(selectByName!=null) {
			result = "该名已经被添加，请重新输入名字！";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		}
		else {
		String description = request.getParameter("description");
		String kindId = request.getParameter("kind");
	
		
		PregnantAnalysis pregnantAnalysis = new PregnantAnalysis();
		pregnantAnalysis.setName(name);
		pregnantAnalysis.setDescription(description);
		pregnantAnalysis.setKindId(Long.parseLong(kindId));
		
		System.out.println();
		iPregnantAnalysisService.savePregnantAnalysis(pregnantAnalysis);

		result = "ok";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(result);
		}
	}
	//以下是孕期分析文章的内容的编辑内容
		@GetMapping("/editSelectpregnantAnalysisById")
		public ModelAndView editSelectpregnantAnalysisById(Map<String, Object> map,@RequestParam Long id) throws Exception{
			PregnantAnalysis pregnantAnalysis = iPregnantAnalysisService.selectKindByKindId(id);
			map.put("editSelectpregnantAnalysisById",pregnantAnalysis);
			return new ModelAndView("admin/editpregnantAnalysis",map);
		}
		
	//以下使孕期分析文章的内容修改验证内容	
		@PostMapping("/checkUpdatepregnantAnalysis")
		public void checkUpdatepregnantAnalysis(PregnantAnalysis pregnantAnalysis,HttpServletResponse response)  {
			String result = "";
			try {
				iPregnantAnalysisService.update(pregnantAnalysis);
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
	//以下是孕期分析文章的内容删除内容	
		@GetMapping("/deletepregnantAnalysisById")
		public ModelAndView deletepregnantAnalysisById(@RequestParam(value = "page", defaultValue = "1") Integer page,HttpServletRequest request,@RequestParam Integer id,Map<String, Object> map) throws Exception{
			iPregnantAnalysisService.delete(id);
			return pregnantAnalysis(page,request,map);
		}
		
	//以下是孕期分析文章的内容批量删除内容
		@PostMapping("/batchdeletepregnantAnalysisById")
		public ModelAndView batchdeletepregnantAnalysisById(@RequestParam(value = "page", defaultValue = "1") Integer page,@RequestParam String analysisList,HttpServletRequest request,Map<String, Object> map) throws Exception{
		    System.out.println(analysisList);
			String[] strs = analysisList.split(",");
		    for (int i = 0; i < strs.length; i++) {
		    	iPregnantAnalysisService.delete(Integer.parseInt(strs[i]));
		    }
		    return pregnantAnalysis(page,request,map);
		}
	
///////////////////////////////////////////////////////////////////////////////////////////	
	
	@GetMapping("/pregnantAnalysisMeitushow")
	public ModelAndView pregnantAnalysisMeitushow(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception{
		PageHelper.startPage(page, 7);
		List<MeituShow> selectAllMeituShowList = iMeituShowService.selectAllMeituShow();
		PageInfo<MeituShow> pageInfoMeituShow = new PageInfo<>(selectAllMeituShowList);
		List<MeituShow> pageListMeituShow = pageInfoMeituShow.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoMeituShow.getPages());
		map.put("pregnantAnalysisMeituShow", pageListMeituShow);
		return new ModelAndView("admin/pregnantAnalysisMeitushow",map);
	}

	//以下是验证美图路径方法
		@PostMapping("/checkPregnantAnalysisMeitu")
		public void checkPregnantAnalysisMeitu(HttpServletRequest request , HttpServletResponse response) throws Exception {
			
			String result = "";
			String imgpath = request.getParameter("imgpath");
			MeituShow selectimgpath = iMeituShowService.selectByName(imgpath);
			if(selectimgpath!=null) {
				result = "该路径名已经被添加，请重新输入！";
				response.setContentType("text/html");
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write(result);
			}
			else {
			
			MeituShow meituShow = new MeituShow();
			meituShow.setImgpath(imgpath);
			
			iMeituShowService.saveMeituShow(meituShow);

			result = "ok";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
			}
		}
		//以下是美图展示的编辑内容
		@GetMapping("/editSelectMeituById")
		public ModelAndView editSelectMeituById(Map<String, Object> map,@RequestParam Integer id) throws Exception{
			MeituShow selectMeituById = iMeituShowService.selectById(id);
			map.put("editSelectMeituById",selectMeituById);
			return new ModelAndView("admin/editpregnantAnalysisMeitushow",map);
		}
		
	//以下使美图展示修改验证内容	
		@PostMapping("/checkUpdateMeitu")
		public void checkUpdateMeitu(MeituShow meituShow,HttpServletResponse response)  {
			String result = "";
			try {
				iMeituShowService.update(meituShow);
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
	//以下是美图展示删除内容	
		@GetMapping("/deleteMeituById")
		public ModelAndView deleteMeituById(@RequestParam(value = "page", defaultValue = "1") Integer page,HttpServletRequest request,@RequestParam Integer id,Map<String, Object> map) throws Exception{
			iMeituShowService.delete(id);
			return pregnantAnalysisMeitushow(page,request,map);
		}
		
	//以下是美图展示批量删除内容
		@PostMapping("/batchdeleteMeituById")
		public ModelAndView batchDelete(@RequestParam(value = "page", defaultValue = "1") Integer page,@RequestParam String meituList,HttpServletRequest request,Map<String, Object> map) throws Exception{
		    System.out.println(meituList);
			String[] strs = meituList.split(",");
		    for (int i = 0; i < strs.length; i++) {
		    	iMeituShowService.delete(Integer.parseInt(strs[i]));
		    }
		    return pregnantAnalysisMeitushow(page,request,map);
		}
}
