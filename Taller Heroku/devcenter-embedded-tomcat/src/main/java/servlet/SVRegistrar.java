package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "SVRegistrar", 
        urlPatterns = {"/SVRegistrar"}
    )
public class SVRegistrar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        DP sing = DP.bob();
		if(req.getParameter("tipo").equals("Comprador")){
			sing.agregarComprador(req.getParameter("email"),req.getParameter("contra"),req.getParameter("tipo"),req.getParameter("docu"),req.getParameter("nom"),req.getParameter("ape"),req.getParameter("cel"),"","");
		} else {
			sing.agregarVendedor(req.getParameter("email"),req.getParameter("contra"),req.getParameter("tipo"),req.getParameter("docu"),req.getParameter("nom"),req.getParameter("ape"),req.getParameter("cel"),"","");
		}
	}
}