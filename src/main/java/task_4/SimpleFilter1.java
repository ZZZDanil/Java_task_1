package task_4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


//@WebFilter(filterName = "SimpleFilter1",
//        urlPatterns = {"/Filter1"})
////        initParams = @WebInitParam(name = "username", value = "username"))
////        initParams = @WebInitParam(name = "env", value = "dev"))

@WebFilter("/Filter1")
public class    SimpleFilter1 implements Filter {

    private Map<String, Integer> map = new HashMap<>();

    private FilterConfig filterConfig;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String name = servletRequest.getParameter("username");
        if(map.containsKey(name)){
            map.put(name, map.get(name) + 1);
            servletRequest.setAttribute("loginCount", map.get(name));
        }
        else{
            map.put(name, 1);
            servletRequest.setAttribute("loginCount", 1);
        }
        servletResponse.setContentType("text/html;charset=windows-1251");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
