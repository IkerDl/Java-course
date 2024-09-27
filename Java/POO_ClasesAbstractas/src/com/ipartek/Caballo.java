package com.ipartek;

public class Caballo extends Animal {

    private String raza;


    ////////////////////////////////

    public Caballo(String raza) {
        this.raza = raza;
    }

    public Caballo(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }


    //////////////////////////////////

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    //////////////////////////////////////

    public void cocear(){

        System.out.println("Caballo coceando");
    }




    /////////////////////////////////////


    @Override
    public void emitirSonido() {
        System.out.println("caballo relinchando");
    }

    @Override
    public void comer() {
        System.out.println("Caballo comiendo hierba");
    }


    @Override
    public String toString() {
        return "Caballo{" +
                "raza='" + raza + '\'' +
                '}';
    }


}
