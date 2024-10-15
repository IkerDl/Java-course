package com.ipartek.wildcards;

public class Castillo {

    private String nombre;

    ///////////////////////////////////

    public Castillo(String nombre) {
        this.nombre = nombre;
    }


    /////////////////////////////////


    @Override
    public String toString() {
        return "Castillo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


}
