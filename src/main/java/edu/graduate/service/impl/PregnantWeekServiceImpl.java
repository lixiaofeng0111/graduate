package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.PregnantWeek;
import edu.graduate.bean.PregnantWeekExample;
import edu.graduate.dao.PregnantWeekMapper;
import edu.graduate.service.IPregnantWeekService;

@Service
public class PregnantWeekServiceImpl implements IPregnantWeekService{
	
	@Autowired
	private PregnantWeekMapper pregnantWeekMapper;

	@Override
	public List<PregnantWeek> selectAllPregnantWeek() throws Exception {
		PregnantWeekExample example = new PregnantWeekExample();
		return pregnantWeekMapper.selectByExample(example);
	}

	@Override
	public PregnantWeek selectPregnantWeekById(int id) throws Exception {
		return pregnantWeekMapper.selectByPrimaryKey(id);
	}

	@Override
	public PregnantWeek selectPregnantWeekByweek(Integer week) throws Exception {
		return pregnantWeekMapper.selectByWeek(week);
	}

}
