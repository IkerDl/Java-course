package com.ipartek.estatico.models;


import javax.swing.*;

public abstract class Mensaje {

    public static void mensajeSimple(String elMensaje){
        JOptionPane.showMessageDialog(null,elMensaje);
    }

}
