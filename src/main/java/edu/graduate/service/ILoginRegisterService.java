package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.LoginRegister;

public interface ILoginRegisterService {
	
	/*
	 保存和修改用户信息
	 */
	void saveOrUpdateLoginRegister(LoginRegister loginRegister) throws Exception;
	
	/*
	 * 查询所有用户信息
	 */
	List<LoginRegister> findAllLoginRegister() throws Exception;
	
	LoginRegister findLoginRegisterById(Long id) throws Exception;
	
	/*
	 * 删除用户信息
	 */
	void deleteLoginRegisterById(Long id) throws Exception;
	
	/*
	 * 批量删除用户信息
	 */
	void batchDeleteLoginRegister(Long[] ids) throws Exception;
	
	
	

}
