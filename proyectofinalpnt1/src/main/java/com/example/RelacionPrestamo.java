package com.example.parcial;

public class RelacionPrestamo
{
    private String idEstudiante,isbn;

    public RelacionPrestamo()
    {
        this.idEstudiante="";
        this.isbn="";
    }

    public RelacionPrestamo(String idEstudiante, String isbn)
    {
        this.idEstudiante = idEstudiante;
        this.isbn = isbn;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "RelacionPrestamo{" +
                "idEstudiante='" + idEstudiante + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
