package ui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "accueil", urlPatterns = "/acceuil")
public class accueil extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect = request.getParameter("direction");
        if(redirect.equals("all")){
            getServletContext().getRequestDispatcher("/WEB-INF/pages/accueiladminuser.jsp")
                    .forward(request,response);
        }
        else{
            if(redirect.equals("admin")){
                getServletContext().getRequestDispatcher("/WEB-INF/pages/accueiladmin.jsp")
                        .forward(request,response);
            }
            else{
                getServletContext().getRequestDispatcher("/WEB-INF/pages/accueiluser.jsp")
                        .forward(request,response);
            }
        }
    }
}
