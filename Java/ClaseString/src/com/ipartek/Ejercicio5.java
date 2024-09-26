package com.ipartek;

import javax.swing.*;
import java.util.Locale;

public class Ejercicio5 {

    public static void main(String[] args) {

        //Pedir al usuario mediante un panel de la API Swing
        //que introduzca una frase en minúsculas.
        //Sacar la frase en mayúsculas utilizando la API Swing
        String laFrase = JOptionPane.showInputDialog("Introduce una frase en minúsculas");
        String laFraseMayuscula = laFrase.toUpperCase();
        JOptionPane.showMessageDialog(null, laFraseMayuscula);

        //JOptionPane.showMessageDialog(null,JOptionPane.showInputDialog("Introduce una frase en minúsculas").toUpperCase());

    }
}
