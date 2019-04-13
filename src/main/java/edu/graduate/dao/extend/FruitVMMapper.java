package edu.graduate.dao.extend;

import java.util.List;

import edu.graduate.bean.extend.FruitVM;

public interface FruitVMMapper {
	//查询操作	
		/*
		 * 查询所有信息
		 */
		List<FruitVM> findAll();
		
		/*
		 * 根据id查询信息
		 */
		FruitVM findByFruitVMId(Long id);
		
		/*
		 * 根据关键字查询信息
		 */
		List<FruitVM> findLikeKeyword(String keyword);
		
		

	//删除操作
		/*
		 * 删除所有信息
		 */
		void deleteAll();
		
		/*
		 * 根据Id删除内容
		 */
		void deleteById(Long id);

	//添加操作
		/*
		 * 增加信息
		 */
		void insert(FruitVM fruitVM);
		
	//修改操作
		/*
		 * 根据id修改信息
		 */
		void updateById(Long id);

}
