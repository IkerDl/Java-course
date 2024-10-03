package com.ipartek.polimorfismo;

public class Orco extends Humanoide{

    public Orco(Ubicacion dondeEstoy, Double peso, String nombre, Integer fuerza, Integer inteligencia, Genero genero, Double dinero, Rol rol) {
        super(dondeEstoy, peso, nombre, fuerza, inteligencia, genero, dinero, rol);
    }

    ///////////////////////////////////////





    ///////////////////////////////////////

    @Override
    public String toString() {
        return "==================================================" + "\n" +
                "ORCO " + super.getNombre() + "\n" +
                "==================================================" + "\n" +
                "Dinero: " + super.getDinero() + "\n" +
                "Rol: " + super.getRol().toString().toLowerCase() + "\n" +
                "Inteligencia: " + super.getInteligencia() + "\n" +
                "Fuerza: " + super.getFuerza() + "\n" +
                "Género: " + super.getGenero() + "\n" +
                "Dónde se encuentra: " + super.getDondeEstoy() + "\n" +
                "Peso: " + super.getPeso() + "\n" +
                "Posesiones: " + super.listadoSimplePosesiones() + "\n" +
                "==================================================";

    }




}
