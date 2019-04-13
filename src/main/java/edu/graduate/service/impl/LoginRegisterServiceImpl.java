package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.LoginRegister;
import edu.graduate.bean.LoginRegisterExample;
import edu.graduate.dao.LoginRegisterMapper;
import edu.graduate.service.ILoginRegisterService;

@Service
public class LoginRegisterServiceImpl implements ILoginRegisterService{
	@Autowired
	private LoginRegisterMapper loginRegisterMapper;

	@Override
	public List<LoginRegister> findAllLoginRegister() throws Exception {
		LoginRegisterExample example = new LoginRegisterExample();
		
		return loginRegisterMapper.selectByExample(example);
	}
	

}
