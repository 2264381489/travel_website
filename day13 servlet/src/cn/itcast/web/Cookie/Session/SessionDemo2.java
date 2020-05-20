package cn.itcast.web.Cookie.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SessionDemo2")
public class SessionDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println(session.getAttribute("msg"));
        System.out.println(session.getAttribute("name"));
        String id = session.getId();
        if(session.isNew()){
            System.out.println(id);//每个都是一样的
            System.out.println("您是新用户，您的id是"+session.getId());
        }else{
            System.out.println("您是老用户，您的id是+"+session.getId());
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
