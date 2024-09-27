package com.ipartek;

import java.util.Objects;

public class Principal {

    public static void main(String[] args) {

        Perro fifi = new Perro("Fifí","Marrón", "Canela");
        Perro dientitos = new Perro("Dientitos","Marrón","Canela");

        Gato fifi2 = new Gato("Fifí","Marrón","Canela");
        
        int hashCodeFifi = fifi.hashCode();
        System.out.println(hashCodeFifi);//-1970267068
        
        int hashCodeFifiElGato = fifi2.hashCode();
        System.out.println("hashCodeFifiElGato = " + hashCodeFifiElGato);//-1970267068
        
        String resultado = fifi.equals(dientitos)? "Son iguales" : "Son diferentes";
        System.out.println("resultado = " + resultado);
        
        String resultado2 = fifi.equals(fifi2)? "Son iguales" : "Son diferentes";
        System.out.println("resultado2 = " + resultado2);


        //En el JDK existe una clase Helper llamada Objects
        //Tiene un método estático llamado equals que nos permite
        //comparar dos objetos al igual que el método equals que
        //tienen todos los objetos de Java
        Objects.equals(fifi,fifi2);
        
        
        
       

    }

}
