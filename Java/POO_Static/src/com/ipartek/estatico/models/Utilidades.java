package com.ipartek.estatico.models;


public abstract class Utilidades {

    public static String nombreClase(Pokemon elPokemon){

        return elPokemon.getClass().getSimpleName();
    }

}
