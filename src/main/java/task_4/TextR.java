package task_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ChooseText/Text/R")
public class TextR extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
//
//        double course = Double.parseDouble(request.getParameter("course"));
//        int value = Integer.parseInt(request.getParameter("value"));
        try {
            writer.println("<a href=\"http://localhost:8080/\">Русский текст</a>");
            writer.println("<a href=\"http://localhost:8080/\">Атглийскиймтекст</a>");
        } finally {
            writer.close();
        }
    }
}
