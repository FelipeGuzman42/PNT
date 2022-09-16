package com.example.parcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "Hello! This is a demo application linked to this tutorial: http://jkutner.github.io/2016/08/18/android-backend-api-heroku-retrofit.html";
  }
 //Principal
  @RequestMapping("/comprobar")
  @ResponseBody
  String comprobar(@PathVariable("name") String a, @PathVariable("contra") String b) {
    DP tempo = DP.bob();
    String cadena = tempo.comprobar(a,b);
	return cadena;
  }
//registro
  @RequestMapping("/registro")
  @ResponseBody
  void registro(@PathVariable("email") String a, @PathVariable("name") String b, @PathVariable("documento") String c, 
    @PathVariable("direccion") String d, @PathVariable("telefono") String e, @PathVariable("password") String f) {
    DP tempo = DP.bob();
    if(e != null){
      tempo.agregarBibliotecario(a, f, b, c, d, e);
    } else {
      tempo.agregarEstudiante(a, f, b, c, d);
    }
  }
//libro
  @RequestMapping("/buscar")
  @ResponseBody
  String buscar(@PathVariable("buscar") String g) {
    DP tempo = DP.bob();
    Libro lib = tempo.buscarLibros(g);
	String cadena = lib.toString();
	return cadena;
  }

  @RequestMapping("/todosLibros")
  @ResponseBody
  String todosLibros() {
    DP tempo = DP.bob();
    String cadena = tempo.traerLibros();
    return cadena;
  }
  
  @RequestMapping("/todasReservas")
  @ResponseBody
  String todasReservas(@PathVariable("documento") String g) {
    DP tempo = DP.bob();
    String cadena = tempo.verPrestamos(g);
    return cadena;
  }
 //actividad libro
	@RequestMapping("/agregar")
  @ResponseBody
  void agregar(@PathVariable("isbn") String a, @PathVariable("nombreL") String b, @PathVariable("autor") String c, 
    @PathVariable("descrip") String d, @PathVariable("palas") String e, @PathVariable("copi") String f) {
    DP tempo = DP.bob();
	tempo.agregarLibro(a, b, c, d, f, e);
  }
  
  @RequestMapping("/eliminar")
  @ResponseBody
  void eliminar(@PathVariable("isbn") String g) {
    DP tempo = DP.bob();
    tempo.eliminarLibro(g);
  }
  
  @RequestMapping("/reservar")
  @ResponseBody
  void reservar(@PathVariable("isbn") String g, @PathVariable("documento") String a) {
    DP tempo = DP.bob();
    tempo.agregarRelacionPrestamo(a, g);
  }
  //MBibliotecario
  @RequestMapping("/buscaregistro")
  @ResponseBody
  String buscaregistro(@PathVariable("documento") String g) {
    DP tempo = DP.bob();
    String cadena = tempo.buscarBibliotecario(g);
    return cadena;
  }
  //MEstudiante
  @RequestMapping("/buscaregistroE")
  @ResponseBody
  String buscaregistroE(@PathVariable("documento") String g) {
    DP tempo = DP.bob();
    String cadena = tempo.buscarEstudiante(g);
    return cadena;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
