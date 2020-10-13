package task_4;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//@WebServlet("/Filter2/showTime")
public class Filter2 extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        try{
//            Long deltaServerTime = Long.parseLong(req.getParameter("deltaServerTime"));
//            System.out.println(deltaServerTime);
//        }finally {
//
//        }
//
//        System.out.println("doPost");
//
//    }
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        Calendar.getInstance().setTimeInMillis(System.currentTimeMillis() + 3600L);
//        Date d1 = new Date();
////        SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss a");
//        SimpleDateFormat df = new SimpleDateFormat("a");    // AM PM
//        String formattedDate = df.format(d1);
//        System.out.println(System.currentTimeMillis());
//        System.out.println(formattedDate);
////        req.setAttribute("time", System.currentTimeMillis());
//        req.setAttribute("time", formattedDate);
////        getServletContext().getRequestDispatcher("/ShowServerTime.jsp").forward(req, resp);
//        RequestDispatcher view = req.getRequestDispatcher("/ShowServerTime.jsp");
//        view.forward(req, resp);
//    }

    // подключение к фильтру -> определение времени -> вывод 1 из 2 страницы с возможностью изменения времени.
    // по щелчку переходит в стартовое положение ( в начало )
}
