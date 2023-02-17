package ui;

import lombok.SneakyThrows;
import service.ISpecialite;
import service.SpecialiteService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "specialite" , urlPatterns = "/specialite")
public class SpecialiteServlet extends HttpServlet {
    ISpecialite iSpecialite ;
    @Override
    public void init() throws ServletException {
        super.init();
        iSpecialite = new SpecialiteService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    @SneakyThrows
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            request.setAttribute("specialites", iSpecialite.findAll());
            getServletContext().getRequestDispatcher("/WEB-INF/pages/specialite/specialitelist.jsp")
                    .forward(request,response);
        }catch (Exception e){
            throw e;
        }
    }
}
