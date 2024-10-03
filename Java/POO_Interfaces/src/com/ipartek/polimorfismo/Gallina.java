package com.ipartek.polimorfismo;

public class Gallina extends Animal implements IDomesticable{


    public Gallina(Ubicacion dondeEstoy, Double peso, String nombre, Boolean domesticado, Double precio) {
        super(dondeEstoy, peso, nombre, domesticado, precio);
    }

    /////////////////////////////////////////////////


    @Override
    public String toString() {
        return "================================================" + "\n" +
                "GALLINA: " + super.getNombre() + "\n" +
                "================================================" + "\n" +
                "Dónde se encuentra: " + super.getDondeEstoy() + "\n" +
                "Peso: " + super.getPeso() + "\n" +
                "Precio: " + super.getPrecio()  + "\n" +
                "Domesticado: " + (super.getDomesticado() ? "domesticado" : "salvaje") + "\n" +
                "================================================";

    }
}
