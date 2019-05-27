package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.PregnantAnalysis;

public interface IPregnantAnalysisService {
	
	List<PregnantAnalysis> selectAllPregnantAnalysis() throws Exception;
	
	PregnantAnalysis selectPregnantAnalysisById(Integer id) throws Exception;
	
	List<PregnantAnalysis> selectPregnantAnalysisByKindId(Long id) throws Exception;
	
	PregnantAnalysis selectByName(String name) throws Exception;
	
	PregnantAnalysis selectKindByKindId(Long kindId) throws Exception;
	
	void update(PregnantAnalysis pregnantAnalysis) throws Exception;
	
	void savePregnantAnalysis(PregnantAnalysis pregnantAnalysis) throws Exception;
	
	void delete(Integer id) throws Exception;
	

}
