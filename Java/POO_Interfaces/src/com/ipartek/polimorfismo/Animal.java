package com.ipartek.polimorfismo;

public abstract class Animal extends MundoTolkien implements IComercializable{

    private String nombre;
    private Boolean domesticado;
    private Double precio;

    ///////////////////////////////////////////////

    public Animal(Ubicacion dondeEstoy, Double peso, String nombre, Boolean domesticado, Double precio) {
        super(dondeEstoy, peso);
        this.nombre = nombre;
        this.domesticado = domesticado;
        this.precio = precio;
    }


    ////////////////////////////////////////////////

    @Override
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getDomesticado() {
        return domesticado;
    }

    public void setDomesticado(Boolean domesticado) {
        this.domesticado = domesticado;
    }

    ///////////////////////////////////////////////

    @Override
    public String getDenominacion() {
        return this.getClass().getSimpleName() + " " + this.nombre;
    }


    //////////////////////////////////////////////





}
