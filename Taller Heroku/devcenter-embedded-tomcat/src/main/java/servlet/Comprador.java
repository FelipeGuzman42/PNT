package servlet;

public class Comprador extends Usuario {
	private String ofertaPp, compras;

	public Comprador() {
		this.ofertaPp = "";
		this.compras = "";
	}

	public Comprador(String email, String contra, String tip, String docu, String nom, String ape, String cel,
			String ofertaPp, String compras) {
		super(email, contra, tip, docu, nom, ape, cel);
		this.ofertaPp = ofertaPp;
		this.compras = compras;
	}

	public String getOfertaPp() {
		return ofertaPp;
	}

	public void setOfertaPp(String ofertaPp) {
		this.ofertaPp = ofertaPp;
	}

	public String getCompras() {
		return compras;
	}

	public void setCompras(String compras) {
		this.compras = compras;
	}

	@Override
	public String toString() {
		return "Comprador [email=" + this.getEmail() + ", contraseña=" + this.getContra() + ", tipo=" + this.getTip()
				+ ", documento=" + this.getDocu() + ", nombre=" + this.getNom() + ", apellido=" + this.getApe()
				+ ", celular=" + this.getCel() + " oferta por producto=" + this.ofertaPp + ", compras=" + this.compras + "]";
	}

}
