package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.Topic;

public interface ITopicService {
	
	List<Topic> findAllTopic();
	
	Topic selectById(Long id);
	
	Topic findTopicByName(String topicname);
	
	List<Topic> findTopicByDate(String topic);
	
	void savaTopic(Topic topic) throws Exception;
	
	void update(Topic topic) throws Exception;
	
	void delete(Long id) throws Exception;
	
	List<Topic> findTopicByNameDim(String topString) throws Exception;
	
	
	
}
