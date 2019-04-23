package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.extend.FruitVM;
import edu.graduate.dao.extend.FruitVMMapper;
import edu.graduate.service.IFruitService;
@Service
public class FruitServiceImpl implements IFruitService{
	@Autowired
	private FruitVMMapper fruitVMMapper;

//查询操作
	@Override
	public List<FruitVM> selectAllFruitVM() throws Exception {
		return fruitVMMapper.selectAllFruitVM();
	}

	@Override
	public FruitVM selectFruitVMById(Long id) throws Exception {
		return fruitVMMapper.selectFruitVMById(id);
	}

	@Override
	public List<FruitVM> selectFruitVMLikeKeyword(String keyword) throws Exception {
		return fruitVMMapper.selectFruitVMLikeKeyword(keyword);
	}

	@Override
	public List<FruitVM> selectNutritionsBynfId(Long fruitId) throws Exception {
		return fruitVMMapper.selectNutritionsBynfId(fruitId);
	}

//保存和修改操作
	@Override
	public void saveOrUpdateFruitVM(FruitVM fruitVM) throws Exception {
		// TODO Auto-generated method stub
		
	}

//删除操作
	@Override
	public void deleteFruitVMById(Long id) throws Exception {
		fruitVMMapper.deleteFruitVMById(id);
	}

	@Override
	public void batchDeleteFruitVMById(Long[] ids) throws Exception {
		for(Long id : ids) {
			fruitVMMapper.deleteFruitVMById(id);
		}
	}

}
