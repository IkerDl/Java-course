package com.ipartek.excepciones;

public class Principal {

    public static void main(String[] args) {

        //Tenemos dos tipos de excepciones: checked (IOException)
        //y las unchecked (RuntimeException)
        //En el caso de que el error que se pueda producir sea de
        //de tipo checked el IDE nos avisará...porque su tratamiento
        //ES OBLIGATORIO
        //Generalmente las excepciones IOException (entrada - salida - ES)
        //tienen que ver con temas de API y BBDD (peticiones, consultas...)

        System.out.println("Aquí empieza el programa...");

        String[] nombres = {"Juanito","Pepito","Jaimito"};
        Integer[] numeros = { 4, 8, 0};

        //Se produce una Exception de tipo unchecked o RuntimeException
        //y el culpable es el programador.
        //Lo que debemos hacer es RESOLVERLO
        //String elNombre = nombres[5];//ArrayIndexOutOfBoundsException

        String elNombre = "";//Los bloques try-catch marcan diferentes contextos
        Integer resultado = null;
        //resultado = numeros[1]/numeros[2];
        try{
            int t = resultado;//NullPointerException
            resultado = numeros[1]/numeros[2];//ArithmeticException
            //Cuando se produce una Exception las líneas de código
            //que están por debajo no se leen
            elNombre = nombres[5];//ArrayIndexOutOfBoundsException

        }catch(ArithmeticException e){
            System.out.println("Se ha producido una ArithmeticException " + e.getMessage());

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Se ha producido una ArrayIndexOutOfBoundsException " + e.getMessage());

        }catch(Exception e){//El NullPointerException es atrapado aquí
            System.out.println("Se ha producido una Exception" + e.getMessage());

        }finally{
            System.out.println("Esto se ejecuta siempre: haya o no haya errores");
        }

        System.out.println("Aquí termina el programa...");

    }



}
