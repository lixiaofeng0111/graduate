package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.extend.NutritionVM;
import edu.graduate.dao.extend.NutritionVMMapper;
import edu.graduate.service.INutritionService;
@Service
public class NutritionServiceImpl implements INutritionService{
	@Autowired
	private NutritionVMMapper nutritionVMMapper;
//查询操作
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
	public List<NutritionVM> selectFruitsBynfId(Long nutritionId) throws Exception {
		return nutritionVMMapper.selectFruitsBynfId(nutritionId);
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

}
