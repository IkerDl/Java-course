package com.ipartek.operadores_incrementales;

public class Principal {

    public static void main(String[] args) {
        
        int a = 7;
        int b = 7;
        int c = 7;
        int d = 7;
        
        //Post incremento
        //El incremento se realiza después de la asignación
        int resultado1 = a++;
        System.out.println("resultado1 = " + resultado1);//7 y a vale 8
        
        //Pre incremento
        //El incremento se realiza antes de la asignación
        int resultado2 = ++b;
        System.out.println("resultado2 = " + resultado2);//8 y b vale 8

        //Post decremento
        //El decremento se realiza después de la asignación
        int resultado3 = c--;//7 y c vale 6

        //Pre decremento
        //El decremento se realiza antes de la asignación
        int resultado4 = --d;//6 y d vale 6
        
        
    }
}
