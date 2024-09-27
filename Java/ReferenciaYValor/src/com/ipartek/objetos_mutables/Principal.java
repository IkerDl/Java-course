package com.ipartek.objetos_mutables;


import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        System.out.println("empieza el programa");
        List<Gato> gatos = new ArrayList<>();
        List<Gato> gatosCopia = gatos;

        miMetodo(gatosCopia);


        System.out.println("termina el programa y en gatos tenemos: " + gatos);
        System.out.println("termina el programa y en gatosCopia tenemos: " + gatosCopia);


    }

    public static void miMetodo(List<Gato> losGatos){
        System.out.println("entro en el método");
        Gato mizifuz = new Gato();
        Gato zafiron = new Gato();
        Gato silvestre = new Gato();

        losGatos.add(mizifuz);
        losGatos.add(zafiron);
        losGatos.add(silvestre);

    }



}
