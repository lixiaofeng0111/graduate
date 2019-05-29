package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.Kind;

public interface IKindService {
	
	List<Kind> selectAllKind() throws Exception;
	
	Kind selectKindById(Long id) throws Exception;
	
	Kind selectKindByKind(String kind) throws Exception;
	
	List<Kind>  selectByKindDim(String kindString) throws Exception;
	
	void update(Kind kind) throws Exception;
	  
	void saveKind(Kind kind) throws Exception;
	  
	void delete(Long id) throws Exception;
	
	

}
