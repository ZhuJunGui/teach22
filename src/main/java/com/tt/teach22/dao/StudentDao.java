package com.tt.teach22.dao;

import com.tt.teach22.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @作者：zhujungui
 * @时间：2019/01/23 16:21
 * @描述：数据访问层的接口
 */
@Repository
@Mapper
public interface StudentDao {
    @Select("select * from student where studentNo=#{studentNo} and loginPwd=#{loginPwd}")
    Student doLogin(Student student);
}
