package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "SVIngresar", 
        urlPatterns = {"/SVIngresar"}
    )
public class SVIngresar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        DP sing = DP.bob();
        Comprador buscado1 = sing.buscarComprador(req.getParameter("em"),req.getParameter("con"));
		Vendedor buscado2 = sing.buscarVendedor(req.getParameter("em"),req.getParameter("con"));
        if (buscado1 != null){
            String cadena = buscado1.toString();
            ServletOutputStream out = resp.getOutputStream();
            out.write(cadena.getBytes());
            out.flush();
            out.close();
        } else if (buscado2 != null){
			String cadena = buscado2.toString();
            ServletOutputStream out = resp.getOutputStream();
            out.write(cadena.getBytes());
            out.flush();
            out.close();
		}
    }
    
}