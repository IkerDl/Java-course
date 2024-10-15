package com.ipartek.clases;
//La T representa cualquier clase.
//Dentro de la clase podré utilizar
//tantos tipos genéricos como defina
//el parámetro <> en la declaración de la clase
//En este caso 1.
//public class CajaGenerica<T,M,A,Z,Y> { en este caso 5 etc.

public class CajaGenerica<T> {

    private T dato;

    /////////////////////////////////////


    public CajaGenerica(T dato) {
        this.dato = dato;
    }

    ///////////////////////////////////////


    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    //////////////////////////////////////


    @Override
    public String toString() {
        return "CajaGenerica{" +
                "dato=" + dato +
                '}';
    }


}
