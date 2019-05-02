package edu.graduate.web.controller;



import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.graduate.bean.LoginRegister;
import edu.graduate.service.ILoginService;

@RestController
public class LoginController {
	
	@Autowired
	private ILoginService loginService;
	
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
	public ModelAndView pageindex() {
		return new ModelAndView("index");
	}
}
