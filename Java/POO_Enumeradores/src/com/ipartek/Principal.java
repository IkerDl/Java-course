package com.ipartek;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Automovil automovil1 = new Automovil(ColorAutomovil.AMARILLO,Fabricante.PORSCHE,TipoAutomovil.COUPE);
        Automovil automovil2 =  new Automovil(ColorAutomovil.ROJO,Fabricante.FERRARI,TipoAutomovil.SEDAN);
        Automovil automovil3 =  new Automovil(ColorAutomovil.AZUL,Fabricante.SEAT,TipoAutomovil.FURGON);
        //System.out.println(automovil1);

        List<Automovil> concesionario =  new ArrayList<>();

        concesionario.add(automovil1);
        concesionario.add(automovil2);
        concesionario.add(automovil3);

        for( Automovil elAuto : concesionario ){

            System.out.println(elAuto);

        }
        
        //Forma de crear una referencia en el Stack de un objeto de un enumerador
        Fabricante elFabricante = Fabricante.SEAT;
        ColorAutomovil elColorDelAutomovil = ColorAutomovil.AMARILLO;
        TipoAutomovil elTipoDeAutomovil = TipoAutomovil.SEDAN;
        
        Automovil automovil4 =  new Automovil(elColorDelAutomovil,elFabricante,elTipoDeAutomovil);
        
        ///////////////////////////////////////////////////////////////
        //MÉTODOS MÁS UTILIZADOS CON LOS ENUMERADORES
        ///////////////////////////////////////////////////////////////
        //Todos los enumeradores heredan de la clase Enum y heredan varios métodos
        
        //name
        //Devuelve un String con el nombre de la constante
        System.out.println(elFabricante.name());//"SEAT"
        System.out.println(elColorDelAutomovil.name());//"AMARILLO"
        
        //toString
        //Hace exactamente lo mismo que el método name
        System.out.println(elTipoDeAutomovil.toString());//"SEDAN"
        
        //values
        //Devuelve un Array con las constantes del enumerador
        ColorAutomovil[] valores = ColorAutomovil.values();
        
        for( ColorAutomovil miObjColor  : valores  ){

            System.out.println(miObjColor.getColorComercial());
            
        }
        
        //ordinal
        //Devuelve un entero según la posición en la que esté declarado el objeto
        //en el enumerador
        int posicion = elTipoDeAutomovil.ordinal();//0 - SEDAN
        System.out.println("posicion = " + posicion);
        
        
        
    }

}
