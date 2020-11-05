package com.appmiguel.petagram2;

public class Pet {

    private int foto;
    private String nombre;
    private String rating;


    public Pet() {

    }

    public Pet(int foto, String nombre, String rating) {
        this.foto = foto;
        this.nombre = nombre;
        this.rating = rating;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}
