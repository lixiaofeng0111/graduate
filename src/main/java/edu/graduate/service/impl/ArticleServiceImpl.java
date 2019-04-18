package edu.graduate.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.Article;
import edu.graduate.bean.ArticleExample;
import edu.graduate.bean.Comment;
import edu.graduate.bean.extend.ArticleVM;
import edu.graduate.dao.ArticleMapper;
import edu.graduate.dao.CommentMapper;
import edu.graduate.dao.extend.ArticleVMMapper;
import edu.graduate.service.IArticleService;
@Service
public class ArticleServiceImpl implements IArticleService{
	@Autowired 
	private ArticleVMMapper articleVMMapper;
	@Autowired
	private CommentMapper commentMapper;
	@Autowired 
	private ArticleMapper articleMapper;

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
	public void deleteArticleVMById(Long id) throws Exception {
		articleVMMapper.deleteArticleVMById(id);
	}

	@Override
	public void batchDeleteArticleVM(Long[] ids) throws Exception {
		for(Long id : ids) {
		articleVMMapper.deleteArticleVMById(id);
		}
	}
	
	@Override
	public void saveOrUpdataArticleVM(ArticleVM articleVM) throws Exception {
		if(articleVM.getId() != null) {
			articleVMMapper.updateArticleVMByPrimaryKey(articleVM);
			commentMapper.deleteByPrimaryKey(articleVM.getId());
			for(Comment comment : articleVM.getComments()) {
				comment.setArticleId(articleVM.getId());
				commentMapper.insert(comment);
			}
		}
			else {
				articleVMMapper.insertArticleVM(articleVM);
				for(Comment comment : articleVM.getComments()) {
					comment.setArticleId(articleVM.getId());
					commentMapper.insert(comment);
				}
			}
	}

	@Override
	public List<Article> findAllArticle() throws Exception {
		ArticleExample example = new ArticleExample();
		return articleMapper.selectByExample(example);
	}

	@Override
	public Article findArticleById(Long id) throws Exception {
		return articleMapper.selectByPrimaryKey(id);
	}

	@Override
	public void saveOrUpdateArticle(Article article) throws Exception {
		if(article.getId() != null) {
			articleMapper.updateByPrimaryKey(article);
		}else {
			articleMapper.insert(article);
		}
	}

	@Override
	public void deleteArticleById(Long id) throws Exception {
		articleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDeleteArticle(Long[] ids) throws Exception {
		for(Long id : ids) {
			articleMapper.deleteByPrimaryKey(id);
		}
	}


	
}
