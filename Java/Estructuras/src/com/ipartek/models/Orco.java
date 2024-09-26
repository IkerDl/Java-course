package com.ipartek.models;

public class Orco {

    private String nombre;
    private int fuerza; //de 0 a 10
    private int hambre; //de 0 a 10
    private boolean tieneLlave;

    //////////////////////////////////////////////


    public Orco(String nombre, int fuerza, int hambre, boolean tieneLlave) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.hambre = hambre;
        this.tieneLlave = tieneLlave;
    }

    //////////////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public boolean isTieneLlave() {
        return tieneLlave;
    }

    public void setTieneLlave(boolean tieneLlave) {
        this.tieneLlave = tieneLlave;
    }


    /////////////////////////////////////////////////////////////

    public void subirManzano(Manzano elManzano){


        System.out.println(this.nombre + " ha subido al manzano " + elManzano.getZona());
        //Si un orco se sube a un manzano y tiene hambre se come todas las manzanas
        //del manzano
        //Si no tiene hambre no come ninguna


        if(this.hambre > 0 && elManzano.getNumeroManzanas() > 0){

            while(elManzano.getNumeroManzanas() > 0){

                this.comer("manzana");//Se come una manzana
                int numeroDeManzanasQueQuedan = elManzano.getNumeroManzanas() - 1;
                elManzano.setNumeroManzanas( numeroDeManzanasQueQuedan );

            }

        }else{

            System.out.println(this.nombre + " no ha comido ninguna manzana");

        }


    }

    public void comer(String comida){

        //Dependiendo de lo que coma vamos a actuar
        //de la siguiente forma:
        //1) Si come pollo le quitamos 3 puntos de hambre
        //2) Si come pan le quitamos 2 puntos de hambre
        //3) Si come manzana le quitamos 1 punto de hambre

        /*switch (comida){

            case "pollo":
                this.hambre -= 3;
                break;
            case "pan":
                this.hambre -= 2;
                break;
            case "manzana":
                this.hambre -= 1;
                break;
            default:
                System.out.println("No comas porquerías!!!");
        }*/

        switch (comida) {
            case "pollo" -> this.hambre -= 3;
            case "pan" -> this.hambre -= 2;
            case "manzana" -> this.hambre -= 1;
            default -> System.out.println("No comas porquerías!!!");
        }

        if(this.hambre < 0){
            this.hambre = 0;
        }

    }

    public void entrenar(){

        //Al entrenar levantan una pesa y cada vez que la levantan
        //su fuerza aumenta en 1
        //No paran hasta tener una fuerza de 10
        //Si el orco que va entrenar ya tiene 10 de fuerza por lo menos va a
        //levantar la pesa una vez

        do{
            System.out.println("Levanta la pesa");
            this.fuerza += 1;
        }while(this.fuerza < 10);


        if(this.fuerza > 10){
            this.fuerza = 10;
        }


    }





    //////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Orco{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", hambre=" + hambre +
                ", tieneLlave=" + tieneLlave +
                '}';
    }
}
