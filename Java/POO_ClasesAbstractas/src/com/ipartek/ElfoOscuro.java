package com.ipartek;

public class ElfoOscuro extends Elfo{


    public ElfoOscuro(String nombre, int fuerza, int inteligencia, int bondad) {
        super(nombre, fuerza, inteligencia, bondad);
    }

    ///////////////////////////////////////////////////////////




    ////////////////////////////////////////////////////////////






    /////////////////////////////////////////////////////////////

    @Override
    public void fabricarLembas() {
        System.out.println("Elfo Oscuro fabricando Lembas");
    }

    @Override
    public void hacerMagia() {
        System.out.println("Elfo Oscuro haciendo conjuros negros");
    }

    @Override
    public void cabalgar(Animal elAnimal) {

        System.out.println(this.getNombre() + " que es un Elfo Oscuro está cabalgando a " + elAnimal.getNombre());
    }

    @Override
    public void tirarConArco() {
        System.out.println("Tirar con arco como Elfo Oscuro");
    }
}
