package com.ipartek.estructura_while_dowhile;

import com.ipartek.models.Manzano;
import com.ipartek.models.Orco;

public class Principal {

    public static void main(String[] args) {

        Orco urk = new Orco("Urk",8,10,false);

        Manzano manzanoNorte = new Manzano("Norte",4,26);
        Manzano manzanoSur = new Manzano("Sur",3,64);

        urk.subirManzano(manzanoNorte);

        System.out.println(urk);
        System.out.println(manzanoNorte);

        urk.entrenar();

        System.out.println(urk);
        System.out.println(manzanoNorte);

        System.out.println("============================================");

        urk.entrenar();



    }
}
