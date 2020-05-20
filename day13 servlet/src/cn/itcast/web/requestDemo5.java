package cn.itcast.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestDemo5")
public class requestDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //post获取请求消息体
        String username = request.getParameter("username");
//
//        String[] hobbies = request.getParameterValues("hobby");
//        for (String hobby:hobbies){
//            System.out.println(hobby);
//        }
        Enumeration<String> parameterValues = request.getParameterNames();
//        while(parameterValues.hasMoreElements()){
//            String name=parameterValues.nextElement();
//            System.out.println(name);
//            String value=request.getParameter(name);
//            System.out.println(value);
//            System.out.println("--------");
//        }
        //获取所有参数的map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> keyset= parameterMap.keySet();
        for(String name:keyset) {
            String[] strings = parameterMap.get(name);
            System.out.println(name);
            for (String value:strings){
                System.out.println(value);
            }
            System.out.println("-------------------AA");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 //get获取请求参数
//        String username = request.getParameter("username");
////        System.out.println("get"+username);
        //简写
        this.doPost(request,response);
    }
}
