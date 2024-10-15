package com.ipartek.ocultamiento.models;

public class Gato extends Animal{

    //Lo primero que vamos a pensar es que la clase Gato está sobreescribiendo
    //el método static "metodoStaticAnimal"
    //Esto no es así porque los métodos static no se pueden sobreescribir.
    //Es realidad lo que está sucediendo es un fenómeno llamado OCULTAMIENTO

    //@Override //No podemos sobreescribir métodos static porque no son polimórficos
    public static void metodoStaticAnimal(){
        System.out.println("Hola desde Gato");
    }


    @Override
    public void metodoNoStaticAnimal() {
        System.out.println("Hola desde Gato");
    }
}
