package task_3.hello_user;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloUser")
public class HelloUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String name = request.getParameter("username");
        try {
            writer.println("<p>Hello " + name + "</p>");
        } finally {
            writer.close();
        }
    }


//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("ChooseUser.jsp");
//        requestDispatcher.forward(req, resp);
//        req.setAttribute("user","user");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        System.out.println(req.getParameter("user"));
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("HelloUser.jsp");
//        requestDispatcher.forward(req, resp);
//    }
}
