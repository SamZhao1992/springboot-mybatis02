package com.sam.mybatis.dao;

import com.sam.mybatis.bean.Grade;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by SamZhao on 2017/6/30.
 */
public interface GradeMapper {

    @Select("select * from grade where gradeNm like CONCAT(   '%'   ,    #{gradeNm},   '%'  )")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "gradeNm", column = "gradeNm"),
            @Result(property = "teacherId", column = "teacherId")
    })
    public List<Grade> getByName(String gradeNm);

    @Select("select *from Grade where id = #{id}")
    public Grade getById(int id);

    @Select("select grade_nm from Grade where id = #{id}")
    public String getNameById(int id);

    @Insert("insert into Grade(gradeNm,teacherId) values(#{gradeNm},#{teacherId})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public void save(Grade grade);
}
