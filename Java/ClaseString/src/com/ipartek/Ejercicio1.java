package com.ipartek;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Deletrea el siguiente String mostrándolo por consola
        //carácter a carácter
        //Debemos acordarnos que la clase String tiene un método
        //llamado toCharArray. Los arrays son iterables

        String texto = "Athletic Club";

        char[] miArray = texto.toCharArray();

        for( char laLetra  : miArray ){
            System.out.println(laLetra);
        }



    }
}
