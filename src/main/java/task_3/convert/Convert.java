package task_3.convert;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Convert")
public class Convert extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        double course = Double.parseDouble(request.getParameter("course"));
        int value = Integer.parseInt(request.getParameter("value"));

        if(value>100){
            try {
                writer.println("<p><span style=\"color: #994444;\">Result: " + (int)(value*course) + "</span></p>");
            } finally {
                writer.close();
            }
        }
        else{
            try {
                writer.println("<p>Result: " + (int)(value*course) + "</p>");
            } finally {
                writer.close();
            }
        }

    }
}
