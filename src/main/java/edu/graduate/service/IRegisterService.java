package edu.graduate.service;

import edu.graduate.bean.LoginRegister;

public interface IRegisterService {
	/*
	 保存和修改用户信息
	 */
	void saveRegister(LoginRegister loginRegister) throws Exception;

	LoginRegister findByName(String name);

}
