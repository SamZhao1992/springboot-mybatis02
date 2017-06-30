package com.sam.mybatis.service;

import com.sam.mybatis.bean.Grade;
import com.sam.mybatis.dao.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GradeService {

	@Autowired
	private GradeMapper gradeMapper;

	public List<Grade> getByName(String gradeNm){
		return gradeMapper.getByName(gradeNm);
	}

	public Grade getById(int id) {
		return gradeMapper.getById(id);
	}

	public String getNameById(int id) {
		return gradeMapper.getNameById(id);
	}

	@Transactional
	public void save(Grade grade) {
		gradeMapper.save(grade);
	}
}
