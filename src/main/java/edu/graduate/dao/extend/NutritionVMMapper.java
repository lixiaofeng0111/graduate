package edu.graduate.dao.extend;

import java.util.List;

import edu.graduate.bean.extend.NutritionVM;

public interface NutritionVMMapper {
//各种查询操作
	/**
	 * 查询这种营养下的所有水果
	 * @return
	 */
	List<NutritionVM> selectAllNutritionVM();
	
	/**
	 * 根据Id查询营养下的水果信息
	 * @param id
	 * @return
	 */
	NutritionVM selectNutritionVMById(Long id);
	
	/**
	 * 根据关键字查询营养及包含此营养的水果信息
	 * @param keyword
	 * @return
	 */
	List<NutritionVM> selectNutritionVMByKeyword(String keyword);
	
	/**
	 * 根据桥表中Nutrition的Id查询此营养下的水果信息
	 * @param nutritionId
	 * @return
	 */
	List<NutritionVM> selectFruitsBynfId(Long nutritionId);

//删除操作
	/**
	 * 根据NutritionId信息删除营养信息及其所包含营养的水谷信息
	 * @param id
	 */
	void deleteNutritionVMById(Long id);
}
