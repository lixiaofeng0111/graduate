package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.ImgIndex;
import edu.graduate.bean.ImgIndexExample;
import edu.graduate.dao.ImgIndexMapper;
import edu.graduate.service.IImgIndexService;
@Service
public class ImgIndexServiceImpl implements IImgIndexService{
	@Autowired
	private ImgIndexMapper imgIndexMapper;
	

	@Override
	public List<ImgIndex> findAllIngIndex() {
		ImgIndexExample example = new ImgIndexExample();
		return imgIndexMapper.selectByExample(example);
	}

}
