package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.Kind;
import edu.graduate.bean.KindExample;
import edu.graduate.dao.KindMapper;
import edu.graduate.service.IKindService;
@Service
public class KindServiceImpl implements IKindService{
	@Autowired
	private KindMapper kindMapper;

	@Override
	public List<Kind> selectAllKind() throws Exception {
		KindExample example = new KindExample();
		return kindMapper.selectByExample(example);
	}

	@Override
	public Kind selectKindById(Long id) throws Exception {
		return kindMapper.selectByPrimaryKey(id);
	}

	@Override
	public Kind selectKindByKind(String kind) throws Exception {
		return kindMapper.selectKindByKind(kind);
	}

	@Override
	public void update(Kind kind) throws Exception {
		// TODO Auto-generated method stub
		kindMapper.updateByPrimaryKey(kind);
	}

	@Override
	public void saveKind(Kind kind) throws Exception {
		// TODO Auto-generated method stub
		kindMapper.insert(kind);
	}

	@Override
	public void delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		kindMapper.deleteByPrimaryKey(id);
	}

}
