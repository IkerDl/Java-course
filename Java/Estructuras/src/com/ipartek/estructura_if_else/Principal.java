package com.ipartek.estructura_if_else;


import com.ipartek.models.Orco;

public class Principal {

    public static void main(String[] args) {

        Orco urk = new Orco("Urk",10,8,false);

        System.out.println(urk);
        System.out.println("Urk camina por el bosque y se encuentra con una llave");
        urk.setTieneLlave(true);

        System.out.println(urk);

        System.out.println("Se encuentra con un castillo y quiere entrar");

        if(urk.isTieneLlave()){

            System.out.println("Urk ha entrado en el castillo");

        }else{

            System.out.println("Urk no ha podido entrar en el castillo y ha pasado de largo");
        }


    }


}
