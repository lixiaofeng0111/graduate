package edu.graduate.service;

import edu.graduate.bean.Manager;

public interface IManagerService {
	
	Manager findManagerByName(String name) throws Exception;
	
	Manager selectById(Integer id) throws Exception;

}
