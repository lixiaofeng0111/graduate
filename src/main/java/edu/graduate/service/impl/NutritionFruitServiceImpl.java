package edu.graduate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.NutritionFruit;
import edu.graduate.dao.NutritionFruitMapper;
import edu.graduate.service.INutritionFruitService;

@Service
public class NutritionFruitServiceImpl implements INutritionFruitService{
	@Autowired
	private NutritionFruitMapper nutritionFruitMapper;

	@Override
	public int insert(NutritionFruit nutritionFruit) {
		// TODO Auto-generated method stub
		return nutritionFruitMapper.insert(nutritionFruit);
	}

}
