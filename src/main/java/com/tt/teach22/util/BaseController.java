package com.tt.teach22.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @作者：zhujungui
 * @时间：2019/01/23 16:31
 * @描述：工具类
 */
public class BaseController {
    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
    //将常用的变量放大base
    protected static final String SESSION_KEY = "studentName";
    protected static final String FORWARD = "forward:";
    protected static final String REDIRECT = "redirect:";

    //2.获取response、request、session
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    public HttpServletResponse getRespon() {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        return response;
    }

    public HttpSession getSession() {
        HttpSession session = getRequest().getSession();
        return session;
    }

}
