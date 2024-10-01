package com.ipartek.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public abstract class Humanoide extends MundoTolkien {

    private String nombre;
    private Integer fuerza;
    private Integer inteligencia;
    private Genero genero;
    private Double dinero;
    private List<Object> posesiones = new ArrayList<>();

    ////////////////////////////////////////////////////////////////


    public Humanoide(Ubicacion dondeEstoy, Double peso, Double precio, String nombre, Integer fuerza, Integer inteligencia, Genero genero, Double dinero) {
        super(dondeEstoy, peso, precio);
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.genero = genero;
        this.dinero = dinero;
    }

    //////////////////////////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

    public List<Object> getPosesiones() {
        return posesiones;
    }

    public void setPosesiones(List<Object> posesiones) {
        this.posesiones = posesiones;
    }

    /////////////////////////////////////////////////////////








    ///////////////////////////////////////////////////////////


}
