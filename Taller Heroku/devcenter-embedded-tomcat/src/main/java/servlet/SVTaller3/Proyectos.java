package servlet;

public class Proyectos{
	private String nom, cod, des, tim, plat;
	public Proyectos(){
		this.nom = "";
		this.cod = "";
		this.des = "";
		this.tim = "";
        this.plat = "";
	}
	public Proyectos(String nom, String cod, String des, String tim, String plat){
		this.nom = nom;
		this.cod = cod;
        this.des = des;
        this.tim = tim;
        this.plat = plat;
	}
	public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getCod(){
        return cod;
    }
    public void setCod(String cod){
        this.cod = cod;
    }

	public String getDes(){
    	return des;
    }
    public void setDes(String des){
        this.des = des;
    }

    public String getTim(){
    	return tim;
    }
    public void setTim(String tim){
        this.tim = tim;
    }

    public String getPlat(){
        return plat;
    }
    public void setPlat(String plat){
        this.plat = plat;
    }

    @Override
    public String toString(){
        return "Código: "+this.cod+": El proyecto: "+this.nom+" es: "+this.des+", se demora desarrollando: "+this.tim+" y funciona en: "+this.plat+".";
    }
}