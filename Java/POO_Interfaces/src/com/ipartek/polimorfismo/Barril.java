package com.ipartek.polimorfismo;

public class Barril extends MundoTolkien implements IComercializable{

    private String contenido;//polvora, huevos, pescado...
    private Double precio;


    ///////////////////////////////////////////////////////

    public Barril(Ubicacion dondeEstoy, Double peso, String contenido, Double precio) {
        super(dondeEstoy, peso);
        this.contenido = contenido;
        this.precio = precio;
    }


    ///////////////////////////////////////////////////////

    @Override
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }



    ////////////////////////////////////////////////////////

    @Override
    public String getDenominacion() {
        return "Barril de " + this.contenido;
    }




    //////////////////////////////////////////////////////////



}
