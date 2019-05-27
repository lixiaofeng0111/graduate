package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.MeituShow;
import edu.graduate.bean.MeituShowExample;
import edu.graduate.dao.MeituShowMapper;
import edu.graduate.service.IMeituShowService;
@Service
public class MeituShowServiceImpl implements IMeituShowService{
	@Autowired
	private MeituShowMapper meituShowMapper;

	@Override
	public List<MeituShow> selectAllMeituShow() throws Exception {
		MeituShowExample example = new MeituShowExample();
		return meituShowMapper.selectByExample(example);
	}

	@Override
	public MeituShow selectByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return meituShowMapper.selectByimgpath(name);
	}

	@Override
	public MeituShow selectById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return meituShowMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(MeituShow MeituShow) throws Exception {
		// TODO Auto-generated method stub
		meituShowMapper.updateByPrimaryKey(MeituShow);
	}

	@Override
	public void saveMeituShow(MeituShow MeituShow) throws Exception {
		// TODO Auto-generated method stub
		meituShowMapper.insert(MeituShow);
	}

	@Override
	public void delete(Integer id) throws Exception {
		// TODO Auto-generated method stub
		meituShowMapper.deleteByPrimaryKey(id);
	}

}
