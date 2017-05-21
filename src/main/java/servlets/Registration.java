package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * Created by Yuriy on 23.04.2017.
 */
public class Registration extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("windows-1251");
        response.setCharacterEncoding("windows-1251");
        response.setContentType("text/html");
        if (request.getParameter("login") != null) {
            RequestDispatcher rd = request.getRequestDispatcher("/CheckUser");
            rd.forward(request,response);
        } else {
            if (request.getParameter("registration") != null) {
                RequestDispatcher rd = request.getRequestDispatcher("/registration.jsp");
                rd.forward(request,response);
            }else {
                RequestDispatcher rd = request.getRequestDispatcher("/registration.jsp");
                rd.forward(request, response);
            }
        }
    }
}
