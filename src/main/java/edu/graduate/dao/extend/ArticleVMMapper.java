package edu.graduate.dao.extend;

import java.util.List;


import edu.graduate.bean.extend.ArticleVM;

public interface ArticleVMMapper {

//查询操作	
	
	List<ArticleVM> selectAllArticleVMs();
	
	ArticleVM findArticleVMById(Long id);
	
	List<ArticleVM> findArticleVMByKeyword(String keyword);


//删除操作
	
	void deleteArticleVMById(Long id);

	void batchDeleteArticleVM(Long[] ids);
	
	
//保存和修改操作
	void saveOrUpdateArticle(ArticleVM articleVM);
	
	void updateArticleVMByPrimaryKey(ArticleVM articleVM);

	List<ArticleVM> insertArticleVM(ArticleVM articleVM);


}
