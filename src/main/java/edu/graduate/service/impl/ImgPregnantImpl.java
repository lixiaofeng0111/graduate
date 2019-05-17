package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.ImgPregnant;
import edu.graduate.bean.ImgPregnantExample;
import edu.graduate.dao.ImgPregnantMapper;
import edu.graduate.service.IImgPregnantService;
@Service

public class ImgPregnantImpl implements IImgPregnantService{
	@Autowired
	private ImgPregnantMapper imgPregnantMapper;

	@Override
	public List<ImgPregnant> findAllImgPregnant() throws Exception {
		ImgPregnantExample example = new ImgPregnantExample();
		return imgPregnantMapper.selectByExample(example);
	}

}
