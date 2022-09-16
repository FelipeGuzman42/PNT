package servlet;

public class Empleados{
	private String nom, ape, docu, hab;
	public Empleados(){
		this.nom = "";
		this.ape = "";
		this.docu = "";
		this.hab = "";
	}
	public Empleados(String nom, String ape, String docu, String hab){
		this.nom = nom;
		this.ape = ape;
		this.docu = docu;
		this.hab = hab;
	}
	public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getApe(){
        return ape;
    }
    public void setApe(String ape){
        this.ape = ape;
    }

	public String getDocu(){
    	return docu;
    }
    public void setDocu(String docu){
        this.docu = docu;
    }

    public String getHab(){
    	return hab;
    }
    public void setHab(String hab){
        this.hab = hab;
    }

    @Override
    public String toString(){
    	return "Documento: "+this.docu+": Empleado de nombre: "+this.nom+" "+this.ape+" y habilidad: "+this.hab;
    }
}