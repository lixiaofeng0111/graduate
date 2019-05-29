package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.ImgIndexButtom;
import edu.graduate.bean.ImgIndexButtomExample;
import edu.graduate.dao.ImgIndexButtomMapper;
import edu.graduate.service.IImgIndexButtomService;
@Service
public class ImgIndexButtomServiceImpl implements IImgIndexButtomService{
	@Autowired
	private ImgIndexButtomMapper imgIndexButtomMapper;

	@Override
	public List<ImgIndexButtom> findAllImgIndexButtom() {
		ImgIndexButtomExample example = new ImgIndexButtomExample();
		return imgIndexButtomMapper.selectByExampleWithBLOBs(example);
	}


	@Override
	public ImgIndexButtom selectById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return imgIndexButtomMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(ImgIndexButtom imgIndexButtom) throws Exception {
		// TODO Auto-generated method stub
		imgIndexButtomMapper.updateByPrimaryKey(imgIndexButtom);
	}

	@Override
	public void saveImgIndexButtom(ImgIndexButtom imgIndexButtom) throws Exception {
		// TODO Auto-generated method stub
		imgIndexButtomMapper.insert(imgIndexButtom);
	}

	@Override
	public void delete(Integer id) throws Exception {
		// TODO Auto-generated method stub
		imgIndexButtomMapper.deleteByPrimaryKey(id);
	}


	@Override
	public List<ImgIndexButtom> selectByContent(String contentString) throws Exception {
		// TODO Auto-generated method stub
		return imgIndexButtomMapper.selectByContent(contentString);
	}


	@Override
	public ImgIndexButtom selectByImgpath(String imgpath) throws Exception {
		// TODO Auto-generated method stub
		return imgIndexButtomMapper.selectByImgpath(imgpath);
	}

}
