package com.ipartek.objetos;

public class Principal {

    public static void main(String[] args) {

        Animal pepitaDisfrazada = new Vaca("Pepita");
        Animal elAnimal = new Animal();


        //Para hacer un downcast tenemos que estar seguros que
        //pepitaDisfrazada sea una Vaca porque la mayoría de las
        //veces el propio IDE no tiene suficiente información
        //para avisarnos de que la operación pueda llevarse o no
        //pueda llevarse a buen fin.
        //Para estar seguros tenemos un operador que nos asevera
        //si un objeto es de una determinada clase
        //Este operador es instanceof
        
        //Vamos a preguntar si pepitaDisfrazada es una Vaca

        String resultado = pepitaDisfrazada instanceof Vaca ? "Es una vaca" : "No es una Vaca";
        System.out.println("resultado = " + resultado);//Es una vaca

        //Ahora que estamos seguros sería un buen momento...
        Vaca pepita = (Vaca)pepitaDisfrazada;//downcast

        pepita.metodoVaca();//El objeto Vaca (pepita) recupera su método

        //Vamos a disfrazar otra vez a pepita
        //upcast

        /*Object pepitaDisfrazadaObject = (Object)pepita;
        String resultadoToString1 = pepitaDisfrazadaObject.toString();
        System.out.println("resultadoToString1 = " + resultadoToString1);*/

        Animal pepitaDisfrazadaAnimal = (Animal)pepita;

        String resultadoToString2 = pepitaDisfrazadaAnimal.toString();
        System.out.println("resultadoToString2 = " + resultadoToString2);



        String resultadoToString3 = elAnimal.toString();
        System.out.println("resultadoToString3 = " + resultadoToString3);
        
        
        String resultadoToString4 = pepitaDisfrazadaAnimal.toString();
        System.out.println("resultadoToString4 = " + resultadoToString4);


        //ERRORES CASTEO
        String miString = "Deep Purple";
        //Integer miInteger = (Integer)miString;//Tipos incompatibles

        Integer elInteger = 34;
        //Long elLong = (Long)elInteger;//Son tipos incompatibles!!!

        
        
        
        
        



        






    }
}
