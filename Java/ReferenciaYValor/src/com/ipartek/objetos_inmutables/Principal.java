package com.ipartek.objetos_inmutables;

public class Principal {

    public static void main(String[] args) {
        String miString = "hola"; //new String("hola)

        miMetodo(miString);
        System.out.println(miString);

    }

    public static void miMetodo(String s){

        s = "Adiós";//Aquí rompemos el vinculo

    }
}
