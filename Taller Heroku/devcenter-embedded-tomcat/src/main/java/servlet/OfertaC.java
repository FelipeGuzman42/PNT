package servlet;

public class OfertaC {
	private String nom, nomC, docu;
	private int prec;
	public OfertaC() {
		this.nom = "";
		this.prec = 0;
		this.nomC = "";
		this.docu = "";
	}
	public OfertaC(String nom, int prec, String nomC, String docu) {
		this.nom = nom;
		this.prec = prec;
		this.nomC = nomC;
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
	public String getnomC() {
		return nomC;
	}
	public void setnomC(String nomC) {
		this.nomC = nomC;
	}
	public String getDocu() {
		return docu;
	}
	public void setDocu(String docu) {
		this.docu = docu;
	}
	@Override
	public String toString() {
		return "OfertaV [Producto=" + nom + ", precio=" + String.valueOf(this.prec) + ", nombre comprador=" + nomC + "]";
	}
}
