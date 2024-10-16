package com.ipartek.list.arraylist;

import com.ipartek.list.models.Arbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Arbol> bosque = new ArrayList<>();

        bosque.add(new Arbol("Fresno", 13.0));
        bosque.add(new Arbol("Roble", 10.0));
        bosque.add(new Arbol("Fresno", 13.0));
        bosque.add(new Arbol("Nogal", 9.0));
        bosque.add(new Arbol("Nogal", 11.0));
        bosque.add(new Arbol("Cerezo", 13.0));
        bosque.add(new Arbol("Cerezo", 8.0));
        bosque.add(new Arbol("Almendro", 3.0));
        bosque.add(new Arbol("Limonero", 4.0));
        bosque.add(new Arbol("Limonero", 4.0));

        // Un ArrayList tiene un orden natural de entrada (almacena
        // los objetos en el orden de entrada) y además
        // admite elementos duplicados.

        //System.out.println(bosque);

        // Para poder ordenar un ArrayList de un tipo propio (Arbol)
        // tenemos que cumplir una regla: el genérico (en nuestro ejemplo Arbol)
        //tiene que implementar la interface Comparable con su único método compareTo
        //Dentro del JDK hay innumerables clases que lo llevan implementado: String, Wrappers...

        //////////////////////////////////////////////////////////////////////
        //Demostración del método compareTo
        Arbol naranjo = new Arbol("Naranjo",3.0);
        Arbol secuoya = new Arbol ("Secuoya",100.0);
        
        int resultadoComparacion = naranjo.compareTo(secuoya);
        System.out.println("resultadoComparacion = " + resultadoComparacion);

        //////////////////////////////////////////////////////////////////////

        Collections.sort(bosque);//El método sort comprueba (en tiempo de desarrollo) si la clase Arbol tiene implementada la interface Comparable

        System.out.println(bosque);





    }
}
