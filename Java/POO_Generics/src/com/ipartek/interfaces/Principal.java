package com.ipartek.interfaces;

public class Principal {

    public static void main(String[] args) {

        MiClase miObjeto = new MiClase();
        MiInterface miObjeto2 = new MiClase();
        Object miObjeto3 = new MiClase();

        MiClase2 miObjeto4 = new MiClase2();
        MiInterfaceGenerica<Double,String,Short> miObjeto5 = new MiClase2();
        Object miObjeto6 = new MiClase2();

        MiClase3 miObjeto7 = new MiClase3();
        MiInterfaceGenerica<Camion,Oveja,Edificio> miObjeto8 = new MiClase3();
        Object miObjeto9 = new MiClase3();

        metodoPrueba(miObjeto5);


    }


    public static <T,A,B>  void metodoPrueba(MiInterfaceGenerica<T,A,B> item){

        System.out.println();


    }







}
