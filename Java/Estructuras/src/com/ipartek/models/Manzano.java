package com.ipartek.models;

public class Manzano {

    private String zona;
    private int altura;
    private int numeroManzanas;

    //////////////////////////////////////////

    public Manzano(String zona, int altura, int numeroManzanas) {
        this.zona = zona;
        this.altura = altura;
        this.numeroManzanas = numeroManzanas;
    }


    //////////////////////////////////////////


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getNumeroManzanas() {
        return numeroManzanas;
    }

    public void setNumeroManzanas(int numeroManzanas) {
        this.numeroManzanas = numeroManzanas;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    /////////////////////////////////////////////////







    ///////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Manzano{" +
                "zona='" + zona + '\'' +
                ", altura=" + altura +
                ", numeroManzanas=" + numeroManzanas +
                '}';
    }
}
