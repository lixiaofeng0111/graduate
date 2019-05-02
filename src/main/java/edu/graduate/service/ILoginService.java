package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.LoginRegister;

public interface ILoginService {	
	/*
	 * 查询所有用户信息
	 */
	List<LoginRegister> findAllLogin() throws Exception;
	
	LoginRegister findLoginByName(String username) throws Exception;
	
	
	
	
	

}
