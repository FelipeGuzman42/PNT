package servlet;

public class OfertaV {
	private String nom, nomV, docu;
	private int prec;
	public OfertaV() {
		this.nom = "";
		this.prec = 0;
		this.nomV = "";
		this.docu = "";
	}
	public OfertaV(String nom, int prec, String nomV, String docu) {
		this.nom = nom;
		this.prec = prec;
		this.nomV = nomV;
		this.docu = docu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getPrec() {
		return prec;
	}
	public void setPrec(int prec) {
		this.prec = prec;
	}
	public String getNomV() {
		return nomV;
	}
	public void setNomV(String nomV) {
		this.nomV = nomV;
	}
	public String getDocu() {
		return docu;
	}
	public void setDocu(String docu) {
		this.docu = docu;
	}
	@Override
	public String toString() {
		return "OfertaV [Producto=" + this.nom + ", precio=" + String.valueOf(this.prec) + ", nombre Vendedor=" + nomV + "]";
	}
	
}
