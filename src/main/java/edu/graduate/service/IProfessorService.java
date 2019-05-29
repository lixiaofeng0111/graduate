package edu.graduate.service;

import java.util.List;

import edu.graduate.bean.Professor;

public interface IProfessorService {
	List<Professor> findAll() throws Exception;
	
	List<Professor> findAllProfessor();
	
	List<Professor> selectProfessorsByTopicKindId();
	
	Professor selectProfessorByName(String name) throws Exception;
	
	Professor selectById(Long id);
	
	void saveProfessor(Professor professor) throws Exception;
	
	void update(Professor professor) throws Exception;
	
	void delete(Long id) throws Exception;
	
	Professor selectKindByKindId(Integer topicKindId) throws Exception;
	
	List<Professor> selectProfessorByNameDim(String ProfessorName) throws Exception;

}
