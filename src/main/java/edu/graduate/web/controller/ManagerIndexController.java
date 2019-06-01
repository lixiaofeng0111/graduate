package edu.graduate.web.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
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

import edu.graduate.bean.ImgIndexButtom;
import edu.graduate.bean.Professor;
import edu.graduate.bean.Topic;
import edu.graduate.bean.TopicKind;
import edu.graduate.service.IImgIndexButtomService;
import edu.graduate.service.IProfessorService;
import edu.graduate.service.ITopicKindService;
import edu.graduate.service.ITopicService;

@RestController
public class ManagerIndexController {
	@Autowired
	private ITopicService iTopicService;
	
	@Autowired
	private IProfessorService iProfessorService;
	
	@Autowired
	private IImgIndexButtomService iImgIndexButtomService;
	@Autowired
	private ITopicKindService iTopicKindService;
	
	
	//今日和昨日话题
	@GetMapping("/indexTodayTopic")
	public ModelAndView indexTodayTopic(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception{
		
		PageHelper.startPage(page, 8);
		List<Topic> selectAllTodayTopticList = iTopicService.findAllTopic();
		PageInfo<Topic> pageInfoTodayToptic = new PageInfo<>(selectAllTodayTopticList);
		List<Topic> pageListTodayToptic = pageInfoTodayToptic.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoTodayToptic.getPages()); 
		map.put("indexTodayTopic", pageListTodayToptic);
		return new ModelAndView("admin/indexTodayTopic",map);
	}
//模糊查询今日或往期话题
	@PostMapping("/searchIndexTopicDim")
	public ModelAndView searchIndexTopicDim(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map,@RequestParam String topicString) throws Exception{
		
		PageHelper.startPage(page, 8);
		List<Topic> searchTopics = iTopicService.findTopicByNameDim(topicString);
		PageInfo<Topic> pageInfoTodayToptic = new PageInfo<>(searchTopics);
		List<Topic> pageListTodayToptic = pageInfoTodayToptic.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoTodayToptic.getPages()); 
		map.put("indexTodayTopic", pageListTodayToptic);
		return new ModelAndView("admin/indexTodayTopic",map);
	}
	
//以下是添加今日和往期话题的验证内容
	@PostMapping("/checkIndexTodayTopic")
	public void saveRegister(HttpServletRequest request , HttpServletResponse response) throws Exception {
		
		String result = "";
		String topicname = request.getParameter("topicname");
		Topic selectByName = iTopicService.findTopicByName(topicname);
		if(selectByName!=null) {
			result = "该话题名已经被添加，请重新输入话题名！";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		}
		else {
		String topicContent = request.getParameter("topicContent");
		String datetime = request.getParameter("datetime");
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(datetime); 
		
		System.out.println(datetime);
		
		Topic topic = new Topic();
		topic.setName(topicname);
		topic.setContent(topicContent);
		topic.setDatetime(date);
		
		iTopicService.savaTopic(topic);

		result = "ok";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(result);
		}
	}
	
	//以下是今日或者往期的编辑内容
		@GetMapping("/editTodayTopicSelectById")
		public ModelAndView editSelectById(Map<String, Object> map,@RequestParam Long id) throws Exception{
			Topic selectTodayTopicById = iTopicService.selectById(id);
			map.put("editTodayTopicSelectById",selectTodayTopicById);
			return new ModelAndView("admin/editindexTodayTopic",map);
		}
	//以下使今日或往期话题修改验证内容	
		@PostMapping("/checkUpdateTodayTopic")
		public void checkUpdateTodayTopic(Topic topic,@RequestParam String date,HttpServletResponse response) throws ParseException  {
			String result = "";
		
		  Date datetime = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		  topic.setDatetime(datetime);
		 
			System.out.println(topic);
			try {
				iTopicService.update(topic);
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
	//以下是今日或往期话题删除内容	
		@GetMapping("/deleteTodayTopicById")
		public ModelAndView deleteTodayTopicById(@RequestParam(value = "page", defaultValue = "1") Integer page,HttpServletRequest request,@RequestParam Long id,Map<String, Object> map) throws Exception{
			iTopicService.delete(id);
			return indexTodayTopic(page,request,map);
		}
		
	//以下是今日或往期话题批量删除内容
		@PostMapping("/batchdeleteTodayTopicById")
		public ModelAndView batchDelete(@RequestParam String todayTopicList,HttpServletRequest request,Map<String, Object> map) throws Exception{
			String[] strs = todayTopicList.split(",");
		    for (int i = 0; i < strs.length; i++) {
		    	iTopicService.delete(Long.parseLong(strs[i]));
		    }
		    return indexTodayTopic(1,request,map);
		}
	
////////////////////////////////////////////以上是今日或昨日话题
	

	//专家及其他话题
	@GetMapping("/indexProfessorTopic")
	public ModelAndView indexProfessorTopic(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception{
		
		PageHelper.startPage(page, 8);
		List<Professor> selectAllProfessorList = iProfessorService.findAll();
		PageInfo<Professor> pageInfoProfessor = new PageInfo<>(selectAllProfessorList);
		List<Professor> pageListProfessor = pageInfoProfessor.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoProfessor.getPages()); 
		map.put("indexProfessorTopic", pageListProfessor);
		return new ModelAndView("admin/indexProfessorTopic",map);
	}
	
	@PostMapping("/searchProfessorTopicDim")
	public ModelAndView searchProfessorTopicDim(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map,@RequestParam String ProfessorName) throws Exception{
		
		PageHelper.startPage(page, 8);
		List<Professor> selectAllProfessorList = iProfessorService.selectProfessorByNameDim(ProfessorName);
		PageInfo<Professor> pageInfoProfessor = new PageInfo<>(selectAllProfessorList);
		List<Professor> pageListProfessor = pageInfoProfessor.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoProfessor.getPages()); 
		map.put("indexProfessorTopic", pageListProfessor);
		return new ModelAndView("admin/indexProfessorTopic",map);
	}
//以下是添加专家话题及其他话题的验证内容
	@PostMapping("/checkIndexProfessorTopic")
	public void checkIndexProfessorTopic(HttpServletRequest request , HttpServletResponse response) throws Exception {
		
		String result = "";
		String topicname = request.getParameter("topicname");
		Professor selectByName = iProfessorService.selectProfessorByName(topicname);
		if(selectByName!=null) {
			result = "该话题名已经被添加，请重新输入话题名！";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		}
		else {
		String topicContent = request.getParameter("topicContent");
		String datetime = request.getParameter("datetime");
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(datetime); 
		String topickind = request.getParameter("topickind");
	
		
		Professor professor = new Professor();
		professor.setName(topicname);
		professor.setCotent(topicContent);
		professor.setDatetime(date);
		professor.setTopickindId(Integer.parseInt(topickind));
		
		iProfessorService.saveProfessor(professor);

		result = "ok";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(result);
		}
	}
	//以下是专家话题及其他话题的编辑内容
	@GetMapping("/addProfessorTopic")
	public ModelAndView addProfessorTopic(Map<String, Object> map) throws Exception{
		List<TopicKind> findAll = iTopicKindService.findAll();
		System.out.println(findAll);
		map.put("searchKind", findAll);
		return new ModelAndView("admin/addindexProfessorTopic",map);
	}
		@GetMapping("/editprofessorSelectById")
		public ModelAndView editprofessorSelectById(Map<String, Object> map,@RequestParam Integer topicKindId) throws Exception{
			Professor editprofessorSelectById = iProfessorService.selectKindByKindId(topicKindId);
			List<TopicKind> findAll = iTopicKindService.findAll();
			
			map.put("searchKind", findAll);
			map.put("editprofessorSelectBykindId",editprofessorSelectById);
			return new ModelAndView("admin/editindexProfessorTopic",map);
		}
		
	//以下使专家话题及其他话题修改验证内容	
		@PostMapping("/checkUpdateProfessor")
		public void checkUpdateProfessor(Professor professor,@RequestParam String date,HttpServletResponse response) throws ParseException  {
			String result = "";
			Date datetime = new SimpleDateFormat("yyyy-MM-dd").parse(date);
			professor.setDatetime(datetime);
			
			try {
				iProfessorService.update(professor);
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
	//以下是专家话题及其他话题删除内容	
		@GetMapping("/deleteProfessorById")
		public ModelAndView deleteProfessorById(@RequestParam(value = "page", defaultValue = "1") Integer page,HttpServletRequest request,@RequestParam Long id,Map<String, Object> map) throws Exception{
			iProfessorService.delete(id);
			return indexProfessorTopic(page,request,map);
		}
		
	//以下是专家话题及其他话题批量删除内容
		@PostMapping("/batchdeleteProfessorById")
		public ModelAndView batchdeleteProfessorById(@RequestParam String professorList,HttpServletRequest request,Map<String, Object> map) throws Exception{
			String[] strs = professorList.split(",");
		    for (int i = 0; i < strs.length; i++) {
		    	iProfessorService.delete(Long.parseLong(strs[i]));
		    }
		    return indexProfessorTopic(1,request,map);
		}
	
	
	
	
	
	
	
	///////////////////////////以上是专家及其他话题的内容
	
	//水果图片相关信息
	@GetMapping("/indexFruit")
	public ModelAndView indexFruit(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception{
		PageHelper.startPage(page, 8);
		List<ImgIndexButtom> selectAllImgIndexButtomList = iImgIndexButtomService.findAllImgIndexButtom();
		PageInfo<ImgIndexButtom> pageInfoImgIndexButtom = new PageInfo<>(selectAllImgIndexButtomList);
		List<ImgIndexButtom> pageListProfessor = pageInfoImgIndexButtom.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoImgIndexButtom.getPages());
		map.put("indexFruit",pageListProfessor);
		return new ModelAndView("admin/indexFruit",map);
	}
//水果模糊查询
	@PostMapping("/searchFruitDim")
	public ModelAndView searchFruitDim(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map,@RequestParam String contentString) throws Exception{
		PageHelper.startPage(page, 8);
		List<ImgIndexButtom> selectByContent = iImgIndexButtomService.selectByContent(contentString);
		PageInfo<ImgIndexButtom> pageInfoImgIndexButtom = new PageInfo<>(selectByContent);
		List<ImgIndexButtom> pageListProfessor = pageInfoImgIndexButtom.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoImgIndexButtom.getPages());
		map.put("indexFruit",pageListProfessor);
		return new ModelAndView("admin/indexFruit",map);
	}
//以下是水果相关信息的添加验证内容
	
	@PostMapping("/checkIndexFruit")
	public void checkIndexFruit(HttpServletRequest request , HttpServletResponse response) throws Exception {
		
		String result = "";
		String fruitImgpath = request.getParameter("fruitImgpath");
		ImgIndexButtom selectByImgpath = iImgIndexButtomService.selectByImgpath(fruitImgpath);
		if(selectByImgpath!=null) {
			result = "该话题名已经被添加，请重新输入话题名！";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		}
		else {
		String fruitContent = request.getParameter("fruitContent");
	
		
		ImgIndexButtom imgIndexButtom = new ImgIndexButtom();
		imgIndexButtom.setImgpath(fruitImgpath);
		imgIndexButtom.setContent(fruitContent);
		iImgIndexButtomService.saveImgIndexButtom(imgIndexButtom);

		result = "ok";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(result);
		}
	}
	//以下是水果相关信息的编辑内容
		@GetMapping("/editFruitSelectById")
		public ModelAndView editFruitSelectById(Map<String, Object> map,@RequestParam Integer id) throws Exception{
			ImgIndexButtom selectById = iImgIndexButtomService.selectById(id);
			
			map.put("editFruitSelectById",selectById);
			return new ModelAndView("admin/editindexFruit",map);
		}
		
	//以下使水果相关信息修改验证内容	
		@PostMapping("/checkUpdateFruit")
		public void checkUpdateFruit(ImgIndexButtom imgIndexButtom,HttpServletResponse response)  {
			String result = "";
			System.out.println(imgIndexButtom);
			try {
				iImgIndexButtomService.update(imgIndexButtom);
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
	//以下是水果相关信息删除内容	
		@GetMapping("/deleteFruitById")
		public ModelAndView deleteFruitById(@RequestParam(value = "page", defaultValue = "1") Integer page,HttpServletRequest request,@RequestParam Integer id,Map<String, Object> map) throws Exception{
			iImgIndexButtomService.delete(id);
			return indexFruit(page,request,map);
		}
		
	//以下是水果相关信息批量删除内容
		@PostMapping("/batchdeletefruitById")
		public ModelAndView batchdeleteFruitById(@RequestParam String fruitList,HttpServletRequest request,Map<String, Object> map) throws Exception{
			String[] strs = fruitList.split(",");
		    for (int i = 0; i < strs.length; i++) {
		    	iImgIndexButtomService.delete(Integer.parseInt(strs[i]));
		    }
		    return indexFruit(1,request,map);
		}	
	

}
