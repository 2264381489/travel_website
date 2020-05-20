package cn.itcast.web.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletCookieDemo1")
public class ServletCookieDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //1.创建Cookie对象
        Cookie c=new Cookie("msg","你好");
//        Cookie c2=new Cookie("name","zhagnsan");
        //发送Cookie
        c.setMaxAge(-1);//将Cookie持久化到硬盘,30秒

        response.addCookie(c);
//        response.addCookie(c2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
