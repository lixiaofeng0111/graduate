package edu.graduate.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.graduate.bean.LoginRegister;
import edu.graduate.service.ILoginRegisterService;
import edu.graduate.util.MsgResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "登录注册相关接口")
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
	
	@ApiOperation(value = "查询所有用户信息")
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
	
	@ApiOperation(value = "根据Id查询一个用户信息")
	@GetMapping("findLoginRegisterById")
	public MsgResponse findLoginRegisterById(Long id) {
		try {
			LoginRegister loginRegister = loginRegisterService.findLoginRegisterById(id);
			return MsgResponse.success("Success", loginRegister);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	
	@ApiOperation(value = "保存或者更新用户信息", notes = "执行插入操作时不需要输入id，输入id时执行更新操作")
	@PostMapping("saveOrUpdateLoginRegister")
	public MsgResponse saveOrUpdateLoginRegister(LoginRegister loginRegister) {
		try {
			loginRegisterService.saveOrUpdateLoginRegister(loginRegister);
			return MsgResponse.success("Success", loginRegister);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}		
	}
	
	
	@ApiOperation(value = "根据Id删除用户信息", notes = "执行操作时直接输入id值进行修改")
	@PostMapping("deleteLoginRegisterById")
	public MsgResponse deleteLoginRegisterById(Long id) {
		try {
			loginRegisterService.deleteLoginRegisterById(id);
			return MsgResponse.success("Success", "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "批量删除用户信息", notes = "删除多个用户信息时以回车键隔开")
	@PostMapping("batchDeleteLoginRegister")
	public MsgResponse batchDeleteLoginRegister(Long[] ids) {
		try {
			loginRegisterService.batchDeleteLoginRegister(ids);
			return MsgResponse.success("Success", "批量删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}










