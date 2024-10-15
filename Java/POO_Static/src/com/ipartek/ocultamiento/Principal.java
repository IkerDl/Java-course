package com.ipartek.ocultamiento;

import com.ipartek.ocultamiento.models.Animal;
import com.ipartek.ocultamiento.models.Gato;

public class Principal {

    public static void main(String[] args) {

        ////////////////////////////////////////////////
        //PRUEBA STATIC
        ////////////////////////////////////////////////
        Animal.metodoStaticAnimal();//Hola desde Animal
        //Animal.metodoNoStaticAnimal();//No es posible
        Gato.metodoStaticAnimal();//Hola desde Gato

        Animal animal = new Animal();
        Animal gatoDisfrazado = new Gato();
        Gato gato = new Gato();

        //Aunque es una pésima práctica esta es la única forma
        //que tenemos para observar los resultados y hacer un
        //anásisis de ellos...
        animal.metodoStaticAnimal();//Hola desde Animal
        gatoDisfrazado.metodoStaticAnimal();//Hola desde Animal (sorpresa!!!)
        gatoDisfrazado.metodoNoStaticAnimal();//Hola desde Gato
        gato.metodoStaticAnimal();//Hola desde Gato






    }


}
