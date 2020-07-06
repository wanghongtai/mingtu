package com.mingtu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Hunter on 2020-07-03.
 */
@Controller
public class HomeController {


    /**
     * 默认跳转到index.html
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello spring boot!";
    }

    @ResponseBody
    @RequestMapping("/cxtPath")
    public String getContextPath(HttpServletRequest request){
        String basePath = request.getScheme()+"://"
                +request.getServerName()+":"+request.getServerPort()+request.getContextPath()  +"/";
        return basePath;
    }

}
