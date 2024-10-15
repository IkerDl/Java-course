package com.ipartek.metodos;

public class Utilidades {

        /*public static void imprimirEnteros(Integer[] datos){

            for( Integer elDato   : datos    ){
                System.out.println(elDato);
            }

        }

        public static void imprimirDoubles(Double[] datos){

            for( Double elDato   : datos    ){
                System.out.println(elDato);
            }

        }


    public static void imprimirCadenas(String[] datos){

        for( String elDato   : datos    ){
            System.out.println(elDato);
        }

    }*/

    //Vamos a crear un método genérico que sustituya a los tres
    //anteriores
    //ES RESEÑABLE QUE UN MÉTODO GENÉRICO PUEDE EXISTIR DENTRO
    //DE UNA CLASE NO GENÉRICA

    public static <T> void imprimir(T[] datos){

        for( T elDato   : datos ){
            System.out.println(elDato);
        }

    }



}
