package com.ipartek;

public class Orco extends Humanoide{

    private int maldad;

    ///////////////////////////////////////////////


    public Orco(String nombre, int fuerza, int inteligencia, int maldad) {
        super(nombre, fuerza, inteligencia);
        this.maldad = maldad;
    }

    ///////////////////////////////////////////////


    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }


    ////////////////////////////////////////////////////////////////////

    public void robar(){

        System.out.println("Robando como Orco");
    }


    //////////////////////////////////////////////////////////////////////

    @Override
    public void cabalgar(Animal elAnimal) {
        System.out.println(this.getNombre() + " que es un Orco está cabalgando a " + elAnimal.getNombre());
    }

    @Override
    public void tirarConArco() {
        System.out.println("Tirar arco como Orco");
    }

    @Override
    public String toString() {
        return "Orco{" +
                "maldad=" + maldad +
                '}';
    }
}
