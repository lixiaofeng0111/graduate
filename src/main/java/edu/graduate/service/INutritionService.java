package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.Nutrition;
import edu.graduate.bean.extend.NutritionVM;

public interface INutritionService {
//查询操作
	List<Nutrition> findAllNutrition() throws Exception;
	
	Nutrition selectNutritionById(Long id) throws Exception;
	
	Nutrition selectByName(String name) throws Exception;
	
	void update(Nutrition nutrition) throws Exception;
	
	void saveNutrition(Nutrition nutrition) throws Exception;
	
	void delete(Long id) throws Exception;
	
	List<NutritionVM> selectAllNutritionVM()  throws Exception;
	
	NutritionVM selectNutritionVMById(Long id) throws Exception;
	
	List<NutritionVM> selectNutritionVMByKeyword(String keyword) throws Exception;
	
	List<NutritionVM> selectNutritionByFruitId(Long nutritionId) throws Exception;
	
	List<NutritionVM> selectNutritionByPregnantDescriptionId(Integer pregnantDescriptionId) throws Exception;
	
	List<NutritionVM> selectNutritionVMByName(String nutritionName) throws Exception;
//删除操作
	void deleteNutritionVMById(Long id) throws Exception;
	
	void batchDeleteNutritionVMById(Long[] ids) throws Exception;
}
