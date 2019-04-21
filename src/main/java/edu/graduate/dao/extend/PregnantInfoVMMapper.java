package edu.graduate.dao.extend;

import java.util.List;


import edu.graduate.bean.extend.PregnantInfoVM;

public interface PregnantInfoVMMapper {
	
	//查询操作	
		/*
		 * 查询所有信息
		 */
		List<PregnantInfoVM> selectAllPregnantInfoVMs();
		
		/*
		 * 根据id查询信息
		 */
		PregnantInfoVM findByPreganInfoVMId(Long id);
		
		/*
		 * 根据孕妈Id查询水果的信息
		 */
		List<PregnantInfoVM> selectFruitVMByPregnantInfoId(Long pregnantInfoId);

	//添加操作
		/*
		 * 增加信息
		 */
		void insert(PregnantInfoVM preganInfoVM);
	//修改操作
		/*
		 * 修改孕妈信息及每阶段所需要水果
		 */
		void updatePregnantInfoVM(PregnantInfoVM preganInfoVM);

	//删除操作
		/*
		 * 根据Id删除信息
		 */
		void deletePregnantInfoVMById(Long id);
}
