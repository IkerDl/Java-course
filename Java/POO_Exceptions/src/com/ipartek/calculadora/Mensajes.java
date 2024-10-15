package com.ipartek.calculadora;

import javax.swing.*;

public class Mensajes {

    public static Double[] pideDatosUsuario(){
        Double dividendo = null;
        Double divisor = null;

        /*try{
            dividendo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el dividendo"));
            divisor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el divisor"));

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Por favor introduce un dato numérico");

        }*/

        //Se puede producir un NumberFormatException (RuntimeException)
        dividendo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el dividendo"));
        divisor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el divisor"));

        Double[] datos = {dividendo, divisor};

        return datos;

    }
}
