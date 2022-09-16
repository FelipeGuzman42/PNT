package servlet;

import java.util.ArrayList;

public class DP {
	ArrayList<Comprador> compradores = new ArrayList<Comprador>();
	ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
	ArrayList<Producto> productos = new ArrayList<Producto>();
	ArrayList<OfertaV> ofertasV = new ArrayList<OfertaV>();
	ArrayList<OfertaC> ofertasC = new ArrayList<OfertaC>();
	private static DP instancia = null;
	//Contructor "bob"
	public static DP bob() {
		if (instancia == null)
			instancia = new DP();
		return instancia;
	}
	//Comprador
	public void agregarComprador(String email, String contra, String tip, String docu, String nom, String ape,
			String cel, String ofertaPp, String ventas) {
		Comprador tempo = new Comprador(email, contra, tip, docu, nom, ape, cel, ofertaPp, ventas);
		compradores.add(tempo);
	}

	public Comprador buscarComprador(String em, String cont) {
		Comprador tempo = null;
		for (Comprador compa : compradores) {
			if ((compa.getEmail().equals(em)) && (compa.getContra().equals(cont))) {
				tempo = compa;
			}
		}
		return tempo;
	}
	//Vendedor
	public void agregarVendedor(String email, String contra, String tip, String docu, String nom, String ape, String cel,
			String ofertaPv, String compras) {
		Vendedor tempo = new Vendedor(email, contra, tip, docu, nom, ape, cel, ofertaPv, compras);
		vendedores.add(tempo);
	}
	public Vendedor buscarVendedor(String em, String cont) {
		Vendedor tempo = null;
		for (Vendedor vent : vendedores) {
			if ((vent.getEmail().equals(em)) && (vent.getContra().equals(cont))) {
				tempo = vent;
			}
		}
		return tempo;
	}
	//Producto
	public void agregarProducto(String nom, String lug, String nomV, String desc, int cant, String date, String ppu,
			String docu) {
		Producto tempo = new Producto(nom, lug, nomV, desc, cant, date, ppu, docu);
		productos.add(tempo);
	}
	//Oferta Ventas
	public void agregarOfertaV(String nom, int prec, String nomV, String doc) {
		OfertaV tempo = new OfertaV(nom, prec, nomV, doc);
		ofertasV.add(tempo);
	}
	//Oferta Compras
	public void agregarOfertaC(String nom, int prec, String nomC, String doc) {
		OfertaC tempo = new OfertaC(nom, prec, nomC, doc);
		ofertasC.add(tempo);
	}
}
