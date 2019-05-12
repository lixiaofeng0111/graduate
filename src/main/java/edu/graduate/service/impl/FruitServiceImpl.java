package edu.graduate.service.impl;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.Fruit;
import edu.graduate.bean.FruitExample;
import edu.graduate.bean.extend.FruitVM;
import edu.graduate.dao.FruitMapper;
import edu.graduate.dao.extend.FruitVMMapper;
import edu.graduate.service.IFruitService;
@Service
public class FruitServiceImpl implements IFruitService{
	@Autowired
	private FruitVMMapper fruitVMMapper;
	
	@Autowired
	private FruitMapper FruitMapper;

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
	public List<FruitVM> selectFruitByNutritionId(Long fruitId) throws Exception {
		return fruitVMMapper.selectFruitByNutritionId(fruitId);
	}
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

	@Override
	public List<Fruit> findAllFruit() throws Exception {
		FruitExample example = new FruitExample();
		// TODO Auto-generated method stub
		return FruitMapper.selectByExample(example);
	}


//查询操作
	

	

}
