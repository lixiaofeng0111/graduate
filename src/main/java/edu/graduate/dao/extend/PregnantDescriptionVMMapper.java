package edu.graduate.dao.extend;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.graduate.bean.extend.PregnantDescriptionVM;

public interface PregnantDescriptionVMMapper {
	
	/*
	 * 查询
	 */
	List<PregnantDescriptionVM> selectAllPregnantDescriptionVM();
	
	
	//通过孕月自己的id查询自己的信息，并没有顺带Nutrition和Fruit的内容
	PregnantDescriptionVM selectDescriptionVMById(Integer id);
	
	//通过营养的Id查询孕月的信息
	List<PregnantDescriptionVM> selectDescriptionVMByNutritionId(Long id);
	
	
	//通过营养的名字查询孕月信息和水果信息
	List<PregnantDescriptionVM> selectDescriptionVMByNutritionName(@Param("nutritionName")String nutritionName);

}
