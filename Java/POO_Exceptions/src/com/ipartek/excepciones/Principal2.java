package com.ipartek.excepciones;

public class Principal2 {


    public static void main(String[] args) {

        //En este ejercicio, que es una continuación del anterior,
        //vamos a intentar ver la propagación de
        //una Exception a través del CallStack

        System.out.println("Aquí empieza el programa...");

        String[] nombres = {"Juanito","Pepito","Jaimito"};
        Integer[] numeros = { 4, 8, 0};

        String elNombre = "";//Los bloques try-catch marcan diferentes contextos
        Integer resultado = null;

        //miMetodo1(numeros);//ArithmeticException pero al no estar dentro de un bloque
        //try no recibirá tratamiento. Por lo tanto el programa petará.
        //Podremos ver el CallStack con la Exception y el orden de llamadas a los
        //métodos...

        try{

            miMetodo1(numeros);//ArithmeticException


        }catch(ArithmeticException e){
            System.out.println("Se ha producido una ArithmeticException y ha sido tratado en el main " + e.getMessage());

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Se ha producido una ArrayIndexOutOfBoundsException " + e.getMessage());

        }catch(Exception e){//El NullPointerException es atrapado aquí
            System.out.println("Se ha producido una Exception" + e.getMessage());

        }finally{
            System.out.println("Esto se ejecuta siempre: haya o no haya errores");
        }

        System.out.println("Aquí termina el programa...");

    }


    public static void miMetodo1(Integer[] elArray){

        miMetodo2(elArray);

    }

    public static void miMetodo2(Integer[] elArray){

        //Este try/catch se hará cargo del error producido en el miMetodo4
        //El JVM no seguirá buscando solución en el CallStack porque ya la ha encontrado
        try{
            miMetodo3(elArray);

        }catch(ArithmeticException e){
            System.out.println("Se ha producido una ArithmeticException y ha sido tratado en miMetodo2 " + e.getMessage());
        }


    }

    public static void miMetodo3(Integer[] elArray){

        miMetodo4(elArray);
    }

    public static void miMetodo4(Integer[] elArray){
        //Esto método (miMetodo4) va a intentar solucionar el error
        //pero no puede (no está preparado con un TryCatch)
        //Paro solucionarlo el JVM tratará de solucionarlo en el
        //método invocante (miMetodo3)...
        Integer resultado = elArray[1]/elArray[2];//ArithmeticException
    }


}
