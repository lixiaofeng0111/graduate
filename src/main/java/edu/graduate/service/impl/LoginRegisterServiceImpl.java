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
	
	
/*
 * 查询所有用户信息
 */
	@Override
	public List<LoginRegister> findAllLoginRegister() throws Exception {
		LoginRegisterExample example = new LoginRegisterExample();
		
		return loginRegisterMapper.selectByExample(example);
	}

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

	@Override
	public LoginRegister findLoginRegisterById(Long id) throws Exception {
		return loginRegisterMapper.selectByPrimaryKey(id);
	}
	

}
