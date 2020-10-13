package task_4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/Filter1")
public class Filter1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("do init");
        RequestDispatcher view = req.getRequestDispatcher("Filter1.html");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("post init");
        PrintWriter writer = response.getWriter();
        Date d1 = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss a");
        String time  = format.format(d1);
        String loginCount = ((Integer)(request.getAttribute("loginCount"))).toString();
        String name = request.getParameter("username");
        try {
            writer.println("<p>Hello " + name + "</p>");
            writer.println("<p>You logged in " + loginCount + " times</p>");
            writer.println("<p>Date =  " + time + "</p>");
            // количество посещений, время последнего входа
        } finally {
            writer.close();
        }
    }

}
