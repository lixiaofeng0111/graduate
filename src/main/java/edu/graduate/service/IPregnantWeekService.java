package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.PregnantWeek;

public interface IPregnantWeekService {
	
	List<PregnantWeek> selectAllPregnantWeek() throws Exception;
	
	PregnantWeek selectPregnantWeekById(int id) throws Exception;
	
	PregnantWeek selectPregnantWeekByweek(Integer week) throws Exception;
	
	
	

}
