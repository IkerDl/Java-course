package com.ipartek;

public abstract class Elfo extends Humanoide{

    //Al ser Elfo una clase abstracta
    //NO TIENE OBLIGACIÓN DE IMPLEMENTAR NINGÚN MÉTODO

    private int bondad;

    ////////////////////////////////////////////////////////////


    public Elfo(String nombre, int fuerza, int inteligencia, int bondad) {
        super(nombre, fuerza, inteligencia);
        this.bondad = bondad;
    }

    /////////////////////////////////////////////////////////////


    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }


    ///////////////////////////////////////////////////////////////

    public abstract void fabricarLembas();

    public abstract void hacerMagia();


    ///////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Elfo{" +
                "bondad=" + bondad +
                '}';
    }


}


