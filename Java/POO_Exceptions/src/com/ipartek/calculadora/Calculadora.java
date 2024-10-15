package com.ipartek.calculadora;

public class Calculadora {

    public static double dividir(){
        //Se puede producir un ArithmeticException (RuntimeException)
        Double[] datos = Mensajes.pideDatosUsuario();
        Double dividendo = datos[0];
        Double divisor = datos[1];

        if(divisor == 0){
            throw new DivisonPorCeroException("División entre 0");
        }

        return dividendo/divisor;

    }
}
