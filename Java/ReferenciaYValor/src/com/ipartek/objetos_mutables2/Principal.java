package com.ipartek.objetos_mutables2;


import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        System.out.println("comienza la ruta");
        List<Persona> autobus = new ArrayList<>();
        System.out.println("¿Está vacío el autobus? " + (autobus.isEmpty() ? "Esta vacío" : "Hay algo de gente"));

        miMetodo(autobus);

        System.out.println("¿Está vacío el autobus? " + (autobus.isEmpty() ? "Esta vacío" : "Hay algo de gente"));

        System.out.println("termina la ruta");


    }

    public static void miMetodo(List<Persona> elAutobus){

        System.out.println("entro en el método");
        System.out.println("¿Está vacío el autobus? " + (elAutobus.isEmpty() ? "Esta vacío" : "Hay algo de gente"));
        elAutobus = new ArrayList<>();//Aquí rompemos el vinculo creando un nuevo objeto en el Heap

        elAutobus.add(new Persona());
        elAutobus.add(new Persona());
        elAutobus.add(new Persona());

        System.out.println("¿Está vacío el autobus? " + (elAutobus.isEmpty() ? "Esta vacío" : "Hay algo de gente"));

        System.out.println("termina el método");


    }

}
