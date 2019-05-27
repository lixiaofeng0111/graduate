package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.Yqbd;

public interface IYqbdService {
	
	List<Yqbd> selectAllYqbd() throws Exception;
	
	Yqbd selectById(int id) throws Exception;
	
	Yqbd selectByName(String name) throws Exception;
	
	void update(Yqbd yqbd) throws Exception;
	
	void saveYqbd(Yqbd yqbd) throws Exception;
	
	void delete(Integer id) throws Exception;

}
