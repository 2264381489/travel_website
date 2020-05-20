package cn.itcast.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo2")
public class requestDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> headerNames=request.getHeaderNames();
//        while(headerNames.hasMoreElements()) {
//            //获取所有请求头名称
//            String name = headerNames.nextElement();
//            String value = request.getHeader(name);
//            System.out.println(name + "---------" + value);
//        }
            //根据名称
//            String s=request.getHeader("user-agent");
//            if (s.contains("Chrome")){
//                System.out.println("谷歌浏览器");
//            }else if(s.contains("Firefox")){
//                System.out.println("火狐浏览器");
//            }
        String s=request.getHeader("referer");
        System.out.println(s);
        //防盗链
        if(s!=null){
            if (s.contains("/day13_servlet_war_exploded")){
                System.out.println("bofangdidanying1");
            }else {
                System.out.println("s失败");
            }
        }
        }
    }

