package edu.graduate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.LoginRegister;
import edu.graduate.dao.LoginRegisterMapper;
import edu.graduate.service.IRegisterService;
@Service
public class RegisterService implements IRegisterService{
	@Autowired
	private LoginRegisterMapper loginRegisterMapper;
	/*
	 * 保存或修改用户信息
	 */
		@Override
		public void saveOrUpdateLoginRegister(LoginRegister loginRegister) throws Exception {
			if(loginRegister.getId() != null) {
				loginRegisterMapper.updateByPrimaryKey(loginRegister);
			}else {
				loginRegisterMapper.insert(loginRegister);
			}
			
		}

	/*
	 * 删除用户信息
	 */
		@Override
		public void deleteLoginRegisterById(Long id) throws Exception {
			loginRegisterMapper.deleteByPrimaryKey(id);
			
		}

	/*
	 * 批量删除用户信息
	 */
		@Override
		public void batchDeleteLoginRegister(Long[] ids) throws Exception {
			for(Long id : ids) {
				loginRegisterMapper.deleteByPrimaryKey(id);
			}
			
		}

}
