package com.example.parcial;

public class Estudiante extends Usuario
{
    private String carrer;

    public Estudiante()
    {
        super();
        this.carrer="";
    }

    public Estudiante(String mail, String password, String name, String code, String carrer)
    {
        super(mail, password, name, code);
        this.carrer=carrer;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }
}
