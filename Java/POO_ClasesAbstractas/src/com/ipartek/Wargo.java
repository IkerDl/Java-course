package com.ipartek;

public class Wargo extends Animal {


    ///////////////////////////////////////////////


    public Wargo() {
    }

    public Wargo(String nombre) {
        super(nombre);
    }

    ////////////////////////////////////////////////
    @Override
    public void emitirSonido() {
        System.out.println("Ruge como un Wargo");
    }

    @Override
    public void comer() {
        System.out.println("Wargo comiendo carroña");
    }
}
