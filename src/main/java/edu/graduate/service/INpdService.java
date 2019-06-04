package edu.graduate.service;

import edu.graduate.bean.Npd;


public interface INpdService {
	int insert(Npd npd) throws Exception;
	
	void deleteBypregnantDescriptionId(Integer id) throws Exception;

}
