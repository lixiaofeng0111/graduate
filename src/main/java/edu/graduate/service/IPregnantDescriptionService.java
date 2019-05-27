package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.PregnantDescription;
import edu.graduate.bean.extend.PregnantDescriptionVM;

public interface IPregnantDescriptionService {
	
	List<PregnantDescription> selectAllPregnantDescriptions() throws Exception;
	
	List<PregnantDescriptionVM> selectAllPregnantDescriptionVM() throws Exception;
	
	PregnantDescriptionVM selectDescriptionVMById(Integer id) throws Exception;
	
	PregnantDescription selectById(Integer id) throws Exception;
	
	PregnantDescription selectByTime(String time) throws Exception;
	
	void update(PregnantDescription pregnantDescription) throws Exception;
	  
	void savePregnantDescription(PregnantDescription pregnantDescription) throws Exception;
	  
	void delete(Integer id) throws Exception;

}
