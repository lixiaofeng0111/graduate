package edu.graduate.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.graduate.bean.LoginRegister;
import edu.graduate.service.ILoginRegisterService;
import edu.graduate.util.MsgResponse;

@RestController
@RequestMapping("/loginRegister")
public class LoginRegisterController {
	@Autowired
	/*
	 * 多态的使用：
	 * 面向接口编程的思想
	 * ILoginRegisterService loginRegisterService = new LoginRegisterService();
	 */
	private ILoginRegisterService loginRegisterService;   //注入对象
	
	
	@GetMapping("findAllLoginRegister")
	public MsgResponse findAllLoginRegister() {
		try {
			List<LoginRegister> list = loginRegisterService.findAllLoginRegister();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}










