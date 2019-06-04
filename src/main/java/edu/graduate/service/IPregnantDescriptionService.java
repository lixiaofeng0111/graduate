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
	
	//根据营养Id查询孕月的信息
	List<PregnantDescriptionVM> selectDescriptionVMByNutritionId(Long id) throws Exception;
	
	//根据营养名字查询孕月的相关信息
	List<PregnantDescriptionVM> selectDescriptionVMByNutritionName(String nutritionName) throws Exception;
	
	void update(PregnantDescription pregnantDescription) throws Exception;
	  
	void savePregnantDescription(PregnantDescription pregnantDescription) throws Exception;
	  
	void delete(Integer id) throws Exception;
	
	List<PregnantDescriptionVM> selectByDName(String descriptionName) throws Exception;
	
	//插入孕月的数据和相关桥表中的数据
	void insertQiao(PregnantDescriptionVM pregnantDescriptionVM) throws Exception;

}
