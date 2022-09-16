package servlet;

import java.util.ArrayList;
public class Singleto{
    ArrayList<Empleados> empleados = new ArrayList();
    ArrayList<Proyectos> proyectos = new ArrayList();
    ArrayList<Relaciones> relaciones = new ArrayList();    
	private static Singleto instancia = null;
	public static Singleto laconstructora(){
		if(instancia==null)
			instancia = new Singleto();
		return instancia;
	}
    public void AgregarEmpleado(String nom, String ape, String docu, String hab){
        Empleados tempo = new Empleados(nom,ape,docu,hab);
        empleados.add(tempo);
    }
    public Empleados BuscarEmpleado(String docu){ 
        Empleados tempo=null;
        for(Empleados empleado : empleados){
            if(empleado.getDocu().equals(docu)){
                tempo = empleado;
            }
        }
        return tempo;
    }
    public void AgregarProyecto(String nom, String cod, String des, String tim, String plat){
        Proyectos tempo = new Proyectos(nom,cod,des,tim,plat);
        proyectos.add(tempo);
    }
    public Proyectos BuscarProyecto(String docu){ 
        Proyectos tempo=null;
        for(Proyectos proyecto : proyectos){
            if(proyecto.getCod().equals(docu)){
                tempo = proyecto;
            }
        }
        return tempo;
    }
    public void AgregarRelacion(String cod, String docu, String tim, String respo){
        Relaciones tempo = new Relaciones(cod,docu,tim,respo);
        relaciones.add(tempo);
    }
    public Relaciones BuscarRelacionPE(String docu){ 
        Relaciones tempo=null;
        for(Relaciones relacion : relaciones){
            if(relacion.getDocu().equals(docu)){
                tempo = relacion;
            }
        }
        return tempo;
    }

    public Relaciones BuscarRelacionEP(String docu){ 
        Relaciones tempo=null;
        for(Relaciones relacion : relaciones){
            if(relacion.getCod().equals(docu)){
                tempo = relacion;
            }
        }
        return tempo;
    }
}