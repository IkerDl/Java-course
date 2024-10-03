package com.ipartek.packageA;

public class ClaseB extends ClaseA{

    private String atributoPrivadoB;

    /////////////////////////////////////////////

    public void pruebaB(){
        //Desde aquí tengo acceso a los atributos y métodos public,default y
        //protected de la clase A (no tengo acceso a los miembros private de
        // la clase A)
        //Sin embargo tengo acceso a los atributos private de B

        //this.
    }
}
