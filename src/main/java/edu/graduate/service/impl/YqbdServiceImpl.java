package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.Yqbd;
import edu.graduate.bean.YqbdExample;
import edu.graduate.dao.YqbdMapper;
import edu.graduate.service.IYqbdService;

@Service
public class YqbdServiceImpl implements IYqbdService{
	@Autowired
	private YqbdMapper yqbdMapper;

	@Override
	public Yqbd selectById(int id) throws Exception {
		return yqbdMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Yqbd> selectAllYqbd() throws Exception {
		YqbdExample example = new YqbdExample();
		return yqbdMapper.selectByExampleWithBLOBs(example);
	}

}
