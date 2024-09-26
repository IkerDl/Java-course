package com.ipartek;

public class InmutabilidadObjetosString {

    public static void main(String[] args) {

        String parrafo = "Los Orcos";
        String parrafo2 = parrafo;

        System.out.println("El identity hash code de parrafo es: " + System.identityHashCode(parrafo));//245257410
        System.out.println("El identity hash code de parrafo2 es: " + System.identityHashCode(parrafo2));//245257410

        parrafo = "Los Elfos";
        System.out.println("El identity hash code de parrafo es: " + System.identityHashCode(parrafo));//1023892928

        parrafo2 = "Gollum";
        System.out.println("El identity hash code de parrafo2 es: " + System.identityHashCode(parrafo2));

        String parrafo3 = new String("Gollum");
        System.out.println("El identity hash code de parrafo3 es: " + System.identityHashCode(parrafo3));

        if(parrafo2 == parrafo3){

            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }

        if(parrafo2.equals(parrafo3)){

            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }




    }
}
