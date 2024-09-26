package com.ipartek.estructura_switch;

import com.ipartek.models.Orco;

public class Principal {

    public static void main(String[] args) {

        //El ejemplo de switch en la clase Orco
        String[] comidas = {"pollo","pan","manzana"};

        //comidas[0] es pollo
        //comidas[1] es pan
        //comidas[2] es manzana

        Orco urk = new Orco("Urk",8,10,false);

        urk.comer(comidas[0]);
        urk.comer(comidas[1]);
        urk.comer(comidas[2]);

        System.out.println(urk);



    }


}
