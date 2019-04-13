package edu.graduate.bean.extend;

import edu.graduate.bean.Article;
import edu.graduate.bean.LoginRegister;

public class CommentVM {
	private int id;
	private String desc;
	private int score;
	
	/* 
	 
	 类之间的一对多关系 ：
	comment(username)------> loginRegister(username)
	comment(article_id) ------> article(id)
	 
	 */
	private LoginRegister loginRegister;
	private Article article;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public LoginRegister getLoginRegister() {
		return loginRegister;
	}
	public void setLoginRegister(LoginRegister loginRegister) {
		this.loginRegister = loginRegister;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}	
}
