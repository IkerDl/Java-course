package com.ipartek.polimorfismo;

public class Utilidades {

    public static Boolean compruebaMismoLugar(MundoTolkien item1, MundoTolkien item2){

       return item1.getDondeEstoy().toString().equals(item2.getDondeEstoy().toString());

    }

}
