package task_4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/ChooseText/text")
public class SimpleFilter3 implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(servletRequest.getParameter("language"));
        if (servletRequest.getParameter("language").equals("ru")) {

            RequestDispatcher view = servletRequest.getRequestDispatcher("/TextR.html");
            view.forward(servletRequest, servletResponse);
        } else {
            RequestDispatcher view = servletRequest.getRequestDispatcher("/Text.jsp");
            view.forward(servletRequest, servletResponse);
        }
    }
}
