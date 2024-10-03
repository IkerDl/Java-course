package com.ipartek.polimorfismo;

public class Wargo extends Animal implements ICabalgable, IDomesticable{

    private Double cargaMaxima;

    /////////////////////////////////////////////////////////////////


    public Wargo(Ubicacion dondeEstoy, Double peso, String nombre, Boolean domesticado, Double precio, Double cargaMaxima) {
        super(dondeEstoy, peso, nombre, domesticado, precio);
        this.cargaMaxima = cargaMaxima;
    }

    ///////////////////////////////////////////////////////////////////


    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    ////////////////////////////////////////////////




    ///////////////////////////////////////////////

    @Override
    public String toString() {
        return "================================================" + "\n" +
                "WARGO: " + super.getNombre() + "\n" +
                "================================================" + "\n" +
                "Dónde se encuentra: " + super.getDondeEstoy() + "\n" +
                "Peso: " + super.getPeso() + "\n" +
                "Carga máxima: " + this.cargaMaxima  + "\n" +
                "Precio: " + super.getPrecio()  + "\n" +
                "Domesticado: " + (super.getDomesticado() ? "domesticado" : "salvaje") + "\n" +
                "================================================";

    }


}
