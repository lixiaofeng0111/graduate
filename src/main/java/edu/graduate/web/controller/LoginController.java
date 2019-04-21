package edu.graduate.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.graduate.bean.LoginRegister;
import edu.graduate.service.ILoginRegisterService;
import edu.graduate.util.MsgResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "登录相关接口")
@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	/*
	 * 多态的使用：
	 * 面向接口编程的思想
	 * ILoginRegisterService loginRegisterService = new LoginRegisterService();
	 */
	private ILoginRegisterService loginRegisterService;   //注入对象
	
	@ApiOperation(value = "查询所有用户信息")
	@GetMapping("findAllLogin")
	public MsgResponse findAllLogin() {
		try {
			List<LoginRegister> list = loginRegisterService.findAllLoginRegister();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "根据Id查询一个用户信息")
	@GetMapping("findLoginById")
	public MsgResponse findLoginById(Long id) {
		try {
			LoginRegister loginRegister = loginRegisterService.findLoginRegisterById(id);
			return MsgResponse.success("Success", loginRegister);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}










