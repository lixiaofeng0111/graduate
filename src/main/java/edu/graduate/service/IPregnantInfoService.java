package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.PregnantInfo;
import edu.graduate.bean.extend.PregnantInfoVM;

public interface IPregnantInfoService {
//PregnantInfoVM
	/**
	 * 查询所有孕妈信息及其所需水果
	 * @return
	 * @throws Exception
	 */
	List<PregnantInfoVM> selectAllPregnantInfoVMs() throws Exception;
	
	/**
	 * 根据Id查询孕妈信息及其所需水果
	 * @param id
	 * @return
	 * @throws Exception
	 */
	PregnantInfoVM findByPreganInfoVMId(Long id) throws Exception;
	
	/**
	 * 根据孕妈信息Id查询水果信息
	 * @param pregnantInfoId
	 * @return
	 * @throws Exception
	 */
	List<PregnantInfoVM> selectFruitVMByPregnantInfoId(Long pregnantInfoId) throws Exception;
	
	/**
	 * 保存或修改孕妈信息及其所需水果
	 * @param preganInfoVM
	 */
	void saveOrUpdatePregnantVMInfo(PregnantInfoVM preganInfoVM);
	
	/**
	 * 插入孕妈信息及其所需水果
	 * @param preganInfoVM
	 * @throws Exception
	 */
	void insert(PregnantInfoVM preganInfoVM) throws Exception;
	
	/**
	 * 更新孕妈信息及其所需水果
	 * @param preganInfoVM
	 * @throws Exception
	 */
	void updatePregnantInfoVM(PregnantInfoVM preganInfoVM) throws Exception;
	
	/**
	 * 删除孕妈信息及其所需水果
	 * @param id
	 * @throws Exception
	 */
	void deletePregnantInfoVMById(Long id) throws Exception;
	
	/**
	 * 批量删除孕妈及所需水果信息
	 * @param ids
	 * @throws Exception
	 */
	void batchDeletePregnantInfoVMById(Long[] ids) throws Exception;
//PregnantInfo
	
	/**
	 * 查询所有孕妈信息
	 * @return
	 * @throws Exception
	 */
	List<PregnantInfo> selectPregnantInfo() throws Exception;
	
	/**
	 * 根据Id查询孕妈信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	PregnantInfo findPregnantInfoById(Long id) throws Exception;
	
	/**
	 * 保存或更新孕妈信息
	 * @param pregnantInfo
	 * @throws Exception
	 */
	void saveOrUpdatePregnantInfo(PregnantInfo pregnantInfo) throws Exception;
	
	
	/**
	 * 删除孕妈信息
	 * @param id
	 * @throws Exception
	 */
	void delete(Long id) throws Exception;
	
	/**
	 * 批量删除孕妈信息
	 * @param ids
	 * @throws Exception
	 */
	void batchDelete(Long[] ids) throws Exception;

	
	
}
