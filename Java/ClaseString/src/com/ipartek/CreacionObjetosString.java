package com.ipartek;

public class CreacionObjetosString {

    public static void main(String[] args) {
        
        //Creación de un objeto String de manera literal
        String miString = "Los Hobbits";
        //Esta forma de crear un objeto String en Java no puede 
        //llevar a la falsa sensación de que se trata de un primitivo
        //Pero no lo es.
        //Se trata de una "licencia" creada por los desarrolladores de Java
        //para que los programadores puedan crear objetos String de una manera
        //más sencilla.
        
        //Creación de un objeto String mediante un constructor
        String miString2 = new String("desayunan dos veces");

        //String cadenaVacia = new String( " ");
        
        String mensaje = miString + " " + miString2;
        System.out.println("mensaje = " + mensaje);


        
        
    }
}
