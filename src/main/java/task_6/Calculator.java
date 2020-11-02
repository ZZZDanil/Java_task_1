package task_6;


import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculatorFirst")
public class Calculator extends HttpServlet {

    @EJB
    ICalculator ejb;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ejb = new CalculatorBean();
        float a = Float.parseFloat(req.getParameter("a"));
        float b = Float.parseFloat(req.getParameter("b"));
        if (req.getParameter("operation").equals("a")) {
            System.out.println(ejb.addition(a, b));
            resp.getWriter().println((int) ejb.addition(a, b));
        } else if (req.getParameter("operation").equals("s")) {

            resp.getWriter().println((int) ejb.substraction(a, b));
        } else if (req.getParameter("operation").equals("m")) {
            resp.getWriter().println((int) ejb.multiplication(a, b));
        } else {
            resp.getWriter().println((int) ejb.division(a, b));
        }
    }
}
