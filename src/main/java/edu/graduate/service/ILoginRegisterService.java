package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.LoginRegister;

public interface ILoginRegisterService {
	/*
	 * 查询所有用户信息
	 */
	List<LoginRegister> findAllLoginRegister() throws Exception;

}
