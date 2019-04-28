package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.extend.FruitVM;

public interface IFruitService {
//查询操作
	List<FruitVM> selectAllFruitVM()  throws Exception;
	
	FruitVM selectFruitVMById(Long id)  throws Exception;
	
	List<FruitVM> selectFruitVMLikeKeyword(String keyword)  throws Exception;
	
	List<FruitVM> selectFruitByNutritionId(Long fruitId)  throws Exception;
	
//删除操作
	void deleteFruitVMById(Long id)  throws Exception;
	
	void batchDeleteFruitVMById(Long[] ids)  throws Exception;

}
