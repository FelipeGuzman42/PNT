<html>
<body>
<%@ page import='java.util.ArrayList' %>
<%! ArrayList<String> codigos = new ArrayList<String>();
ArrayList<String> info = new ArrayList<String>(); %>
<% 
	String valor=request.getParameter("op");
	if (valor.equals("Agregar")){
	String code = request.getParameter("cod");
	codigos.add(code);
	String datos = "El proyecto: "+request.getParameter("nom")+" se demora "+request.getParameter("sem")+", cuesta "+request.getParameter("pre")+" y está en "+request.getParameter("pla")+" plataformas.";
	info.add(datos);
	out.println("Datos han sido registrados");
	} else {
		for (int i=0; i<codigos.size(); i++){
			if (request.getParameter("codb").equals(codigos.get(i))){
				String cadena = codigos.get(i)+": "+info.get(i);
				out.println(cadena);
			}
		}
	}
%>
</body>
</html>