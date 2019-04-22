package edu.graduate.service;

import java.util.List;


import edu.graduate.bean.Article;
import edu.graduate.bean.extend.ArticleVM;

public interface IArticleService {

//ArticleVM
	/**
	 * 查询所有推文及其评价
	 * @return
	 * @throws Exception
	 */
	List<ArticleVM> findAll() throws Exception;

	/**
	 * 根据Id查询推文及其评价
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ArticleVM findByArticleVMId(Long id) throws Exception;
	/**
	 * 根据推文Id查询推文下的所有评论信息
	 * @param articleId
	 * @return
	 */
	List<ArticleVM> selectCommentVMByArticleId(long articleId) throws Exception;

	/**
	 * 根据Id删除评价及其评论
	 * @param id
	 * @throws Exception
	 */
	void deleteArticleVMById(Long id) throws Exception;
	
	/**
	 * 通过关键字查询文件信息
	 * @param keyword
	 * @return
	 * @throws Exception
	 */
	List<ArticleVM> findArticleVMByKeyword(String keyword) throws Exception;
	/**
	 * 批量删除推文及其评论
	 * @param ids
	 * @throws Exception
	 */
	void batchDeleteArticleVM(Long[] ids) throws Exception;
	
	
	void saveOrUpdate(ArticleVM articleVM) throws Exception;

//Article
	/**
	 * 查询所有推文
	 * @return
	 * @throws Exception
	 */
	List<Article> findAllArticle() throws Exception;
	
	/**
	 * 根据Id查询推文信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Article findArticleById(Long id) throws Exception;
	
	/**
	 * 根据关键字查询文件信息
	 * @param keywords
	 * @return
	 * @throws Exception
	 */
	List<Article> findArticleByKeyword(String keywords) throws Exception;

	
	/**
	 * 保存和修改推文信息
	 * @param article
	 * @throws Exception
	 */
	void saveOrUpdateArticle(Article article) throws Exception;
	
	/**
	 * 根据Id删除推文信息
	 * @param id
	 * @throws Exception
	 */
	void deleteArticleById (Long id) throws Exception;
	
	/**
	 * 批量删除推文信息
	 * @param ids
	 * @throws Exception
	 */
	void batchDeleteArticle(Long ids[]) throws Exception;




}
