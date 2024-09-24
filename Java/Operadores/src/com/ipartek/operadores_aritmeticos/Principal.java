package com.ipartek.operadores_aritmeticos;

public class Principal {

    public static void main(String[] args) {
        
        int a = 6;
        int b = 2;
        
        double c = 123.67;
        double d = 45.78;
        
        //Suma
        int resultadoSuma = a + b;
        double resultadoSuma2 = c + d;
        
        //Resta
        int resultadoResta = a - b;
        
        //Multiplicación o producto
        int resultadoProducto = a * b;
        
        //División
        double resultadoDivision = c / d;
        System.out.println("resultadoDivision = " + resultadoDivision);

        /*double b2 = b;
        double a2 = a;
        double resultadoDivision2 = b2 / a2;*/ //Esto si funcionaría
        double resultadoDivision2 = b / a;//0.0 - (esto no funciona porque primero hace la división y la conversión
        System.out.println("resultadoDivision2 = " + resultadoDivision2);
        
        double resultadoDivision3 = c / 0;//Infinity
        System.out.println("resultadoDivision3 = " + resultadoDivision3);
        
        //Resto o módulo
        int resultadoModulo = a % b;//El operador es % pero NO ES TANTO POR CIENTO!!!
        
        //¿Es  4567 divisible entre 4?
        if(4567 % 4 == 0){
            System.out.println("Es divisible");
        }else{
            System.out.println("No es divisible");
        }
        
        String resultado = (4567 % 4 == 0) ? "Es divisible" :  "No es divisible";
        System.out.println("resultado = " + resultado);
        
        
    }
}
