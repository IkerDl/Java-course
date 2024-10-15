package com.ipartek.genericVSwildcard;

import java.util.List;

public class Impresora {

    //Esto es un método genérico que imprime cualquier objeto
    //que le pasemos
    public static <T> void imprimir(T item){

        System.out.println(item);
    }

    //Intentando hacer un ejemplo similar al anterior, pero con wildcards,
    //observamos que no podemos. Porque los Wildcards solo pueden existir
    //dentro de los <> (diamonds) de los tipos genericos
    /*public static void imprimir2( ? item){

        System.out.println(item);

    }*/

    //Ejemplo de tipo genérico no restringido o ilimitado
    public static <T> void metodo1(List<T> laLista){
        System.out.println(laLista);
    }


    //Ejemplo de tipo genérico restringido o limitado
    public static <T extends Number> void metodo2(List<T> laLista){
        System.out.println(laLista);
    }

    //Ejemplo de wilcard no restringido o ilimitado
    public static void metodo3(List<?> laLista) {
        System.out.println(laLista);
    }

    //Ejemplo de wilcard con límite superior
    public static void metodo4(List<? extends Number> laLista){

        System.out.println(laLista);
    }

    //Ejemplo de wildcard con límite inferior
    public static void metodo5(List<? super Double> laLista){

        System.out.println(laLista);
    }
}
