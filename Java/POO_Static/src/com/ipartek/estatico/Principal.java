package com.ipartek.estatico;

import com.ipartek.estatico.models.*;

import java.util.Objects;

public class Principal {

    public static void main(String[] args) {

        //pikachu1 pertenece al contexto no static porque es  una instancia
        Pikachu pikachu1 = new Pikachu(5.0, Tipo.ELECTRICO,5,7,5);
        //charmander1 pertenece al contexto no static porque es  una instancia
        Charmander charmander1 = new Charmander(6.0,Tipo.FUEGO,6,7,5);

        Humano ash = new Humano("Ash");
        Humano jessi = new Humano("Jessi");

        //lanzarPokeball es un método no static. Por lo tanto
        //se invoca desde una instancia
        //ash.lanzarPokeball(pikachu1);
        //ash.lanzarPokeball(pikachu1);

        //System.out.println(ash);

        //El método luchar, en las líneas de código que siguen,
        // es un método no static. Pertenece a las instancias
        pikachu1.luchar(charmander1);//this es pikachu1
        charmander1.luchar(pikachu1);//this es charmander1

        //Sin embargo el método luchar, en este caso, es un método static.
        //Pertenece a la clase
        Luchas.luchar(pikachu1,charmander1);

        //En el JDK tenemos múltiples ejemplos de métodos no static que
        //tienen su versión static generalmente en clases "helpers". Por
        //ejemplo el método equals en la clase helper "Objects" (no confundir con "Object")
        pikachu1.equals(charmander1);
        Objects.equals(pikachu1,charmander1);


    }
}
