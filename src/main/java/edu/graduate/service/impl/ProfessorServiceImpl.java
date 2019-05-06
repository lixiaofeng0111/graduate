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

}
