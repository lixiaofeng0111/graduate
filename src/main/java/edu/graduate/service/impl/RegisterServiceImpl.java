package edu.graduate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.LoginRegister;
import edu.graduate.dao.LoginRegisterMapper;
import edu.graduate.service.IRegisterService;
@Service
public class RegisterServiceImpl implements IRegisterService{
	@Autowired
	private LoginRegisterMapper loginRegisterMapper;
	/*
	 * 保存或修改用户信息
	 */
		@Override
		public void saveRegister(LoginRegister loginRegister) throws Exception {	
				loginRegisterMapper.insert(loginRegister);
		}
		@Override
		public LoginRegister findByName(String username) {
			return loginRegisterMapper.findLoginByName(username);
		}


}
