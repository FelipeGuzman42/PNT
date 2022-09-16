package servlet;

public class Usuario {
	private String email, contra, tip, docu, nom, ape, cel;

	public Usuario() {
		this.email = "";
		this.contra = "";
		this.tip = "";
		this.docu = "";
		this.nom = "";
		this.ape = "";
		this.cel = "";
	}

	public Usuario(String email, String contra, String tip, String docu, String nom, String ape, String cel) {
		this.email = email;
		this.contra = contra;
		this.tip = tip;
		this.docu = docu;
		this.nom = nom;
		this.ape = ape;
		this.cel = cel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getDocu() {
		return docu;
	}

	public void setDocu(String docu) {
		this.docu = docu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + this.email + ", contraseña=" + this.contra + ", tipo=" + this.tip + ", documento="
				+ this.docu + ", nombre=" + this.nom + ", apellido=" + this.ape + ", celular=" + this.cel + "]";
	}

}