package com.ipartek.packageA;

public class ClaseC {

    private String atributoPrivateC;

    ///////////////////////////////////////////

    public void pruebaC(){

        //Como ClaseC no hereda de A tenemos que hacer una instancia de la
        //ClaseA para hacer la comprobación

        ClaseA instanciaA = new ClaseA();

        //Desde aquí tenemos acceso a los atributos y métodos public, default
        //y protected de la ClaseA

        //instanciaA.

    }
}
