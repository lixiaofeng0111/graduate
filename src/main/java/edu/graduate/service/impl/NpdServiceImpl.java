package edu.graduate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import edu.graduate.bean.Npd;
import edu.graduate.dao.NpdMapper;
import edu.graduate.service.INpdService;
@Service
public class NpdServiceImpl implements INpdService{
	@Autowired
	private NpdMapper npdMapper;

	@Override
	public int insert(Npd npd) throws Exception {
		return npdMapper.insert(npd);
	}

	@Override
	public void deleteBypregnantDescriptionId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		npdMapper.deleteBypregnantDescriptionId(id);
	}

}
