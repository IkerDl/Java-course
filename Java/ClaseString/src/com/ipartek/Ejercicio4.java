package com.ipartek;

import javax.swing.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Pedir mediante un panel de la API Swing de Java
        //un mensaje y mostrarlo en un API Swing

        String palabraElegida = JOptionPane.showInputDialog("Introduce una palabra");
        JOptionPane.showMessageDialog(null,palabraElegida);


    }
}
