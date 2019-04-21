package edu.graduate.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.graduate.bean.Comment;
import edu.graduate.service.ICommentService;
import edu.graduate.util.MsgResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "评价相关接口(推文)")
@Controller
@RestController("/Comment")
public class CommentController {
	
	@Autowired
	private ICommentService commentService;
	
	@ApiOperation(value = "查询所有评论信息")
	@GetMapping("findAllComment")
	public MsgResponse findAllComment() {
		try {
			List<Comment> list = commentService.findAllComment();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "根据Id查询一个评论信息")
	@GetMapping("findCommentById")
	public MsgResponse findCommentById(Long id) {
		try {
			Comment comment = commentService.findCommentById(id);
			return MsgResponse.success("Success", comment);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	
	@ApiOperation(value = "保存或者更新评论信息", notes = "执行插入操作时不需要输入id，输入id时执行更新操作")
	@PostMapping("saveOrUpdateComment")
	public MsgResponse saveOrUpdateComment(Comment comment) {
		try {
			commentService.saveOrUpdateComment(comment);
			return MsgResponse.success("Success", comment);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@ApiOperation(value = "根据Id删除评论信息", notes = "执行操作时直接输入id值进行修改")
	@PostMapping("deleteCommentById")
	public MsgResponse deleteCommentById(Long id) {
		try {
			commentService.deleteCommentById(id);
			return MsgResponse.success("Success", "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "批量删除评论信息", notes = "删除多个评论信息时以回车键隔开")
	@PostMapping("batchDeleteComment")
	public MsgResponse batchDeleteComment(Long[] ids) {
		try {
			commentService.batchDeleteComment(ids);
			return MsgResponse.success("Success", "批量删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
