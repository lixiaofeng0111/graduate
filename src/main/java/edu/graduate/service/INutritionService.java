package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.extend.NutritionVM;

public interface INutritionService {
//查询操作
	List<NutritionVM> selectAllNutritionVM()  throws Exception;
	
	NutritionVM selectNutritionVMById(Long id) throws Exception;
	
	List<NutritionVM> selectNutritionVMByKeyword(String keyword) throws Exception;
	
	List<NutritionVM> selectNutritionByFruitId(Long nutritionId) throws Exception;
	
//删除操作
	void deleteNutritionVMById(Long id) throws Exception;
	
	void batchDeleteNutritionVMById(Long[] ids) throws Exception;
}
