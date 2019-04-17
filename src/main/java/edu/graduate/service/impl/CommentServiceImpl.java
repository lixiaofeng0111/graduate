package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.Comment;
import edu.graduate.bean.CommentExample;
import edu.graduate.dao.CommentMapper;
import edu.graduate.service.ICommentService;

@Service
public class CommentServiceImpl implements ICommentService{
	@Autowired
	private CommentMapper commentMapper;

	/*
	 * 更新和插入评论信息
	 */
	@Override
	public void saveOrUpdateComment(Comment comment) throws Exception {
		if(comment.getId() != null) {
			commentMapper.updateByPrimaryKey(comment);
		}else {
			commentMapper.insert(comment);
		}
		
	}
/*
 * 查询所有评价信息
 */
	@Override
	public List<Comment> findAllComment() throws Exception {
		CommentExample example  = new CommentExample();
		return commentMapper.selectByExample(example);
	}
/*
 * 根据id查询评价信息
 */
	@Override
	public Comment findCommentById(Long id) throws Exception {
		return commentMapper.selectByPrimaryKey(id);
	}
/*
 * 根据id删除评价信息
 */
	@Override
	public void deleteCommentById(Long id) throws Exception {
		commentMapper.deleteByPrimaryKey(id);
	}
/*
 * 批量删除评价信息
 */
	@Override
	public void batchDeleteComment(Long[] ids) throws Exception {
		for(Long id : ids) {
			commentMapper.deleteByPrimaryKey(id);
		}
	}

}
