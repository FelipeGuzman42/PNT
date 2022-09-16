package com.example.parcial;

public class Libro
{
    private String isbn,name,autor,description;
    private String number;
    private String keywords;

    public Libro()
    {
        this.isbn="";
        this.name="";
        this.autor="";
        this.description="";
        this.number="";
        this.keywords=null;
    }

    public Libro(String isbn, String name, String autor, String description, String number, String keywords)
    {
        this.isbn = isbn;
        this.name = name;
        this.autor = autor;
        this.description = description;
        this.number = number;
        this.keywords = keywords;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", description='" + description + '\'' +
                ", number=" + number +
                ", keywords=" + keywords +
                '}';
    }
}
