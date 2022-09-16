package com.example.parcial;

import java.util.ArrayList;

public class DP{
	ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
	ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	ArrayList<RelacionPrestamo> relaciones = new ArrayList<RelacionPrestamo>();
	ArrayList<Libro> libros = new ArrayList<Libro>();
	private static DP instancia = null;
	
	//Contructor "bob"
	public static DP bob() {
		if (instancia == null)
			instancia = new DP();
		return instancia;
	}
	
	//Bibliotecario
	public void agregarBibliotecario(String email, String contra, String nom, String docu, String dir, String tel) {
		Bibliotecario tempo = new Bibliotecario(email, contra, nom, docu, dir, tel);
		bibliotecarios.add(tempo);
	}
	public Bibliotecario comprobarBibliotecario(String em, String cont) {
		Bibliotecario tempo = null;
		for (Bibliotecario biblio : bibliotecarios) {
			if ((biblio.getMail().equals(em)) && (biblio.getPassword().equals(cont))) {
				tempo = biblio;
			}
		}
		return tempo;
	}
	public String buscarBibliotecario(String doc){
		Bibliotecario tempo = null;
		for (Bibliotecario biblio : bibliotecarios) {
			if (biblio.getDocu().equals(doc)) {
				tempo = biblio;
			}
		}
		return tempo.toString();
	}
	//Estudiante
	public void agregarEstudiante(String email, String contra, String nom, String code, String carr) {
		Estudiante tempo = new Estudiante(email, contra, nom, code, carr);
		estudiantes.add(tempo);
	}
	public Estudiante comprobarEstudiante(String em, String cont) {
		Estudiante tempo = null;
		for (Estudiante estu : estudiantes) {
			if ((estu.getMail().equals(em)) && (estu.getPassword().equals(cont))) {
				tempo = estu;
			}
		}
		return tempo;
	}
	public String buscarEstudiante(String doc){
		Estudiante tempo = null;
		for (Estudiante estu : estudiantes) {
			if (estu.getDocu().equals(doc)) {
				tempo = estu;
			}
		}
		return tempo.toString();
	}
	//Libro
	public void agregarLibro(String isbn, String name, String autor, String descri, String num, String key) {
		Libro tempo = new Libro(isbn,name,autor,descri,num,key);
		libros.add(tempo);
	}
	public Libro buscarLibros(String isbn) {
		Libro tempo = null;
		for (Libro lib : libros) {
			if (lib.getIsbn().equals(isbn)) {
				tempo = lib;
			}
		}
		return tempo;
	}
	public void eliminarLibro(String isbn)
	{
		Libro tempo = this.buscarLibros(isbn);
		libros.remove(tempo);
	}
	public String traerLibros()
	{
		String cadena = "";
		for (Libro lib : libros)
		{
			cadena = cadena + "\n"+ lib.toString();
		}
		return cadena;
	}
	//RelacionPrestamo

	public void agregarRelacionPrestamo(String idEstudiante, String isbn)
	{
		RelacionPrestamo tempo = new RelacionPrestamo(idEstudiante,isbn);
		relaciones.add(tempo);
	}

	public String verPrestamos(String idEstudiante)
	{
		String cadena = "";
		for (RelacionPrestamo rel : relaciones)
		{
			if (rel.getIdEstudiante().equals(idEstudiante))
			{
				cadena =cadena + "\n"+ rel.toString();
			}
		}
		return cadena;
	}
	//otros
	public String comprobar(String em, String cont){
		String cadena = null;
		Estudiante estu = comprobarEstudiante(em,cont);
		Bibliotecario biblio = comprobarBibliotecario(em,cont);
		if(estu == null){
			cadena = "true2" + "," + estu.getDocu();
		} else {
			cadena = "true1" + "," + biblio.getDocu();
		}
		return cadena;
	}
}
