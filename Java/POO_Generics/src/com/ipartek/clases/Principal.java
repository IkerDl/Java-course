package com.ipartek.clases;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        Caja caja1 = new Caja("Esta caja solo puede contener Strings");
        System.out.println("caja1 = " + caja1);
        Vaca pepita = new Vaca("Pepita");

        //AQUÍ DECIDO, COMO PROGRAMADOR, QUÉ ES T
        CajaGenerica<Vaca> caja2 = new CajaGenerica<>(pepita);
        CajaGenerica<String> caja3 =  new CajaGenerica<>("Hola");
        CajaGenerica<Integer> caja4 = new CajaGenerica<>(6);

        //AQUÍ DECIDO, COMO PROGRAMADOR, QUÉ E (EN LA CLASE GENÉRICA) ES VACA
        List<Vaca> establo = new ArrayList<>();


    }
}
