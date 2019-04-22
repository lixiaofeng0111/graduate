package edu.graduate.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import edu.graduate.bean.Fruit;
import edu.graduate.bean.FruitExample;
import edu.graduate.bean.PregnantInfo;
import edu.graduate.bean.PregnantInfoExample;
import edu.graduate.bean.extend.PregnantInfoVM;
import edu.graduate.dao.FruitMapper;
import edu.graduate.dao.PregnantInfoMapper;
import edu.graduate.dao.extend.PregnantInfoVMMapper;
import edu.graduate.service.IPregnantInfoService;
@Service
public class PregnantInfoServiceImpl implements IPregnantInfoService{
	@Autowired
	private PregnantInfoVMMapper pregnantInfoVMMapper;
	@Autowired
	private PregnantInfoMapper pregnantInfoMapper;
	@Autowired
	private FruitMapper fruitMapper;

//PregnantInfoVM
	@Override
	public List<PregnantInfoVM> selectAllPregnantInfoVMs() throws Exception {
		return pregnantInfoVMMapper.selectAllPregnantInfoVMs();
	}

	@Override
	public PregnantInfoVM findByPreganInfoVMId(Long id) throws Exception {
		return pregnantInfoVMMapper.findByPreganInfoVMId(id);
	}
	
	@Override
	public List<PregnantInfoVM> selectFruitVMByPregnantInfoId(Long pregnantInfoId) throws Exception {
		return pregnantInfoVMMapper.selectFruitVMByPregnantInfoId(pregnantInfoId);
	}
	@Override
	public void saveOrUpdatePregnantVMInfo( @RequestParam PregnantInfoVM pregnantInfoVM) {
		//提取。。。分离s
		List<Fruit> fruits = pregnantInfoVM.getFruit();
		PregnantInfo pregnantInfo = new PregnantInfo();
		pregnantInfo.setId(pregnantInfoVM.getId());
		pregnantInfo.setPregnantweek(pregnantInfoVM.getPregnantweek());
		
		if(pregnantInfo.getId() != null) {   //修改
			pregnantInfoMapper.updateByPrimaryKey(pregnantInfo);
			FruitExample example = new FruitExample();
			example.createCriteria().andPregnantinfoIdEqualTo(pregnantInfo.getId());
			fruitMapper.deleteByExample(example);
			
			Long pregnantinfoId = pregnantInfo.getId();
			for(Fruit fruit : fruits) {
				fruit.setPregnantinfoId(pregnantinfoId);
				fruitMapper.insert(fruit);
			}
		}else {                             //保存
			pregnantInfoMapper.insert(pregnantInfo);
			
			Long pregnantinfoId = pregnantInfo.getId();
			for(Fruit fruit : fruits) {
				fruit.setPregnantinfoId(pregnantinfoId);
				fruitMapper.insert(fruit);
			}
		}
	}

	@Override
	public void insert(PregnantInfoVM preganInfoVM) throws Exception {
		pregnantInfoVMMapper.insert(preganInfoVM);
	}

	@Override
	public void updatePregnantInfoVM(PregnantInfoVM preganInfoVM) throws Exception {
		pregnantInfoVMMapper.updatePregnantInfoVM(preganInfoVM);
	}

	@Override
	public void deletePregnantInfoVMById(Long id) throws Exception {
		pregnantInfoVMMapper.deletePregnantInfoVMById(id);
		fruitMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDeletePregnantInfoVMById(Long[] ids) throws Exception {
		for(Long id : ids) {
			pregnantInfoVMMapper.deletePregnantInfoVMById(id);
		}
	}
//PregnantInfo

	@Override
	public List<PregnantInfo> selectPregnantInfo() throws Exception {
		PregnantInfoExample example = new PregnantInfoExample();
		return pregnantInfoMapper.selectByExample(example);
	}

	@Override
	public PregnantInfo findPregnantInfoById(Long id) throws Exception {
		return pregnantInfoMapper.selectByPrimaryKey(id);
	}


	@Override
	public void saveOrUpdatePregnantInfo(PregnantInfo pregnantInfo) throws Exception {
		if(pregnantInfo.getId() != null) {
			pregnantInfoMapper.updateByPrimaryKey(pregnantInfo);
		}
		else {
			pregnantInfoMapper.insert(pregnantInfo);
		}
	}

	@Override
	public void delete(Long id) throws Exception {
		pregnantInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDelete(Long[] ids) throws Exception {
		for(Long id : ids) {
			pregnantInfoMapper.deleteByPrimaryKey(id);
		}
	}
}
