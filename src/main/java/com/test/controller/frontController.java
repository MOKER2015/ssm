package com.test.controller;

import com.test.model.QtUser;
import com.test.service.QtActivityService;
import com.test.service.QtUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by MOKER on 2016/5/13.
 */
@Controller
@RequestMapping("/index")
@Scope("prototype")//在默认情况下springmvc的实例都是单例模式,所以使用scope域将其注解为每次都创建一个新的实例
public class frontController {
    @Autowired
    private QtActivityService qtActivityService;
    @Autowired
    private QtUserService qtUserService;

    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(HttpServletRequest request,HttpServletResponse response){
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        System.out.println("hello:......"+name+" ++ "+password);
        QtUser qtUser1=new QtUser();
        qtUser1.setName(name);
        qtUser1.setPassword(password);
        System.out.println(qtUser1.getName());
        QtUser qtUser2=qtUserService.selectByRecord(qtUser1);
        HttpSession session=request.getSession();
        session.setAttribute("user",qtUser2);
        if(qtUser2!=null){
            return  "index";
        }else {
            return "login";
        }
    }

}
