package com.ipartek.polimorfismo;

public abstract class MundoTolkien {

    private Ubicacion dondeEstoy;
    private Double peso;


    ///////////////////////////////////////////////

    public MundoTolkien(Ubicacion dondeEstoy, Double peso) {
        this.dondeEstoy = dondeEstoy;
        this.peso = peso;
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



    ///////////////////////////////////////////////





    ////////////////////////////////////////////////



}
