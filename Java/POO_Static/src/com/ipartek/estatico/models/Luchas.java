package com.ipartek.estatico.models;

public abstract class Luchas {

    public static void luchar(Pokemon p1, Pokemon p2){

        //Gana quien tenga mas fuerza
        //Comprobamos que elContrincante no sea yo mismo
        if(p1 == p2){
            Mensaje.mensajeSimple("No quiero luchar conmigo mismo");
        }else{
            if(p1.getFuerza() > p2.getFuerza()){
                Mensaje.mensajeSimple("Ha vencido " + Utilidades.nombreClase(p1));
            }else if(p1.getFuerza() < p2.getFuerza()){
                Mensaje.mensajeSimple("Ha vencido " + Utilidades.nombreClase(p2));
            }else{
                Mensaje.mensajeSimple("Han empatado");
            }
        }
    }
}
