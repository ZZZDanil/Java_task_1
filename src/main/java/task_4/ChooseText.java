package task_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ChooseText")
public class ChooseText extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        try {
            writer.println("<a href=\"http://localhost:8080/ChooseText/text?language=ru\">Русский текст</a><br><br>");
            writer.println("<a href=\"http://localhost:8080/ChooseText/text?language=en\">Атглийский текст</a>");
        } finally {
            writer.close();
        }
    }
}
