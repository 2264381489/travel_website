package cn.itcast.web.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class Filter1 implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter进行擦从左");
        //放行
        chain.doFilter(req, resp);
        System.out.println("filter回来了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
