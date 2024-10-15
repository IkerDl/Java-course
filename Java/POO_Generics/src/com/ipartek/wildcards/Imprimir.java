package com.ipartek.wildcards;

import java.util.List;

public class Imprimir {

    //Podemos comprobar que los wildcard funcionan con tipos genéricos propios
    public static void imprimirBolsa(Bolsa<? extends Persona> item){

        System.out.println(item);
    }

    //Si intento pasar un objeto Bolsa de cualquier clase que herede de Persona
    //no va a funcionar porque, por ejemplo, un Bolsa<Carpintero> no hereda de
    //Bolsa<Persona> aunque Carpintero herede de Persona
    public static void imprimirBolsaPersona(Bolsa<Persona> item){

        System.out.println(item);
    }


    public static void imprimirMensajeSimple(String elMensaje){

        System.out.println(elMensaje);
    }


    public static void imprimirPersona(Persona laPersona){

        System.out.println(laPersona);
    }

    //Si intento pasar un List de cualquier clase que herede de Persona
    //no va a funcionar porque, por ejemplo, un List<Carpintero> no hereda de
    //List<Persona> aunque Carpintero herede de Persona
    public static void imprimirListaPersonas(List<Persona> laLista){

        System.out.println(laLista);

    }

    //El wildcard (?) en un genérico List o de Set, como en este caso,
    //admite cualquier clase
    public static void imprimirLista(List<?> laLista){

        System.out.println(laLista);

    }

    //Pero que sucede si queremos que un método como el anterior no admita
    //cualquier clase sino, por ejemplo, clases que hereden de Persona
    public static void imprimirListaGeneralPersonas(List<? extends Persona> laLista){

        System.out.println(laLista);

    }



}
