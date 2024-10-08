package com.ipartek.clases;

import java.sql.SQLOutput;

public class Principal {

    public static void main(String[] args) {

        Caja caja1 = new Caja("Esta caja solamente puede contener strings");
        System.out.println("caja1 = " + caja1);
        Vaca pepita = new Vaca("Pepita");

        CajaGenerica<Vaca> caja2 = new CajaGenerica<>(pepita);
        System.out.println(caja2);
        CajaGenerica<String> caja3 = new CajaGenerica<>("Hola");
        System.out.println(caja3);

        CajaGenerica<Integer> caja4 = new CajaGenerica<>(3);
        System.out.println(caja4);
    }

}
