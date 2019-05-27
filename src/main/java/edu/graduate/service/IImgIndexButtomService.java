package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.ImgIndexButtom;

public interface IImgIndexButtomService {
	
	List<ImgIndexButtom> findAllImgIndexButtom();
	
	ImgIndexButtom selectByImgpath(String imgpath) throws Exception;
	
	  void update(ImgIndexButtom imgIndexButtom) throws Exception;
	  
	  void saveImgIndexButtom(ImgIndexButtom imgIndexButtom) throws Exception;
	  
	  void delete(Integer id) throws Exception;

	ImgIndexButtom selectById(Integer id) throws Exception;
	
	

}
