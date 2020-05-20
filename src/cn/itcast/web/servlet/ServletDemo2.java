package cn.itcast.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo2 implements Servlet {
    //初始化方法,

    /**
     * 在servlet被创建的时候执行,执行,只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("被创建");
    }

    /**
     * servlet
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法,每一次Servlet被访问的时候,执行,执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("每次Servlet被访问的时候");
    }

    /**
     * 获取servlet的信息
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法,
     * 在S服务器正常关闭时,执行,执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
