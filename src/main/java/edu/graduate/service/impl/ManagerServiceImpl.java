package edu.graduate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.Manager;
import edu.graduate.dao.ManagerMapper;
import edu.graduate.service.IManagerService;

@Service
public class ManagerServiceImpl implements IManagerService{
	@Autowired
	private ManagerMapper managerMapper;

	@Override
	public Manager findManagerByName(String name) throws Exception {
		return managerMapper.findManagerByName(name);
	}

	@Override
	public Manager selectById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return managerMapper.selectByPrimaryKey(id);
	}
	

}
