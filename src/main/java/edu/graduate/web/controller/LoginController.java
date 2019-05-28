package edu.graduate.web.controller;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

	
	//进入登陆页面
	@GetMapping("/login")
	public ModelAndView login(Map<String, Object> map) {
		return new ModelAndView("login");
	}
	
	//登录页面的验证
	@PostMapping("/checkLogin")
	public void checkLogin(HttpServletRequest request,HttpServletResponse response)  {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String result;
		try {
			LoginRegister loginUsername = loginService.findLoginByName(username);
			if(loginUsername == null) {
				result = "用户名错误，请重新输入！";
			}else if(password.equals(loginUsername.getPassword())) {
				result = "ok";
			}else {
				result = "密码错误,请重新输入!";
			}
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
			
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
//进入主页面
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
		
		
		List<Professor> findProfessorsByTopicKindId = iProfessorService.selectProfessorsByTopicKindId();
		/*
		 * PageHelper.startPage(1, 6); PageInfo<Professor> pageInfoProfessor = new
		 * PageInfo<>(findAllProfessor); List<Professor> pageListProfessor =
		 * pageInfoProfessor.getList();
		 */
		
		
		PageHelper.startPage(1, 8);
		List<ImgIndexButtom> findAllImgIndexButtom = iImgIndexButtomService.findAllImgIndexButtom();
		PageInfo<ImgIndexButtom> pageInfoIndexButtom = new PageInfo<>(findAllImgIndexButtom);
		List<ImgIndexButtom> pageListIndexButtom = pageInfoIndexButtom.getList();
		
 		map.put("imgPath", findAllImgIndex);
 		map.put("imgPathButtom", pageListIndexButtom);
 		map.put("notoday",pageListTopic);
 		map.put("topictoday",findAllTopic);
 		map.put("professors",findProfessorsByTopicKindId);
		return new ModelAndView("index",map);
	}
	
//通过Id查询今日或者往期话题
	@GetMapping("/selectIndexTopicById")
	public ModelAndView pageTopicdById(Map<String, Object> map,@RequestParam Long id) throws Exception{
		Topic selectTopicById = iTopicService.selectById(id);
		map.put("selectIndexTopic", selectTopicById);
		return new ModelAndView("pageIndexTopic",map);
	}

//MoreTopic
	@GetMapping("/pageMoreIndexTopic")
	public ModelAndView pageMoreIndexTopic(Map<String, Object> map) throws Exception{
		List<Topic> findAllMoreTopic = iTopicService.findAllTopic();
		map.put("selectMoreToptic", findAllMoreTopic);
		return new ModelAndView("pageMoreIndexTopic",map);
	}
//根据id查询今日话题及往期话题
	@GetMapping("/pageMoreIndexTopic1")
	public ModelAndView pageMoreIndexTopic1(Map<String, Object> map,@RequestParam Long id) throws Exception{
		Topic findAllMoreTopicById = iTopicService.selectById(id);
		map.put("selectMoreToptic1", findAllMoreTopicById);
		return new ModelAndView("pageModeIndexToptic1",map);
	}

//根据Id查询专家栏目及其他话题的详细内容
	@GetMapping("/pageProfessor")
	public ModelAndView pageProfessor(Map<String, Object> map,@RequestParam Long id) throws Exception{
		Professor selectByProfessorById = iProfessorService.selectById(id);
		map.put("selectProfessorId", selectByProfessorById);
		return new ModelAndView("pageProfessor",map);
	}

//MorePrefessor
	@GetMapping("/pageProfessorTopic")
	public ModelAndView pageProfessorTopic(Map<String, Object> map) throws Exception{
		List<Professor> findAllProfessor = iProfessorService.findAllProfessor();
		map.put("selectProfessorToptic", findAllProfessor);
		return new ModelAndView("pageProfessorTopic",map);
	}	

//查询今日或者往期,专家及其他话题
	@PostMapping("/pageSearchTopicAndProfessor")
	public ModelAndView pageSearchTopic(Map<String, Object> map,@RequestParam String topicString) throws Exception{
		List<Topic> searchTopic = iTopicService.findTopicByNameDim(topicString);
		List<Professor> searchProfessor = iProfessorService.selectProfessorByNameDim(topicString);
		List<Object> pageSearchList = new ArrayList<Object>();
		pageSearchList.addAll(searchTopic);
		pageSearchList.addAll(searchProfessor);
		System.out.println(pageSearchList);
		map.put("pageSearchTP", pageSearchList);
		return new ModelAndView("searchIndex",map);
	}
	
}
