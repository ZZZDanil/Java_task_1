package task_6.game;


import task_6.CalculatorBean;
import task_6.ICalculator;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/game")
public class Game extends HttpServlet {

    @EJB
    GameBean ejb = new GameBean();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/t_6/game.jsp");
        rd.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (Integer.parseInt(request.getParameter("num")) == ejb.getNum()){
            request.getSession().setAttribute("r", true);
        }
        else{
            request.getSession().setAttribute("r", false);
        }
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/t_6/game_end.jsp");
        rd.forward(request, response);
    }
}
