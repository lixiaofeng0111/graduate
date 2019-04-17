package edu.graduate.dao.extend;

import java.util.List;

import edu.graduate.bean.Article;
import edu.graduate.bean.extend.ArticleVM;

public interface ArticleVMMapper {

//查询操作	
	
	  //查询推文中的所有内容及用户的评论
	List<ArticleVM> findAll();
	
	
	  //根据id查询文章及用户评论的各项内容
	ArticleVM findArticleVMById(Long id);
	
	
	 // 根据关键字查询信息
	List<ArticleVM> findArticleVMsByKeyword(String keyword);


//删除操作
	
	 //根据Id删除推文内容
	void deleteArticleById(Long id);
	 //批量删除推文信息
	void batchDeleteArticle(Long[] ids);
	
	
//保存和修改操作
	void saveOrUpdateArticle(Article Article);
}
