package com.ipartek.clases;

public class Vaca {

    private String nombre;

    /////////////////////////


    public Vaca(String nombre) {
        this.nombre = nombre;
    }

    ////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    ///////////////////////////



    ///////////////////////////


    @Override
    public String toString() {
        return "Vaca{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
