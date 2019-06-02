package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.Reason;
import edu.graduate.bean.ReasonExample;
import edu.graduate.dao.ReasonMapper;
import edu.graduate.service.IReasonService;
@Service
public class ReasonServiceImpl implements IReasonService{
	@Autowired
	private ReasonMapper reasonMapper;

	@Override
	public List<Reason> findAllReason() throws Exception {
		ReasonExample example = new ReasonExample();
		return reasonMapper.selectByExample(example);
	}

	@Override
	public Reason selectReasonById(Integer id) throws Exception {
		return reasonMapper.selectByPrimaryKey(id);
	}

	@Override
	public void saveReason(Reason Reason) throws Exception {
		// TODO Auto-generated method stub
		reasonMapper.insert(Reason);
	}

	@Override
	public void update(Reason Reason) throws Exception {
		// TODO Auto-generated method stub
		reasonMapper.updateByPrimaryKey(Reason);
	}

	@Override
	public void delete(Integer id) throws Exception {
		// TODO Auto-generated method stub
		reasonMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Reason> findAll() throws Exception {
		// TODO Auto-generated method stub
		return reasonMapper.findAll();
	}

	@Override
	public Reason selectByFruitId(Long fruitId) throws Exception {
		// TODO Auto-generated method stub
		return reasonMapper.selectByFruitId(fruitId);
	}

	@Override
	public Reason selectAllVMById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return reasonMapper.selectAllVMById(id);
	}



}
