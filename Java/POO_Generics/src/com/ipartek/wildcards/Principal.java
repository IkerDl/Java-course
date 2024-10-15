package com.ipartek.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //Los Wildcards solo pueden existir
        //dentro de los <> (diamonds) de los tipos genericos
        Bolsa<String> laBolsaString = new Bolsa<>("Hola");
        Bolsa<Castillo>  laBolsaCastillo =  new Bolsa<>(new Castillo("Mordor"));
        Bolsa<Carpintero> laBolsaCarpintero = new Bolsa<>(new Carpintero("Felipe"));

        Imprimir.imprimirBolsa(laBolsaCarpintero);

        Bolsa<Persona> laBolsaPersona = new Bolsa<>(new Persona("Jose"));
        Imprimir.imprimirBolsaPersona(laBolsaPersona);
        //Imprimir.imprimirBolsaPersona(laBolsaCarpintero);//no es compatible




        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Pepito"));
        listaPersonas.add(new Persona("Juanito"));

        Imprimir.imprimirMensajeSimple("hola que tal");
        Imprimir.imprimirPersona(new Persona("Jaimito"));

        Imprimir.imprimirListaPersonas(listaPersonas);

        Musico musico1 = new Musico("Joaquín","Bajo");
        Musico musico2 = new Musico("Pedro","Batería");
        List<Musico> laBanda = new ArrayList<>();
        laBanda.add(musico1);
        laBanda.add(musico2);

        //No puedo hacer esto
        //En generics la herencia no funciona como nos podemos imaginar...
        //Si tengo un generico de un tipo (Persona) y un generico de un
        // tipo que hereda del tipo anterior (Musico) el generico de Musico
        // NO HEREDA DEL GENÉRICO DE PERSONA
        //Imprimir.imprimirListaPersonas(laBanda);//ESTO NO FUNCIONA


        //La solución sería emplear (en la clase Imprimir)
        //un método que reciba cualquier tipo de ArrayList (por ejemplo)
        //como el método "imprimirLista"
        Imprimir.imprimirLista(laBanda);//Puedo imprimir un ArrayList de Musico

        List<Castillo> castillos =  new ArrayList<>();
        castillos.add(new Castillo("Butrón"));
        castillos.add(new Castillo("Aranjuez"));

        Imprimir.imprimirLista(castillos);//Puedo imprimir un ArrayList de Castillo

        List<Carpintero> carpinteros = new ArrayList<>();
        carpinteros.add(new Carpintero("Enrique"));
        carpinteros.add(new Carpintero("Juán"));

        Imprimir.imprimirLista(carpinteros);

        Imprimir.imprimirListaGeneralPersonas(carpinteros);
        Imprimir.imprimirListaGeneralPersonas(laBanda);
        //Imprimir.imprimirListaGeneralPersonas(castillos);//No me deja dado que la clase Castillo NO hereda de Persona



    }
}
