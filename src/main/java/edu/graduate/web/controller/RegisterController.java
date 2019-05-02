package edu.graduate.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.graduate.bean.LoginRegister;
import edu.graduate.service.IRegisterService;

@RestController
public class RegisterController {
	@Autowired 
	private IRegisterService registerService;

	@PostMapping("/register")
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
}
