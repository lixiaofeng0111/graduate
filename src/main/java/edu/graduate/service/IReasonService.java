package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.Reason;

public interface IReasonService {
	
	List<Reason> findAllReason() throws Exception;
	
	Reason selectReasonById(Integer id) throws Exception;
	
	void saveReason(Reason Reason) throws Exception;
	
	void update(Reason Reason) throws Exception;
	
	void delete(Integer id) throws Exception;
	

}
