package servlet;

public class Vendedor extends Usuario {
	private String ofertaPv, ventas;

	public Vendedor() {
		this.ofertaPv = "";
		this.ventas = "";
	}

	public Vendedor(String email, String contra, String tip, String docu, String nom, String ape, String cel,
			String ofertaPv, String ventas) {
		super(email, contra, tip, docu, nom, ape, cel);
		this.ofertaPv = ofertaPv;
		this.ventas = ventas;
	}

	public String getOfertaPv() {
		return ofertaPv;
	}

	public void setOfertaPv(String ofertaPv) {
		this.ofertaPv = ofertaPv;
	}

	public String getventas() {
		return ventas;
	}

	public void setventas(String ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Comprador [email=" + this.getEmail() + ", contraseña=" + this.getContra() + ", tipo=" + this.getTip()
				+ ", documento=" + this.getDocu() + ", nombre=" + this.getNom() + ", apellido=" + this.getApe()
				+ ", celular=" + this.getCel() + " oferta por venta=" + this.ofertaPv + ", ventas=" + this.ventas + "]";
	}
}
