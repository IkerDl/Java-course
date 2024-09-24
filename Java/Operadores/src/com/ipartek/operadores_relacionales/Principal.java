package com.ipartek.operadores_relacionales;

public class Principal {

    public static void main(String[] args) {

        //Sirven para verificar condiciones de igualdad, mayor, menor...
        //Siempre devuelven un booleano

        int a = -3;
        byte b = 5;
        float c = 1.1F;
        double d = 3.1415;
        boolean e = false;

        //Mayor
        boolean r1 = a > 3; //false

        //Menor
        boolean r2 = b < c; //false

        //Mayor o igual
        boolean r3 = b >= 5; //true

        //Menor o igual
        boolean r4 = d <= 56.78; //true

        //Comparación o igualdad
        boolean r5 = c == 1.1F; //true

        //Diferente
        boolean r6 = c != 1.1F; //false

        //Negación
        //Convierte una expresión true en false y
        //una expresión false en true
        boolean r7 = !e;//true




    }
}
