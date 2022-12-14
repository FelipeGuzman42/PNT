package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "SVRelaciones", 
        urlPatterns = {"/SVRelaciones"}
    )
public class SVRelaciones extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Singleto tempo = Singleto.laconstructora();
        tempo.AgregarRelacion(req.getParameter("cod"),req.getParameter("doc"),req.getParameter("tim"),req.getParameter("hor"));
    }
    
}
