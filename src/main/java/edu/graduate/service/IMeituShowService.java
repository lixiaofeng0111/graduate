package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.MeituShow;

public interface IMeituShowService {
	
	  List<MeituShow> selectAllMeituShow() throws Exception;
	
	  MeituShow  selectByName(String name) throws Exception;
	
	  MeituShow selectById(Integer id) throws Exception;
	  
	  void update(MeituShow MeituShow) throws Exception;
	  
	  void saveMeituShow(MeituShow MeituShow) throws Exception;
	  
	  void delete(Integer id) throws Exception;

}
