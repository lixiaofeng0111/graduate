package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.graduate.bean.Article;
import edu.graduate.bean.ArticleExample;
import edu.graduate.bean.extend.ArticleVM;
import edu.graduate.dao.ArticleMapper;
import edu.graduate.dao.extend.ArticleVMMapper;
import edu.graduate.service.IArticleService;
@Service
public class ArticleServiceImpl implements IArticleService{
	@Autowired 
	private ArticleVMMapper articleVMMapper;
	@Autowired 
	private ArticleMapper articleMapper;
	/*
	 * @Autowired private CommentMapper commentMapper;
	 */
	
//ArticleVM
	@Override
	public List<ArticleVM> findAll() throws Exception {
		return articleVMMapper.selectAllArticleVMs();
	}

	@Override
	public ArticleVM findByArticleVMId(Long id) throws Exception {
		return articleVMMapper.findArticleVMById(id);
	}
	
	@Override
	public List<ArticleVM> findArticleVMByKeyword(String keyword) throws Exception {
		return articleVMMapper.findArticleVMByKeyword(keyword);
	}
	
	@Override
	public List<ArticleVM> selectCommentVMByArticleId(long articleId) throws Exception {
		return articleVMMapper.selectCommentVMByArticleId(articleId);
	}

	@Override
	public void deleteArticleVMById(Long id) throws Exception {
		articleVMMapper.deleteArticleVMById(id);
	}

	@Override
	public void batchDeleteArticleVM(Long[] ids) throws Exception {
		for(Long id : ids) {
		articleVMMapper.deleteArticleVMById(id);
		}
	}

	
//Article
	
	/**
	 * 查询所有推文信息
	 */
	@Override
	public List<Article> findAllArticle() throws Exception {
		ArticleExample example = new ArticleExample();
		return articleMapper.selectByExampleWithBLOBs(example);
	}

	/**
	 * 通过Id查询推文信息
	 */
	@Override
	public Article findArticleById(Long id) throws Exception {
		return articleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 保存和修改推文信息
	 */
	@Override
	public void saveOrUpdateArticle(Article article) throws Exception {
		if(article.getId() != null) {
			articleMapper.updateByPrimaryKeyWithBLOBs(article);
		}else {
			articleMapper.insert(article);
		}
	}

	/**
	 * 根据Id删除推文信息
	 */
	@Override
	public void deleteArticleById(Long id) throws Exception {
		articleMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 批量删除推文信息
	 */
	@Override
	public void batchDeleteArticle(Long[] ids) throws Exception {
		for(Long id : ids) {
			articleMapper.deleteByPrimaryKey(id);
		}
	}

	/**
	 * 通过关键字查询推文信息
	 */
	@Override
	public List<Article> findArticleByKeyword(String keywords) throws Exception {
		ArticleExample example = new ArticleExample();
		example.createCriteria().andNameLike(keywords);
		return articleMapper.selectByExampleWithBLOBs(example);
	}

	

	
}
