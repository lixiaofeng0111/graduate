package edu.graduate.web.controller;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import edu.graduate.bean.ImgIndex;
import edu.graduate.bean.ImgIndexButtom;
import edu.graduate.bean.LoginRegister;
import edu.graduate.bean.Professor;
import edu.graduate.bean.Topic;
import edu.graduate.service.IImgIndexButtomService;
import edu.graduate.service.IImgIndexService;
import edu.graduate.service.ILoginService;
import edu.graduate.service.IProfessorService;
import edu.graduate.service.ITopicService;

@RestController
public class LoginController {
	
	@Autowired
	private ILoginService loginService;
	@Autowired
	private IImgIndexService iImgIndexService;
	@Autowired
	private IImgIndexButtomService iImgIndexButtomService;
	@Autowired
	private ITopicService iTopicService;
	@Autowired
	private IProfessorService iProfessorService;
	
	@GetMapping("/login")
	public ModelAndView login(Map<String, Object> map) {
		return new ModelAndView("login");
	}
	
	@PostMapping("/checkLogin")
	public void checkLogin(HttpServletRequest request,HttpServletResponse response)  {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String result;
		try {
			LoginRegister loginUsername = loginService.findLoginByName(username);
			if(loginUsername == null) {
				result = "请重新输入！";
			}else if(password.equals(loginUsername.getPassword())) {
				result = "ok";
			}else {
				result = "密码错误!";
			}
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
			
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@GetMapping("/pageIndex")
	public ModelAndView pageindex(Map<String, Object> map) {
		List<ImgIndex> findAllImgIndex = iImgIndexService.findAllIngIndex();
		
		SimpleDateFormat sdf =   new SimpleDateFormat( "yyyyMMdd" );
		String str = sdf.format(new Date());
		List<Topic> findAllTopic = iTopicService.findTopicByDate(str);

		
		PageHelper.startPage(1, 6);
		List<Topic> findAllTopic1 = iTopicService.findAllTopic();
		PageInfo<Topic> pageInfoTopic = new PageInfo<>(findAllTopic1);
		List<Topic> pageListTopic = pageInfoTopic.getList();
		
		
		PageHelper.startPage(1, 6);
		List<Professor> findAllProcesse = iProfessorService.findAllProfessor();
		PageInfo<Professor> pageInfoProfessor = new PageInfo<>(findAllProcesse);
		List<Professor> pageListProfessor = pageInfoProfessor.getList();
		
		
		PageHelper.startPage(1, 8);
		List<ImgIndexButtom> findAllImgIndexButtom = iImgIndexButtomService.findAllImgIndexButtom();
		PageInfo<ImgIndexButtom> pageInfoIndexButtom = new PageInfo<>(findAllImgIndexButtom);
		List<ImgIndexButtom> pageListIndexButtom = pageInfoIndexButtom.getList();
		
 		map.put("imgPath", findAllImgIndex);
 		map.put("imgPathButtom", pageListIndexButtom);
 		map.put("notoday",pageListTopic);
 		map.put("topictoday",findAllTopic);
 		map.put("professors",pageListProfessor);
		return new ModelAndView("index",map);
	}
}
