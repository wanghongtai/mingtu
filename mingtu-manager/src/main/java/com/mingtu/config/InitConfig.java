package com.mingtu.config;

import com.mingtu.interceptor.InitInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Hunter on 2020-07-03.
 */
@Configuration
public class InitConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new InitInterceptor());
        registration.addPathPatterns("/**");                      //所有路径都被拦截
        /*registration.excludePathPatterns(                         //添加不拦截路径
                "你的登陆路径",            //登录
        );*/

    }
}
