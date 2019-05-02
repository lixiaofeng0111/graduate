package edu.graduate.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.LoginRegister;
import edu.graduate.bean.LoginRegisterExample;
import edu.graduate.dao.LoginRegisterMapper;
import edu.graduate.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService{
	@Autowired
	private LoginRegisterMapper loginRegisterMapper;
	
/*
 * 查询所有用户信息
 */
	@Override
	public List<LoginRegister> findAllLogin() throws Exception {
		LoginRegisterExample example = new LoginRegisterExample();
		
		return loginRegisterMapper.selectByExample(example);
	}

	@Override
	public LoginRegister findLoginByName(String username) throws Exception {
		return loginRegisterMapper.findLoginByName(username);
	}

}
