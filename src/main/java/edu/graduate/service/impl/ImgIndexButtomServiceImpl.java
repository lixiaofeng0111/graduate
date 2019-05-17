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

}
