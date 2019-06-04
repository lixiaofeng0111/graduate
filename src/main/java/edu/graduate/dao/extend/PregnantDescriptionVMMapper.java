package edu.graduate.dao.extend;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.graduate.bean.extend.PregnantDescriptionVM;

public interface PregnantDescriptionVMMapper {
	//孕月表和桥表的插入部分
	void insertQiao(PregnantDescriptionVM pregnantDescriptionVM);
	
	/*
	 * 查询
	 */
	List<PregnantDescriptionVM> selectAllPregnantDescriptionVM();
	
	
	//通过孕月自己的id查询自己的信息，并没有顺带Nutrition和Fruit的内容
	//通过水果的Id查营养（直接添加营养得到时候PS：NutritionVM的内容），这里可以通过孕月的Id查询营养的信息(营养缺少通过孕月的Id查询营养)
	PregnantDescriptionVM selectDescriptionVMById(Integer id);
	
	//通过营养的Id查询孕月的信息
	List<PregnantDescriptionVM> selectDescriptionVMByNutritionId(Long id);
	
	
	//通过营养的名字查询孕月信息和水果信息
	List<PregnantDescriptionVM> selectDescriptionVMByNutritionName(@Param("nutritionName")String nutritionName);

	
	
	List<PregnantDescriptionVM> selectByDName(@Param("descriptionName")String descriptionName);
}
