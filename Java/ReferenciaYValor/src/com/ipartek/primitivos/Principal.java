package com.ipartek.primitivos;

public class Principal {

    public static void main(String[] args) {
        System.out.println("comienza el codigo");
        int miEntero = 8;
        miMetodo(miEntero);
        System.out.println("fin del codigo. El valor de miEntero es: " + miEntero);


    }


    public static void miMetodo(int e){
        System.out.println("entro en el metodo");
        e = 345;
        System.out.println("termina el metodo y e vale: " + e);

    }


}
