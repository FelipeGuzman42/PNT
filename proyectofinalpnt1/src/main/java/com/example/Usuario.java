package com.example.parcial;

public class Usuario
{
    private String mail,password,name,docu;
    public Usuario()
    {
        this.mail="";
        this.password="";
        this.name="";
		this.docu="";
    }

    public Usuario(String mail, String password, String name, String docu) {
        this.mail = mail;
        this.password = password;
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
	public String getDocu() {
        return docu;
    }

    public void setDocu(String docu) {
        this.docu = docu;
    }
}
