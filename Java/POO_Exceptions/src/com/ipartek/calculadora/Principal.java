package com.ipartek.calculadora;

public class Principal {

    public static void main(String[] args) {


        Double resultado = null;
        System.out.println("Aqui empieza el programa");

        try{
            resultado = Calculadora.dividir();
            System.out.println(resultado);

        }catch(DivisonPorCeroException e){

            System.out.println(e.getMessage());

        }catch(NumberFormatException e){
            System.out.println("El usuario ha metido mal los datos");

        }

        System.out.println("Aqui termina el programa");



    }


}
