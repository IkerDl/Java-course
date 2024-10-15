package com.ipartek.metodos;

public class Principal {

    public static void main(String[] args) {

        Integer[] enteros = {1,2,3,4,5};
        Double[] doubles = { 4.6,6.7, 2.1,0.9,6.9};
        String[] cadenas = {"hola","adios","que","tal","hombre"};

        //Utilidades.imprimirEnteros(enteros);
        //Utilidades.imprimirDoubles(doubles);
        //Utilidades.imprimirCadenas(cadenas);
        Utilidades.imprimir(enteros);//aquí decido lo que es T
        Utilidades.imprimir(doubles);//aquí decido lo que es T
        Utilidades.imprimir(cadenas);//aquí decido lo que es T


    }
}
