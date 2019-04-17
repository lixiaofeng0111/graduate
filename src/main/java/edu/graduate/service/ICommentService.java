package edu.graduate.service;

import java.util.List;


import edu.graduate.bean.Comment;

public interface ICommentService {
	/*
	 保存和修改评价信息
	 */
	void saveOrUpdateComment(Comment comment) throws Exception;
	
	/*
	 * 查询评价信息
	 */
	List<Comment> findAllComment() throws Exception;
	
	Comment findCommentById(Long id) throws Exception;
	
	/*
	 * 删除评价信息
	 */
	void deleteCommentById(Long id) throws Exception;
	
	/*
	 * 批量删除评价信息
	 */
	void batchDeleteComment(Long[] ids) throws Exception;

}
