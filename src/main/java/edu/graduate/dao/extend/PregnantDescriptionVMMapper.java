package edu.graduate.dao.extend;

import java.util.List;

import edu.graduate.bean.extend.PregnantDescriptionVM;

public interface PregnantDescriptionVMMapper {
	
	/*
	 * 查询
	 */
	List<PregnantDescriptionVM> selectAllPregnantDescriptionVM();
	
	
	PregnantDescriptionVM selectDescriptionVMById(Integer id);

}
