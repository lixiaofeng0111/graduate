package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.PregnantAnalysis;
import edu.graduate.bean.PregnantAnalysisExample;
import edu.graduate.dao.PregnantAnalysisMapper;
import edu.graduate.service.IPregnantAnalysisService;

@Service
public class PregnantAnalysisServiceImpl implements IPregnantAnalysisService{
	@Autowired
	private PregnantAnalysisMapper pregnantAnalysisMapper;

	@Override
	public List<PregnantAnalysis> selectAllPregnantAnalysis() throws Exception {
		PregnantAnalysisExample example = new PregnantAnalysisExample();
		return pregnantAnalysisMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public PregnantAnalysis selectPregnantAnalysisById(Integer id) throws Exception {
		return pregnantAnalysisMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<PregnantAnalysis> selectPregnantAnalysisByKindId(Long id) throws Exception {
		return pregnantAnalysisMapper.selectPregnantAnalysisByKindId(id);
	}

	@Override
	public PregnantAnalysis selectByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return pregnantAnalysisMapper.selectByName(name);
	}

	@Override
	public void update(PregnantAnalysis pregnantAnalysis) throws Exception {
		// TODO Auto-generated method stub
		pregnantAnalysisMapper.updateByPrimaryKey(pregnantAnalysis);
	}

	@Override
	public void savePregnantAnalysis(PregnantAnalysis pregnantAnalysis) throws Exception {
		// TODO Auto-generated method stub
		pregnantAnalysisMapper.insert(pregnantAnalysis);
	}

	@Override
	public void delete(Integer id) throws Exception {
		// TODO Auto-generated method stub
		pregnantAnalysisMapper.deleteByPrimaryKey(id);
	}

	@Override
	public PregnantAnalysis selectKindByKindId(Long kindId) throws Exception {
		// TODO Auto-generated method stub
		return pregnantAnalysisMapper.selectKindBykindId(kindId);
	}

	@Override
	public List<PregnantAnalysis> selectByNameDim(String name) throws Exception {
		// TODO Auto-generated method stub
		return pregnantAnalysisMapper.selectByNameDim(name);
	}

	@Override
	public List<PregnantAnalysis> finAll() throws Exception {
		// TODO Auto-generated method stub
		return pregnantAnalysisMapper.findAll();
	}

}
