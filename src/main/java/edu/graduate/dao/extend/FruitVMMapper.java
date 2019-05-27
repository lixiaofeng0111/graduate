package edu.graduate.dao.extend;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.graduate.bean.extend.FruitVM;

public interface FruitVMMapper {
	//查询操作	
		/**
		 * 查询所有水果及其包含的营养信息
		 * @return
		 */
		List<FruitVM> selectAllFruitVM();
		
		/**
		 * 根据Id查询信息
		 * @param id
		 * @return
		 */
		FruitVM selectFruitVMById(Long id);
		
		/**
		 * 根据关键字查询信息
		 * @param keyword
		 * @return
		 */
		List<FruitVM> selectFruitVMLikeKeyword(String keyword);
		
		/**
		 * 根据桥表中的Id查询信息
		 * @param fruitId
		 * @return
		 */
		List<FruitVM> selectFruitByNutritionId(Long NutritionId);
		
		
	//删除操作
		/**
		 * 根据FruitId删除水果中的信息
		 * @param id
		 */
		void deleteFruitVMById(Long id);
		
	//根据名字查询水果及其营养成分和能吃不能吃的原因
		
		List<FruitVM> selectFruitVMByName(@Param("fruitName")String fruitName);

}
