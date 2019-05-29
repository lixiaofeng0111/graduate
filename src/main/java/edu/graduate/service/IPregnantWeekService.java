package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.PregnantWeek;

public interface IPregnantWeekService {
	
	List<PregnantWeek> selectAllPregnantWeek() throws Exception;
	
	PregnantWeek selectPregnantWeekById(int id) throws Exception;
	
	List<PregnantWeek> selectPregnantWeekByweek(Integer week) throws Exception;
	
	void savePregnantWeek(PregnantWeek pregnantWeek) throws Exception;
	
	void update(PregnantWeek pregnantWeek) throws Exception;
	
	void delete(Integer id) throws Exception;
	
	

}
