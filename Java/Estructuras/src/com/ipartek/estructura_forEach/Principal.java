package com.ipartek.estructura_forEach;

public class Principal {

    public static void main(String[] args) {

        String[] arboles = {"Abeto","Cerezo","Nogal","Almendro","Mandarino"};

        /*for(int i=0; i < arboles.length; i++){

        }*/

        for( String elArbol : arboles  ){

            System.out.println(elArbol);
        }

    }
}
