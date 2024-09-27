package com.ipartek.objetos;

public class Animal {

    public void metodoAnimal(){

        System.out.println("soy un método de la clase Animal");

    }


    @Override
    public String toString() {
        return "Soy el toString sobreescrito en la clase Animal";
    }
}
