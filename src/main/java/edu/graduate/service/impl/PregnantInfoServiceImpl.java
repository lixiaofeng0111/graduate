package edu.graduate.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
	public void saveOrUpdatePregnantVMInfo(PregnantInfoVM pregnantInfoVM) {
		//1.分离PregnantInfoVM，从中获取到PregnantInfo和Fruit
			//1.1从PregnantInfoVM中获取到Fruit
		List<Fruit> fruits = pregnantInfoVM.getFruit();
			//1.2   从PregnantInfoVM中获取到PregnantInfo
		PregnantInfo pregnantInfo = new PregnantInfo();
		pregnantInfo.setId(pregnantInfoVM.getId());
		pregnantInfo.setPregnantweek(pregnantInfoVM.getPregnantweek());
		
		//PregnantInfo 妊娠女性的对象，Fruit 妊娠女性每个阶段需要的水果
		//2.判断保存还是修改
		if(pregnantInfo.getId() == null) {  //保存
			//2.1 先保存妊娠女性的信息
			pregnantInfoMapper.insert(pregnantInfo);
			//**如何获取刚刚插入到妊娠女性的Id
			long pregnantinfoId = pregnantInfo.getId();
			for(Fruit fruit : fruits) {
				//为每个fruit设置Pregnant_id
				fruit.setPregnantinfoId(pregnantinfoId);
				fruitMapper.insert(fruit);
			}
		}
			//2.2否则的话修改妊娠女性信息
		else {
				//2.2.1 修改妊娠女性信息
			pregnantInfoMapper.updateByPrimaryKey(pregnantInfo);
				//2.2.2 修改关于妊娠周期的水果信息
				//1.删除原有水果信息
						//按照模板删除,可以拿到Id
			FruitExample example = new FruitExample();
			example.createCriteria().andPregnantinfoIdEqualTo(pregnantInfo.getId());
			fruitMapper.deleteByExample(example);
				//2.重新添加水果信息
			long pregnantinfoId = pregnantInfo.getId();
			for(Fruit fruit : fruits) {
				//为每个fruit设置Pregnant_id
				fruit.setPregnantinfoId(pregnantinfoId);
				//保存水果信息
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
