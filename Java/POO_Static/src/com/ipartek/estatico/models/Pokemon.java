package com.ipartek.estatico.models;

public abstract class Pokemon {

    private Double peso;
    private Tipo tipo;
    private Integer fuerza;
    private static Integer numeroPokemons = 0;
    private Integer nivelEntrenamiento;

    ////////////////////////////////////


    public Pokemon(Double peso, Tipo tipo, Integer fuerza, Integer nivelEntrenamiento) {
        this.peso = peso;
        this.tipo = tipo;
        this.fuerza = fuerza;
        this.nivelEntrenamiento = nivelEntrenamiento;
        numeroPokemons++;
    }

    ////////////////////////////////////


    public static Integer getNumeroPokemons() {
        return numeroPokemons;
    }

    public static void setNumeroPokemons(Integer numeroPokemons) {
        Pokemon.numeroPokemons = numeroPokemons;
    }

    public Integer getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(Integer nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }


    /////////////////////////////////////////////

    public static void metodoStaticPokemon(){

        ///metodoNoStaticPokemon();//no puedo acceder al contexto no static
        System.out.println("soy un método static y puedo ser invocado tanto desde el contexto static como el no static");
        System.out.println(numeroPokemons);//puedo acceder a atributos static
    }

    public static void metodoStaticPokemon2(){

        metodoStaticPokemon();//puedo acceder a un método static
    }

    public void metodoNoStaticPokemon(){
        metodoStaticPokemon();//puedo acceder al contexto static
        System.out.println("soy un método no static y no puedo ser invocado desde el contexto static");
        System.out.println(numeroPokemons);//puedo acceder a atributos static
    }

    public void luchar(Pokemon elContrincante){

        //Gana quien tenga mas fuerza
        //Comprobamos que elContrincante no sea yo mismo
        if(this == elContrincante){
            Mensaje.mensajeSimple("No quiero luchar conmigo mismo");
        }else{
            if(this.fuerza > elContrincante.fuerza){
                Mensaje.mensajeSimple("Ha vencido " + Utilidades.nombreClase(this));
            }else if(this.fuerza < elContrincante.fuerza){
                Mensaje.mensajeSimple("Ha vencido " + Utilidades.nombreClase(elContrincante));
            }else{
                Mensaje.mensajeSimple("Han empatado");
            }
        }


    }





    ///////////////////////////////////////////////


    @Override
    public String toString() {
        return "Pokemon{" +
                "peso=" + peso +
                ", tipo=" + tipo +
                ", fuerza=" + fuerza +
                ", nivelEntrenamiento=" + nivelEntrenamiento +
                '}';
    }
}
