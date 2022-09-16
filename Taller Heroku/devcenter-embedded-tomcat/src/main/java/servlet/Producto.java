package servlet;

public class Producto {
	private String nom, lug, nomV, desc, date, ppu, docu;
	private int cant;
	public Producto() {
		this.nom = "";
		this.lug = "";
		this.nomV = "";
		this.desc = "";
		this.cant = 0;
		this.date = "";
		this.ppu = "";
		this.docu = "";
	}

	public Producto(String nom, String lug, String nomV, String desc, int cant, String date, String ppu,
			String docu) {
		this.nom = nom;
		this.lug = lug;
		this.nomV = nomV;
		this.desc = desc;
		this.cant = cant;
		this.date = date;
		this.ppu = ppu;
		this.docu = docu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLug() {
		return lug;
	}

	public void setLug(String lug) {
		this.lug = lug;
	}

	public String getNomV() {
		return nomV;
	}

	public void setNomV(String nomV) {
		this.nomV = nomV;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPpu() {
		return ppu;
	}

	public void setPpu(String ppu) {
		this.ppu = ppu;
	}

	public String getDocu() {
		return docu;
	}

	public void setDocu(String docu) {
		this.docu = docu;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + this.nom + ", lugar=" + this.lug + ", Vendedor=" + this.nomV + ", descripción=" + this.desc + ", "
				+ "cantidad=" + String.valueOf(this.cant) + ", fecha=" + this.date + ", precio por unidad=" + this.ppu + "]";
	}
	
}
