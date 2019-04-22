package edu.graduate.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.graduate.bean.LoginRegister;
import edu.graduate.service.IRegisterService;
import edu.graduate.util.MsgResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "注册相关接口")
@Controller
@RestController("/Register")
@EnableAutoConfiguration
public class RegisterController {
	@Autowired 
	private IRegisterService registerService;
	
	
	
	@ApiOperation(value = "保存或者更新用户信息", notes = "执行插入操作时不需要输入id，输入id时执行更新操作")
	@PostMapping("saveOrUpdateRegister")
	public MsgResponse saveOrUpdateRegister(LoginRegister loginRegister) {
		try {
			registerService.saveOrUpdateLoginRegister(loginRegister);
			return MsgResponse.success("Success", loginRegister);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}		
	}
	
	
	@ApiOperation(value = "根据Id删除用户信息", notes = "执行操作时直接输入id值进行修改")
	@PostMapping("deleteRegisterById")
	public MsgResponse deleteRegisterById(Long id) {
		try {
			registerService.deleteLoginRegisterById(id);
			return MsgResponse.success("Success", "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "批量删除用户信息", notes = "删除多个用户信息时以回车键隔开")
	@PostMapping("batchDeleteRegister")
	public MsgResponse batchDeleteRegister(Long[] ids) {
		try {
			registerService.batchDeleteLoginRegister(ids);
			return MsgResponse.success("Success", "批量删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
