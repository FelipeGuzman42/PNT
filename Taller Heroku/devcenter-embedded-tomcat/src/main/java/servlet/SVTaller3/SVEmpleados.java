package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "SVEmpleados", 
        urlPatterns = {"/SVEmpleados"}
    )
public class SVEmpleados extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Singleto tempo = Singleto.laconstructora();
        tempo.AgregarEmpleado(req.getParameter("nombree"),req.getParameter("apellidoe"),req.getParameter("documentoe"),req.getParameter("habilidade"));
    }
}
