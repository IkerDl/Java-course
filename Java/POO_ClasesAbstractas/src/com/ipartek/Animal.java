package com.ipartek;

public abstract class Animal {

    private String nombre;

    /////////////////////////////////////////


    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    //////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    ///////////////////////////////////////////////////////

    public abstract void emitirSonido();
    public abstract void comer();


    ////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


}
