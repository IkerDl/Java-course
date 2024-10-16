package com.ipartek.list.models;

import java.util.Objects;

public class Arbol implements Comparable<Arbol> {

    private String especie;
    private Double altura;


    ///////////////////////////////////////////////////////////////////////////////////

    public Arbol(String especie, Double altura) {
        this.especie = especie;
        this.altura = altura;
    }


    ///////////////////////////////////////////////////////////////////////////////////

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }


    ///////////////////////////////////////////////////////////////////////////////////



    ///////////////////////////////////////////////////////////////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arbol arbol = (Arbol) o;
        return Objects.equals(especie, arbol.especie) && Objects.equals(altura, arbol.altura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie, altura);
    }

    @Override
    public String toString() {
        return "Especie: " + this.especie + " - " + "Altura: " + this.altura;
    }

    @Override
    public int compareTo(Arbol o) {

        // La única condición que tenemos que cumplir es que el método devuelva un int:
        // 1) Si devuelve un int mayor que 0 this es mayor que o
        // 2) Si devuelve un int menor que 0 this es menor que o
        // 3) Si devuelve 0 this es igual que o en la comparación

        // Ordenamiento por altura de menor a mayor
        /*if(this.altura > o.altura){
            return 1;
        }else if(this.altura < o.altura){
            return -1;
        }else{
            return 0;
        }*/


        // Ordenamiento por orden alfabético
        // Es reseñable que el método comparareTo ES EL DE LA CLASE String!!!
        return especie.compareTo(o.especie) * -1;   //Alfabético inverso
        //return especie.compareTo(o.especie);      //Alfabético

    }

}
