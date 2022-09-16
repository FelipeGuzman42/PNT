package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "SVProyectos", 
        urlPatterns = {"/SVProyectos"}
    )
public class SVProyectos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Singleto tempo = Singleto.laconstructora();
        tempo.AgregarProyecto(req.getParameter("nombrep"),req.getParameter("codigop"),req.getParameter("descripcionp"),req.getParameter("tiempop"),req.getParameter("plataformasp"));
    }
    
}
