package com.ipartek;

public class Automovil {

    private ColorAutomovil colorAutomovil;
    private Fabricante fabricante;
    private TipoAutomovil tipoAutomovil;

    ////////////////////////////////////////////////////


    public Automovil(ColorAutomovil colorAutomovil, Fabricante fabricante, TipoAutomovil tipoAutomovil) {
        this.colorAutomovil = colorAutomovil;
        this.fabricante = fabricante;
        this.tipoAutomovil = tipoAutomovil;
    }

    /////////////////////////////////////////////////////


    public ColorAutomovil getColorAutomovil() {
        return colorAutomovil;
    }

    public void setColorAutomovil(ColorAutomovil colorAutomovil) {
        this.colorAutomovil = colorAutomovil;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    ////////////////////////////////////////////////////////////






    //////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "===================================================" + "\n" +
                "AUTOMOVIL" + "\n" +
                "===================================================" + "\n" +
                "Nombre del fabricante: " + this.fabricante.getNombre() + "\n" +
                "Pais del fabricante: " + this.fabricante.getPais() + "\n" +
                "Tipo de automóvil: " + this.tipoAutomovil.getNombre() + "\n" +
                "Número de puertas: " + this.tipoAutomovil.getNumeroPuertas() + "\n" +
                "Descripción: " + this.tipoAutomovil.getDescripcion() + "\n" +
                "Color: " + this.colorAutomovil.getColorComercial() + "\n" +
                "Referencia del color: " + this.colorAutomovil.getRefColor() + "\n" +
                "===================================================";

    }
}
