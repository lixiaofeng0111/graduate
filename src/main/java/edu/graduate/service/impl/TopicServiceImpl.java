package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.Topic;
import edu.graduate.bean.TopicExample;
import edu.graduate.dao.TopicMapper;
import edu.graduate.service.ITopicService;
@Service
public class TopicServiceImpl implements ITopicService{
	@Autowired
	private TopicMapper topicMapper;

	@Override
	public List<Topic> findAllTopic() {
		TopicExample example = new TopicExample();
		return topicMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public Topic findTopicByName(Topic topic) {
		return topicMapper.findTopicByName(topic);
	}

	@Override
	public List<Topic> findTopicByDate(String topic) {
		return topicMapper.findTopicByDate(topic);
	}

	@Override
	public Topic selectById(Long id) {
		return topicMapper.selectByPrimaryKey(id);
	}
	

}
