package edu.graduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.TopicKind;
import edu.graduate.bean.TopicKindExample;
import edu.graduate.dao.TopicKindMapper;
import edu.graduate.service.ITopicKindService;

@Service
public class TopicKindServiceImpl implements ITopicKindService{
	@Autowired
	private TopicKindMapper topicKindMapper;

	@Override
	public List<TopicKind> findAll() throws Exception {
		TopicKindExample example = new TopicKindExample();
		// TODO Auto-generated method stub
		return topicKindMapper.selectByExample(example);
	}

}
