package edu.graduate.service.impl;

import java.util.List;

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

	@Override
	public int updateByPrimaryKey(NutritionFruit nutritionFruit) {
		// TODO Auto-generated method stub
		return nutritionFruitMapper.updateByPrimaryKey(nutritionFruit);
	}

	@Override
	public List<NutritionFruit> selectQiaoId(Long id) throws Exception {
		// TODO Auto-generated method stub
		return nutritionFruitMapper.selectQiaoId(id);
	}

	@Override
	public void deleteByFruitId(Long fruitId) throws Exception {
		// TODO Auto-generated method stub
		nutritionFruitMapper.deleteByFruitId(fruitId);
	}

}
