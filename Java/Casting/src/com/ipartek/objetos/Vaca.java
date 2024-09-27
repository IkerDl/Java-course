package com.ipartek.objetos;

public class Vaca extends Animal {

    private String nombre;

    /////////////////////////////////


    public Vaca(String nombre) {
        this.nombre = nombre;
    }


    /////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /////////////////////////////////////

    public void metodoVaca(){

        System.out.println("Soy un método de la clase Vaca");
    }





    ///////////////////////////////////////



    @Override
    public String toString() {
        return "Soy el toString sobreescrito en la clase Vaca";
    }


}
