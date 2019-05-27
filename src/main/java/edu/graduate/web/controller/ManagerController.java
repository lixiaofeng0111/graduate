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

import edu.graduate.bean.LoginRegister;
import edu.graduate.bean.Manager;
import edu.graduate.service.ILoginService;
import edu.graduate.service.IManagerService;
import edu.graduate.service.IRegisterService;

@RestController
public class ManagerController {
	@Autowired
	private IManagerService iManagerService;
	
	@Autowired
	private ILoginService iLoginService;
	
	@Autowired
	private IRegisterService registerService;
	
	@GetMapping("/manager")
	public ModelAndView login(Map<String, Object> map) {
		return new ModelAndView("admin/login",map);
	}
/*
 以下是后端管理员的登录方法
 */
	@PostMapping("/checkManager")
	public void checkLogin(HttpServletRequest request,HttpServletResponse response)  {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String result;
		try {
			Manager managerUsername = iManagerService.findManagerByName(username);
			if(managerUsername == null) {
				result = "用户名错误，请重新输入！";
			}else if(password.equals(managerUsername.getPassword())) {
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
	
	
	@GetMapping("/managerLogin")
	public ModelAndView managerLogin(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception {
		
		PageHelper.startPage(page, 5);
		List<LoginRegister> selectAllLogin = iLoginService.findAllLogin();
		PageInfo<LoginRegister> pageInfoUser = new PageInfo<>(selectAllLogin);
		List<LoginRegister> pageListUser = pageInfoUser.getList();
		
		map.put("currentPage",page);
		map.put("totalPage", pageInfoUser.getPages());   //获取总页面		
		map.put("managerUser", pageListUser);
		return new ModelAndView("admin/managerUser",map);
	}
//以下是添加的验证
	@PostMapping("/checkAddUser")
	public void saveRegister(HttpServletRequest request , HttpServletResponse response) throws Exception {
		
		String result = "";
		String username = request.getParameter("username");
		LoginRegister register = registerService.findByName(username);
		if(register!=null) {
			result = "该用户已经被注册，请重新输入用户名！";
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(result);
		}
		else {
		String password = request.getParameter("password");
	    String age1 = request.getParameter("age"); 
	    Integer age=Integer.parseInt(age1);
		String sex = request.getParameter("sex");
		String address = request.getParameter("address");
		
		LoginRegister loginRegister = new LoginRegister();
		loginRegister.setUsername(username);
		loginRegister.setPassword(password);
		loginRegister.setAge(age);
		loginRegister.setSex(sex);
		loginRegister.setAddress(address);
		
		registerService.saveRegister(loginRegister);

		result = "ok";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(result);
		}
	}
//以下是用户的编辑内容
	@GetMapping("/editSelectById")
	public ModelAndView editSelectById(Map<String, Object> map,@RequestParam Long id) throws Exception{
		LoginRegister selectUserById = iLoginService.selectById(id);
		map.put("editSelectById",selectUserById);
		return new ModelAndView("admin/editUser",map);
	}
	
//以下使用户修改验证内容	
	@PostMapping("/checkUpdateUser")
	public void checkUpdateUser(LoginRegister loginRegister,HttpServletResponse response)  {
		String result = "";
		try {
			System.out.println(loginRegister);
			iLoginService.update(loginRegister);
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
//以下是用户删除内容	
	@GetMapping("/deleteUserById")
	public ModelAndView deleteUserById(@RequestParam(value = "page", defaultValue = "1") Integer page,HttpServletRequest request,@RequestParam Long id,Map<String, Object> map) throws Exception{
		iLoginService.deleteUserById(id);
		return managerLogin(page,request,map);
	}
	
//以下是用户批量删除内容
	@PostMapping("/batchdeleteUserById")
	public ModelAndView batchDelete(@RequestParam String userList,HttpServletRequest request,Map<String, Object> map) throws Exception{
	    System.out.println(userList);
		String[] strs = userList.split(",");
	    for (int i = 0; i < strs.length; i++) {
	    	iLoginService.deleteUserById(Long.parseLong(strs[i])); 
	    }
	    return managerLogin(1,request,map);
	}

}
