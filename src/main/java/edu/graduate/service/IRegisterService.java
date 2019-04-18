package edu.graduate.service;

import edu.graduate.bean.LoginRegister;

public interface IRegisterService {
	/*
	 保存和修改用户信息
	 */
	void saveOrUpdateLoginRegister(LoginRegister loginRegister) throws Exception;
	
	/*
	 * 删除用户信息
	 */
	void deleteLoginRegisterById(Long id) throws Exception;
	
	/*
	 * 批量删除用户信息
	 */
	void batchDeleteLoginRegister(Long[] ids) throws Exception;

}
