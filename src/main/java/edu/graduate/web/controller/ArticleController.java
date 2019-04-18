package edu.graduate.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.graduate.bean.Article;
import edu.graduate.bean.extend.ArticleVM;
import edu.graduate.service.IArticleService;
import edu.graduate.util.MsgResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "推文相关接口---与评论构成一对多关系")
@RestController
@RequestMapping("/article")

public class ArticleController {
	@Autowired
	private IArticleService articleService;

//ArticleVM
	@ApiOperation(value = "查询所有推文信息及其评价")
	@GetMapping("findAllArticleVM")
	public MsgResponse findAllServiceVM() {
		try {
			List<ArticleVM> list = articleService.findAll();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "根据Id查询一个推文信息及其评价")
	@GetMapping("findArticleVMById")
	public MsgResponse findServiceVMById(Long id) {
		try {
			ArticleVM article = articleService.findByArticleVMId(id);
			return MsgResponse.success("Success", article);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	
	@ApiOperation(value = "保存或者更新推文信息及其评价", notes = "执行插入操作时不需要输入id，输入id时执行更新操作")
	@PostMapping("saveOrUpdateArticleVM")
	public MsgResponse saveOrUpdateArticle(ArticleVM articleVM) {
		try {
			articleService.saveOrUpdataArticleVM(articleVM);
			return MsgResponse.success("Success", articleVM);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@ApiOperation(value = "根据Id删除推文信息及其评价", notes = "执行操作时直接输入id值进行修改")
	@PostMapping("deleteArticleVMById")
	public MsgResponse deleteArticleVMById(Long id) {
		try {
			articleService.deleteArticleVMById(id);
			return MsgResponse.success("Success", "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "批量删除推文信息及其评价", notes = "删除多个推文信息时以回车键隔开")
	@PostMapping("batchDeleteArticleVMById")
	public MsgResponse batchDeleteArticleVMById(Long[] ids) {
		try {
			articleService.batchDeleteArticle(ids);
			return MsgResponse.success("Success", "批量删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
//Article	
	@ApiOperation(value = "查询全部推文信息", notes = "之间点击查询即可")
	@PostMapping("findAllArticle")
	public MsgResponse findAllArticle() {
		try {
		List<Article> list = articleService.findAllArticle();
			return MsgResponse.success("Success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	
	@ApiOperation(value = "根据Id查询推文信息", notes = "查询时输入推文id，若无此id则返回空")
	@PostMapping("findArticleById")
	public MsgResponse findArticleById(Long id) {
		try {
			Article article = articleService.findArticleById(id);
			return MsgResponse.success("Success", article);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "查询全部推文信息", notes = "之间点击查询即可")
	@PostMapping("findArticleByKeyword")
	public MsgResponse findArticleByKeyword(String keyword) {
		try {
			List<Article> list = articleService.findArticleByKeyword(keyword);
			return MsgResponse.success("Success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "保存和修改推文信息")
	@PostMapping("saveOrUpdateArticle")
	public MsgResponse saveOrUpdateArticle(Article article) {
		try {
			articleService.saveOrUpdateArticle(article);
			return MsgResponse.success("Success", article);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "根据Id删除推文信息")
	@PostMapping("deleteArticleById")
	public MsgResponse deleteArticleById (Long id) {
		try {
			articleService.deleteArticleById(id);
			return MsgResponse.success("Success", "删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "根据Id批量删除推文信息")
	@PostMapping("batchDeleteArticleById")
	public MsgResponse batchDeleteArticleById(Long ids[]) {
		try {
			articleService.batchDeleteArticle(ids);
			return MsgResponse.success("Success", "删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	
	
	
}
