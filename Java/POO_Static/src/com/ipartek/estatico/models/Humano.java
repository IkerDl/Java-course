package com.ipartek.estatico.models;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Humano {

    private String nombre;
    private List<Pokemon> pokemonsAtrapados = new ArrayList<>();

    ///////////////////////////////////////////////////////////


    public Humano(String nombre) {
        this.nombre = nombre;
    }

    ///////////////////////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pokemon> getPokemonsAtrapados() {
        return pokemonsAtrapados;
    }

    public void setPokemonsAtrapados(List<Pokemon> pokemonsAtrapados) {
        this.pokemonsAtrapados = pokemonsAtrapados;
    }

    ////////////////////////////////////////////////////

    //Método no static. Tiene acceso al contexto static
    public void  lanzarPokeball(Pokemon target){
        //Un intento de atrapar un Pokemon tendrá
        //éxito si su fuerza es menor que 5
        //Un Pokemon perderá un punto de fuerza
        //cada vez que un Humano le lanza un Pokeball

       if( target.getFuerza() >= 5){
           //pokemon no atrapado
           //mensajeSimple es un método static. Por lo tanto se llama desde su clase (pertenece a su clase)
           Mensaje.mensajeSimple( Utilidades.nombreClase(target) + " no atrapado :(");


       }else{
           this.pokemonsAtrapados.add(target);
           Mensaje.mensajeSimple(Utilidades.nombreClase(target) +  " atrapado!!!");

       }

       //Le atrapemos o no le atrapemos pierde un punto
       target.setFuerza(target.getFuerza()-1);
       Mensaje.mensajeSimple(Utilidades.nombreClase(target) + " ha perdido un punto de fuerza");

    }




    ////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Humano{" +
                "nombre='" + nombre + '\'' +
                ", pokemonsAtrapados=" + pokemonsAtrapados +
                '}';
    }

}
