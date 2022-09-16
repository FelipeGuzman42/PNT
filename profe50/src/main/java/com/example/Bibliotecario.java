package com.example.parcial;

public class Bibliotecario extends Usuario
{
    private String address,phone;

    public Bibliotecario() {
        super();
        this.address = "";
        this.phone = "";
    }

    public Bibliotecario(String mail, String password, String name, String document, String address, String phone) {
        super(mail, password, name, document);
        this.address = address;
        this.phone = phone;
    }
	
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
	
	@Override
    public String toString() {
        return this.mail + "," + this.password + "," + this.name + "," + this.docu + "," + this.address + "," + this.phone;
    }
}
