package task_4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebFilter("/Filter2/showTime")
public class SimpleFilter2 implements Filter {
    long delta = 0L;
    SimpleDateFormat full = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss a");
    SimpleDateFormat df = new SimpleDateFormat("a");    // AM PM
    private long deltaServerTime = 0L;
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Date d1 = new Date();
        try {
            System.out.println("deltaServerTime = " + servletRequest.getParameter("deltaServerTime"));
            delta = Long.parseLong(servletRequest.getParameter("deltaServerTime"));
            d1.setTime(d1.getTime() + delta*3600000);
        } catch (Exception e){
            e.printStackTrace();
        }
        String AM = df.format(d1);
        servletRequest.setAttribute("time", full.format(d1));
        if (AM.equals("AM")) {
            RequestDispatcher view = servletRequest.getRequestDispatcher("/WhiteServerTime.jsp");
            view.forward(servletRequest, servletResponse);
        } else {
            RequestDispatcher view = servletRequest.getRequestDispatcher("/DarkServerTime.jsp");
            view.forward(servletRequest, servletResponse);
        }
        if (servletRequest != null) {
            try {
                System.out.println(servletRequest.getParameter("time"));
            } finally {}}
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}
