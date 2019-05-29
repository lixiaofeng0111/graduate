package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.TopicKind;

public interface ITopicKindService {
	List<TopicKind> findAll() throws Exception;

}
