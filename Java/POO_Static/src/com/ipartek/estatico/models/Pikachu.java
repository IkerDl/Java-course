package com.ipartek.estatico.models;

public class Pikachu extends Pokemon{

    private Integer fuerzaElectrica;
    private static Integer numeroPikachus = 0;

    ///////////////////////////////////////


    public Pikachu(Double peso, Tipo tipo, Integer fuerza, Integer fuerzaElectrica, Integer nivelEntrenamiento) {
        super(peso, tipo, fuerza, nivelEntrenamiento);
        this.fuerzaElectrica = fuerzaElectrica;
        numeroPikachus++;
    }


    //////////////////////////////////////


    public Integer getFuerzaElectrica() {
        return fuerzaElectrica;
    }

    public void setFuerzaElectrica(Integer fuerzaElectrica) {
        this.fuerzaElectrica = fuerzaElectrica;
    }

    public static Integer getNumeroPikachus() {

        return numeroPikachus;
    }

    public static void setNumeroPikachus(Integer numeroPikachus) {
        Pikachu.numeroPikachus = numeroPikachus;
    }

    //////////////////////////////////////////////////







    ////////////////////////////////////////////////////





}
