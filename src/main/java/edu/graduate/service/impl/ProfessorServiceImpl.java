package edu.graduate.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graduate.bean.Professor;
import edu.graduate.bean.ProfessorExample;
import edu.graduate.dao.ProfessorMapper;
import edu.graduate.service.IProfessorService;

@Service
public class ProfessorServiceImpl implements IProfessorService{
	@Autowired
	private ProfessorMapper professorMapper;

	@Override
	public List<Professor> findAllProfessor() {
		ProfessorExample example = new ProfessorExample();
		return professorMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<Professor> selectProfessorsByTopicKindId() {
		return professorMapper.selectProfessorsByTopicKindId();
	}

	@Override
	public Professor selectById(Long id) {
		return professorMapper.selectByPrimaryKey(id);
	}

	@Override
	public void saveProfessor(Professor professor) throws Exception {
		// TODO Auto-generated method stub
		professorMapper.insert(professor);
	}

	@Override
	public void update(Professor professor) throws Exception {
		// TODO Auto-generated method stub
		professorMapper.updateByPrimaryKey(professor);
	}

	@Override
	public void delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		professorMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Professor selectProfessorByName(String name) throws Exception {
		return professorMapper.selectProfessorByName(name);
	}

	@Override
	public Professor selectKindByKindId(Integer topicKindId) throws Exception {
		// TODO Auto-generated method stub
		return professorMapper.selectKindByKindId(topicKindId);
	}

	@Override
	public List<Professor> selectProfessorByNameDim(String ProfessorName) throws Exception {
		// TODO Auto-generated method stub
		return professorMapper.selectProfessorByNameDim(ProfessorName);
	}

}
