package com.tt.teach22.controller;

import com.tt.teach22.pojo.Student;
import com.tt.teach22.service.StudentService;
import com.tt.teach22.util.BaseController;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @作者：zhujungui
 * @时间：2019/01/23 16:15
 * @描述：学生控制器
 */
@Controller
@RequestMapping("/stu")
public class StudnetController extends BaseController {
    @Resource
    private StudentService studentService;

    //登录的接口
    @RequestMapping("/login")
    public String login() {
        return "/student/login";
    }

    @RequestMapping("/index")
    public String index() {
        //用session对象拦截
        String studentName = (String) getSession().getAttribute(SESSION_KEY);
        if (studentName != null) {
            return "/student/index";
        }
        return REDIRECT + "/stu/login";
    }

    //注销请求

    @RequestMapping("/logout")
    public String logout() {
        getSession().removeAttribute(SESSION_KEY);
        return REDIRECT + "/stu/login";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin() {
        String xuehao = getRequest().getParameter("studentNo");
        Integer studentNo = Integer.parseInt(xuehao);
        String loginPwd = getRequest().getParameter("loginPwd");
        Student student = new Student();
        student.setStudentNo(studentNo);
        student.setLoginPwd(loginPwd);
        Student student1 = studentService.doLogin(student);
        if (student1 != null) {
            getSession().setAttribute(SESSION_KEY, student1.getStudentName());
            return FORWARD + "/stu/index";
        }
        return REDIRECT + "/stu/login";
    }
}
