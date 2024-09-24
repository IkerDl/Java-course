package com.ipartek.operadores_logicos;

public class Principal {

    public static void main(String[] args) {

        //Los operadores lógicos evalúan una expresión
        //en la que pueden estar implicados varios operandos
        //y siempre retornan true o false

        int a = 3;
        int b = 5;
        int d = 10;
        int f = 5;
        int g = 5;

        //Operador & y el operador && (con cortocircuito)
        //En una expresion & o && todas las expresiones tienen que
        //ser true para que el resultado final sea true
        //El operador && cuando evalúa la primera expresión y ésta
        //es false no se molesta en evaluar las siguientes

        boolean resultado1 = (a>0) && (b==1);//El resultado es false y evalúa las dos expresiones
        boolean resultado2 = (b==1) && (a>0);//El resultado es false y NO evalúa la segunda expresión
        boolean resultado3 = (a>0) & (b==1);//El resultado es false y se evalúan las dos
        boolean resultado4 = (b==1) & (a>0);//El resultado es false y se evalúan las dos

        boolean resultado5 = (a == 3) && ( b == 4);//El resultado es false y se evalúan las dos porque la primera ha sido true
        boolean resultado6 = ( a*3 == 8) & ( b/5 ==1);//El resultado es false y se evalúa la segunda

        //Operador | (or) o || (or con cortocircuito)
        //En una expresion | o || solo una expresión tiene que
        //ser true para que el resultado final sea true
        //El operador || cuando evalúa la primera expresión y ésta
        //es true no se molesta en evaluar las siguientes

        boolean resultado7 = (a == 3) || (b == 8);//True y no se evalúa la segunda expresión
        boolean resultado8 = (a == 3) | (b == 8);//True y se evalúan las dos

        //EJEMPLO DE OPERADOR CON CORTOCIRCUÍTO Y SIN CORTOCIRCUITO
        //Y SUS IMPLICACIONES EN LAS VARIABLES "f" y "g"

        boolean resultado9 = (d==10) | (6 == f++);//True y f vale 6
        boolean resultado10 = (d==10) || (6 == g++);//true y g vale 5


    }
}
