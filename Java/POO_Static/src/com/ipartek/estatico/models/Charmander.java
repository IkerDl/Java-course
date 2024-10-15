package com.ipartek.estatico.models;

public class Charmander extends Pokemon{

    private Integer fuerzaFuego;
    private static Integer numeroCharmanders = 0;

    ////////////////////////////////////////////////


    public Charmander(Double peso, Tipo tipo, Integer fuerza, Integer fuerzaFuego, Integer nivelEntrenamiento) {
        super(peso, tipo, fuerza, nivelEntrenamiento);
        this.fuerzaFuego = fuerzaFuego;
        numeroCharmanders++;//Desde el contexto no static SI tenemos acceso al contexto static
    }


    ///////////////////////////////////////////////


    public Integer getFuerzaFuego() {
        return fuerzaFuego;
    }

    public void setFuerzaFuego(Integer fuerzaFuego) {
        this.fuerzaFuego = fuerzaFuego;
    }

    public static Integer getNumeroCharmanders() {
        return numeroCharmanders;
    }

    public static void setNumeroCharmanders(Integer numeroCharmanders) {
        Charmander.numeroCharmanders = numeroCharmanders;
    }

    ///////////////////////////////////////////////////




    /////////////////////////////////////////////////////




}
