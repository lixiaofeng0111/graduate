package edu.graduate.dao.extend;

import java.util.List;


import edu.graduate.bean.extend.ArticleVM;

public interface ArticleVMMapper {

//查询操作	
	
	/**
	 * @return all
	 */
	List<ArticleVM> selectAllArticleVMs();
	
	/**
	 * @param id
	 * @return
	 */
	ArticleVM findArticleVMById(Long id);
	
	/**
	 * 
	 * @param keyword(根据关键字进行查询)
	 * @return
	 */
	List<ArticleVM> findArticleVMByKeyword(String keyword);
	
	/**
	 * 通过推文 id 查找推文下的所有评价
	 * @param questionnaireId
	 * @return
	 */
	List<ArticleVM> selectCommentVMByArticleId(long articleId);
	
	

//删除操作
	
	/**
	 * 
	 * @param id(根据Id删除)
	 */
	void deleteArticleVMById(Long id);
	

}
