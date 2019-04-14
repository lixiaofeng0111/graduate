package edu.graduate.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.graduate.bean.Article;
import edu.graduate.bean.extend.ArticleVM;
import edu.graduate.service.IArticleService;
import edu.graduate.util.MsgResponse;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/article")

public class ArticleController {
	/*
	 * @Autowired private IArticleService articleService;
	 * 
	 *//**
		 * 查询所有推文信息
		 * 
		 * @return
		 */
	/*
	 * @ApiOperation(value = "查询所有推文信息", notes = "推文中携带用户评价信息")
	 * 
	 * @GetMapping("findAllArticleVM") public MsgResponse findAllArticleVM() { try {
	 * List<ArticleVM> list = articleService.findAll(); // 返回成功信息 return
	 * MsgResponse.success("success", list); } catch (Exception e) {
	 * e.printStackTrace(); // 返回错误信息 return MsgResponse.error(e.getMessage()); } }
	 * 
	 *//**
		 * 通过id查询推文信息
		 * 
		 * @param id
		 * @return
		 */
	/*
	 * 
	 * @ApiOperation(value = "通过id查询推文信息", notes = "推文中携带用户评价信息")
	 * 
	 * @GetMapping("findArticleVMById") public MsgResponse
	 * findArticleVMById(@RequestParam long id) { ArticleVM ArticleVM = new
	 * ArticleVM(); try { ArticleVM = articleService.findByArticleVMId(id); return
	 * MsgResponse.success("success", ArticleVM); } catch (Exception e) {
	 * e.printStackTrace(); return MsgResponse.error(e.getMessage()); } }
	 * 
	 *//**
		 * 根据关键字查询推文信息
		 * 
		 * @param keyWords
		 * @return
		 */
	/*
	 * @ApiOperation(value = "根据关键字查询推文信息", notes = "输入name中关键字进行查询,推文中携带文件信息")
	 * 
	 * @GetMapping("findArticleVMByKeyword") public MsgResponse
	 * findArticleVMByKeyword(@RequestParam String keyWords) { try { List<ArticleVM>
	 * list = articleService.findLikeKeyword(keyWords); return
	 * MsgResponse.success("success", list); } catch (Exception e) {
	 * e.printStackTrace(); return MsgResponse.error(e.getMessage()); } }
	 * 
	 * @ApiOperation(value = "根据关键字查询班级信息", notes = "输入name中关键字进行查询")
	 * 
	 * @GetMapping("findArticleByKeyword") public MsgResponse
	 * findArticleByKeyword(@RequestParam String keyWords) { try { List<Article>
	 * list = articleService.query(keyWords); return MsgResponse.success("success",
	 * list); } catch (Exception e) { e.printStackTrace(); return
	 * MsgResponse.error(e.getMessage()); } }
	 * 
	 *//**
		 * 保存或者更新班级信息
		 * 
		 * @param Article
		 * @return
		 */
	/*
	 * @ApiOperation(value = "保存或者更新班级信息", notes = "执行插入操作时不需要输入id，输入id时执行更新操作")
	 * 
	 * @PostMapping("saveOrUpdateArticle") public MsgResponse
	 * saveOrUpdateArticle(Article Article) { try {
	 * articleService.saveOrUpdateArticle(Article); return
	 * MsgResponse.success("success", Article); } catch (Exception e) {
	 * e.printStackTrace(); return MsgResponse.error(e.getMessage()); } }
	 * 
	 *//**
		 * 根据id删除班级信息
		 * 
		 * @param id
		 * @return
		 *//*
			 * @ApiOperation(value = "根据id删除班级信息")
			 * 
			 * @GetMapping("deleteArticleById") public MsgResponse
			 * deleteArticleById(@RequestParam long id) { try {
			 * articleService.deleteById(id); return MsgResponse.success("success",
			 * "删除成功！"); } catch (Exception e) { e.printStackTrace(); return
			 * MsgResponse.error(e.getMessage()); } }
			 */

}
