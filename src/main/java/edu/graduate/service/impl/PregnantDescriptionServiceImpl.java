package edu.graduate.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.PregnantDescription;
import edu.graduate.bean.PregnantDescriptionExample;
import edu.graduate.bean.extend.PregnantDescriptionVM;
import edu.graduate.dao.PregnantDescriptionMapper;
import edu.graduate.dao.extend.PregnantDescriptionVMMapper;
import edu.graduate.service.IPregnantDescriptionService;

@Service
public class PregnantDescriptionServiceImpl implements IPregnantDescriptionService{
	
	@Autowired
	private PregnantDescriptionMapper pregnantDescriptionMapper;
	
	@Autowired
	private PregnantDescriptionVMMapper pregnantDescriptionVMMapper;

	@Override
	public List<PregnantDescription> selectAllPregnantDescriptions() throws Exception {
		PregnantDescriptionExample example = new PregnantDescriptionExample();
		return pregnantDescriptionMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<PregnantDescriptionVM> selectAllPregnantDescriptionVM() throws Exception {
		return pregnantDescriptionVMMapper.selectAllPregnantDescriptionVM();
	}

	@Override
	public PregnantDescriptionVM selectDescriptionVMById(Integer id) throws Exception {
		return pregnantDescriptionVMMapper.selectDescriptionVMById(id);
	}

	@Override
	public PregnantDescription selectById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return pregnantDescriptionMapper.selectByPrimaryKey(id);
	}

	@Override
	public PregnantDescription selectByTime(String time) throws Exception {
		// TODO Auto-generated method stub
		return pregnantDescriptionMapper.selectByTime(time);
	}

	@Override
	public void update(PregnantDescription pregnantDescription) throws Exception {
		// TODO Auto-generated method stub
		pregnantDescriptionMapper.updateByPrimaryKey(pregnantDescription);
	}

	@Override
	public void savePregnantDescription(PregnantDescription pregnantDescription) throws Exception {
		// TODO Auto-generated method stub
		pregnantDescriptionMapper.insert(pregnantDescription);
	}

	@Override
	public void delete(Integer id) throws Exception {
		// TODO Auto-generated method stub
		pregnantDescriptionMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<PregnantDescriptionVM> selectDescriptionVMByNutritionId(Long id) throws Exception {
		// TODO Auto-generated method stub
		return pregnantDescriptionVMMapper.selectDescriptionVMByNutritionId(id);
	}

	@Override
	public List<PregnantDescriptionVM> selectDescriptionVMByNutritionName(String nutritionName) throws Exception {
		// TODO Auto-generated method stub
		return pregnantDescriptionVMMapper.selectDescriptionVMByNutritionName(nutritionName);
	}

	@Override
	public List<PregnantDescriptionVM> selectByDName(String descriptionName) throws Exception {
		// TODO Auto-generated method stub
		return pregnantDescriptionVMMapper.selectByDName(descriptionName);
	}

	@Override
	public void insertQiao(PregnantDescriptionVM pregnantDescriptionVM) throws Exception {
		// TODO Auto-generated method stub
		pregnantDescriptionVMMapper.insertQiao(pregnantDescriptionVM);
	}

	
}
