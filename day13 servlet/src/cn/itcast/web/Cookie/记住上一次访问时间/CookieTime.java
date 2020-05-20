package cn.itcast.web.Cookie.记住上一次访问时间;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/CookieTime")
public class CookieTime extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html;charset=utf-8");
        boolean flag=false;
        //获取所有的Cookie
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for (Cookie c:cookies
                 ) {
                String name = c.getName();
                if ("lastTime".equals(name)) {
                    System.out.println("chenggong");
                    flag = true;
                    //相应数据
                    Date data = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String string = simpleDateFormat.format(data);
                    c.setValue(string);
                    c.setMaxAge(60 * 60 * 24);
                    response.addCookie(c);
                    //获取
                    String value = c.getValue();
                    response.setCharacterEncoding("utf-8");
                    response.getWriter().write("<h1>欢迎回来，上一次访问时间为：" + value + "</h1>");
                    break;
                }
            }
                if (cookies==null||cookies.length==0||flag==false){
                    System.out.println("加载");
                    Date data = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
                    String string=simpleDateFormat.format(data);
                    Cookie lastTime = new Cookie("lastTime", string);
                    lastTime.setMaxAge(60*60*24);
                    response.addCookie(lastTime);
                    response.getWriter().write("<h1>首次登陆</h1>");
                }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
