package com.mingtu.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Hunter on 2020-07-03.
 */
public class InitInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //使用 CORS协议允许 Response 跨域
        /* 允许跨域的主机地址 */
        response.setHeader("Access-Control-Allow-Origin", "*");
//         允许跨域的请求方法GET, POST, HEAD 等
        response.setHeader("Access-Control-Allow-Methods", "*");
//         重新预检验跨域的缓存时间 (s)
        response.setHeader("Access-Control-Max-Age", "3600");
//         允许跨域的请求头
        response.setHeader("Access-Control-Allow-Headers", "*");
//         是否携带cookie
        response.setHeader("Access-Control-Allow-Credentials", "true");

        response.setCharacterEncoding("UTF-8");
        return true;//放行
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
