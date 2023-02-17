package ui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "user",urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("email");
        String password = request.getParameter("password");
       // response.getWriter().println("email: "+username+
             //   "\n password: "+ password);
        request.setAttribute("email",username);
        request.setAttribute("password",password);
        getServletContext().getRequestDispatcher("/WEB-INF/pages/userData.jsp")
                .forward(request,response);




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.getWriter().println("HELLO CLASS");
        getServletContext().getRequestDispatcher("/WEB-INF/pages/index.jsp")
                .forward(request,response);
    }
}
