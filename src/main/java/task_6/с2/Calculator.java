package task_6.с2;


import task_6.ICalculator;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Calculator2")
public class Calculator extends HttpServlet {
    float total = 0;
    @EJB
    ICalculator ejb;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String o = request.getParameter("operation");
            if (o != null) {
                String operation = o.substring(0, 1);
                float number = Float.parseFloat(o.substring(1));
                if (operation.equals("+")) {
                    total += number;
                } else if (operation.equals("-")) {
                    total -= number;
                } else if (operation.equals("*")) {
                    total *= number;
                } else if (operation.equals("/")) {
                    if (number != 0) {
                        total /= number;
                    }
                }

            }
            request.getSession().setAttribute("total", total);
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("/t_6/calculator2.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            throw new ServletException(e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setAttribute("total", total);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/t_6/calculator2.jsp");
        rd.forward(request, response);
    }
}
