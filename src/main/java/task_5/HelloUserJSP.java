package task_5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloUserJSP")
public class HelloUserJSP extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        String name = request.getParameter("username");

        User u = new User(name);
        request.setAttribute("user", u);
        getServletContext()
                .getRequestDispatcher("/t_5/User.jsp")
                .forward(request, response);

//        RequestDispatcher view = request.getRequestDispatcher("HelloUser.html");
//        view.forward(request, response);

    }
}
