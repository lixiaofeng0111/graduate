package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.Yqbd;

public interface IYqbdService {
	
	List<Yqbd> selectAllYqbd() throws Exception;
	
	Yqbd selectById(int id) throws Exception;

}
