package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.Topic;

public interface ITopicService {
	
	List<Topic> findAllTopic();
	
	Topic selectById(Long id);
	
	Topic findTopicByName(Topic topic);
	
	List<Topic> findTopicByDate(String topic);
	
	
	
}
