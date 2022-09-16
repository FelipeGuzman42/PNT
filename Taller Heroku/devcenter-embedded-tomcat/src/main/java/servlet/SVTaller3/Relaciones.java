package servlet;

public class Relaciones{
	private String cod, docu, tim, respo;
	public Relaciones(){
		this.cod = "";
        this.docu = "";
        this.tim = "";
        this.respo = "";
	}
	public Relaciones(String cod, String docu, String tim, String respo){
		this.cod = cod;
		this.docu = docu;
		this.tim = tim;
		this.respo = respo;
	}
	public String getCod(){
        return cod;
    }
    public void setCod(String cod){
        this.cod = cod;
    }

    public String getDocu(){
        return docu;
    }
    public void setDocu(String docu){
        this.docu = docu;
    }

	public String getTim(){
    	return tim;
    }
    public void setTim(String tim){
        this.tim = tim;
    }

    public String getRespo(){
    	return respo;
    }
    public void setRespo(String respo){
        this.respo = respo;
    }

    @Override
    public String toString(){
        return "Proyecto código: "+this.cod+" el empleado de documento: "+this.docu+" se demora: "+this.tim+" horas (desde el día de asignación),"
                +" y tiene "+this.respo+" horas semanales";
    }
}