package edu.graduate.dao.extend;

import java.util.List;

import edu.graduate.bean.extend.ArticleVM;

public interface ArticleVMMapper {

//查询操作	
	/*
	 * 查询推文中的所有内容及用户的评论
	 */
	List<ArticleVM> findAll();
	
	/*
	 * 根据id查询文章及用户评论的各项内容
	 */
	ArticleVM findByArticleVMId(Long id);
	
	/*
	 * 根据关键字查询信息
	 */
	List<ArticleVM> findLikeKeyword(String keyword);


//删除操作
	
	/*
	 * 根据Id删除内容
	 */
	void deleteById(Long id);
	
	
//修改操作
	/*
	 * 根据id修改信息
	 */
	void updateById(Long id);
}
