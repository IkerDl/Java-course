package com.ipartek;

public class ElfoBosques extends Elfo{


    public ElfoBosques(String nombre, int fuerza, int inteligencia, int bondad) {
        super(nombre, fuerza, inteligencia, bondad);
    }

    ////////////////////////////////////////////////////////////////////

    public void hablarAnimales(){

        System.out.println("Hablar animales como Elfo de los Bosques");

    }


    //////////////////////////////////////////////////////////////////////

    @Override
    public void fabricarLembas() {
        System.out.println("Fabricar Lembas como Elfo de los Bosques");
    }

    @Override
    public void hacerMagia() {
        System.out.println("Hacer magia blanca y conjuros sanadores");
    }

    @Override
    public void cabalgar(Animal elAnimal) {
        System.out.println(this.getNombre() + " que es un Elfo de los Bosques cabalgando a " + elAnimal.getNombre());
    }

    @Override
    public void tirarConArco() {
        System.out.println("Tirar con arco como Elfo de los Bosques");
    }
}
