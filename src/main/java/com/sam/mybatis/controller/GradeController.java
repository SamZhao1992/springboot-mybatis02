package com.sam.mybatis.controller;

import java.util.List;

import javax.annotation.Resource;

import com.github.pagehelper.PageHelper;
import com.sam.mybatis.bean.Grade;
import com.sam.mybatis.service.GradeService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/grade")
@EnableAutoConfiguration
public class GradeController {
	
	@Resource
	private GradeService gradeService;
	
	@RequestMapping("/getByName")
	public List<Grade> getByName(String gradeNm){
		System.out.println("GradeController.selectByGradeNm()");
		return gradeService.getByName(gradeNm);
	}

	@RequestMapping("/getById")
	public Grade getById(int id){
		System.out.println("GradeController.getById()");
		return gradeService.getById(id);
	}

	@RequestMapping("/getNameById")
	public String getNameById(int id) {
		System.out.println("GradeController.getNameById()");
		return gradeService.getNameById(id);
	}

	@RequestMapping("/getByName2")
	public List<Grade> selectByGradeNm2(String gradeNm){
		System.out.println("GradeController.getByName()");
		// 第几页；几条数据
		PageHelper.startPage(1,3);
		return gradeService.getByName(gradeNm);
	}

	@RequestMapping("/save")
	public Grade save(Grade grade){
		System.out.println("GradeController.save()");
		gradeService.save(grade);

		return (grade);
	}
	
}
