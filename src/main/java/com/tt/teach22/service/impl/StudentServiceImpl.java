package com.tt.teach22.service.impl;

import com.tt.teach22.dao.StudentDao;
import com.tt.teach22.pojo.Student;
import com.tt.teach22.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *@作者：zhujungui
 *@时间：2019/01/23 16:16
 *@描述：学生业务逻辑层，不用做去找数访问层做
 */
@Service
public class StudentServiceImpl  implements StudentService{
    @Resource
    private StudentDao studentDao;

    @Override
    public Student doLogin(Student student) {
        return studentDao.doLogin(student);
    }
}
