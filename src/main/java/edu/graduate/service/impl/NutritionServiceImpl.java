package edu.graduate.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.Nutrition;
import edu.graduate.bean.NutritionExample;
import edu.graduate.bean.extend.NutritionVM;
import edu.graduate.dao.NutritionMapper;
import edu.graduate.dao.extend.NutritionVMMapper;
import edu.graduate.service.INutritionService;
@Service
public class NutritionServiceImpl implements INutritionService{
	@Autowired
	private NutritionMapper nutritionMapper;
	@Autowired
	private NutritionVMMapper nutritionVMMapper;
//查询操作
	@Override
	public List<Nutrition> findAllNutrition() throws Exception {
		NutritionExample example = new NutritionExample();
		return nutritionMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public Nutrition selectNutritionById(Long id) throws Exception {
		return nutritionMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<NutritionVM> selectAllNutritionVM() throws Exception {
		return nutritionVMMapper.selectAllNutritionVM();
	}

	@Override
	public NutritionVM selectNutritionVMById(Long id) throws Exception {
		return nutritionVMMapper.selectNutritionVMById(id);
	}

	@Override
	public List<NutritionVM> selectNutritionVMByKeyword(String keyword) throws Exception {
		return nutritionVMMapper.selectNutritionVMByKeyword(keyword);
	}

	@Override
	public List<NutritionVM> selectNutritionByFruitId(Long fruitId)throws Exception {
		return nutritionVMMapper.selectNutritionByFruitId(fruitId);
	}

//删除操作
	@Override
	public void deleteNutritionVMById(Long id) throws Exception {
		nutritionVMMapper.deleteNutritionVMById(id);
	}

	@Override
	public void batchDeleteNutritionVMById(Long[] ids) throws Exception {
		for(Long id : ids) {
			nutritionVMMapper.deleteNutritionVMById(id);
		}
	}

	@Override
	public List<NutritionVM> selectNutritionByPregnantDescriptionId(Integer pregnantDescriptionId)
			throws Exception {
		return nutritionVMMapper.selectNutritionByPregnantDescriptionId(pregnantDescriptionId);
	}

	@Override
	public Nutrition selectByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return nutritionMapper.selectByName(name);
	}

	@Override
	public void update(Nutrition nutrition) throws Exception {
		// TODO Auto-generated method stub
		nutritionMapper.updateByPrimaryKey(nutrition);
	}

	@Override
	public void saveNutrition(Nutrition nutrition) throws Exception {
		// TODO Auto-generated method stub
		nutritionMapper.insert(nutrition);
	}

	@Override
	public void delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		nutritionMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<NutritionVM> selectNutritionVMByName(String nutritionName) throws Exception {
		// TODO Auto-generated method stub
		return nutritionVMMapper.selectNutritionVMByName(nutritionName);
	}

	

}
