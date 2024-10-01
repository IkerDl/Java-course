package com.ipartek.polimorfismo;

public abstract class MundoTolkien {

    private Ubicacion dondeEstoy;
    private Double peso;
    private Double precio;

    ///////////////////////////////////////////////


    public MundoTolkien(Ubicacion dondeEstoy, Double peso, Double precio) {
        this.dondeEstoy = dondeEstoy;
        this.peso = peso;
        this.precio = precio;
    }

    /////////////////////////////////////////////////


    public Ubicacion getDondeEstoy() {
        return dondeEstoy;
    }

    public void setDondeEstoy(Ubicacion dondeEstoy) {
        this.dondeEstoy = dondeEstoy;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    ///////////////////////////////////////////////





    ////////////////////////////////////////////////
}
