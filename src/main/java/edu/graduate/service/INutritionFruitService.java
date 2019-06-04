package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.NutritionFruit;

public interface INutritionFruitService {
	int insert(NutritionFruit nutritionFruit);
	
	int updateByPrimaryKey(NutritionFruit nutritionFruit);
	
	List<NutritionFruit> selectQiaoId(Long id) throws Exception;
	
	void deleteByFruitId(Long fruitId) throws Exception;

}
