package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "SVBuscarE", 
        urlPatterns = {"/SVBuscarE"}
    )
public class SVBuscarE extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Singleto tempo = Singleto.laconstructora();
        Empleados buscado = tempo.BuscarEmpleado(req.getParameter("cod"));
        if (buscado != null){
            String cadena = buscado.toString();
            ServletOutputStream out = resp.getOutputStream();
            out.write(cadena.getBytes());
            out.flush();
            out.close();
        }
    }
    
}
