package com.blithe.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 16:29
 * Description:
 */

// 拦截器类：拦截用户请求
class MyInterceptor implements HandlerInterceptor {

    private long bTime = 0;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        bTime = System.currentTimeMillis();
        System.out.println("1111拦截器的MyInterceptor的preHandle()方法");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("11111拦截器的MyInterceptor的afterCompletion()方法");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        long eTime = System.currentTimeMillis();
        System.out.println("从preHandle到请求处理完成的时间："  + (eTime - bTime));
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("11111拦截器的MyInterceptor的postHandle()方法");
        // 对原来的doSome()执行结果，需要调整
        if(modelAndView != null){
            // 修改数据
            modelAndView.addObject("mydate",new Date());
            // 修改视图
            modelAndView.setViewName("other");
        }
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
}
