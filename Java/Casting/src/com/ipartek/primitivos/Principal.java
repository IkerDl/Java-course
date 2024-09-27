package com.ipartek.primitivos;

public class Principal {

    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////////////
        //CASTING AUTOMÁTICO
        ///////////////////////////////////////////////////////////////////////////////
        //Para que esto suceda hacen falta dos premisas:
        //1) Los tipos tienen que ser compatibles (todos los tipos numéricos son compatibles)
        //Los tipos char son compatibles con los numéricos pero no admiten el casteo automático
        //El tipo boolean no es compatible con ninguno
        //2) Solo sucede cuando se hace de un tipo más pequeño a un tipo más grande
        
        //En estos ejemplos se cumplen ambas premisas:
        int i = 100;
        //hacemos un casteo automático a float
        float f = i;
        System.out.println("f = " + f);//100.0
        //...o por ejemplo de int a long
        long l = i;
        
        //Ahora vamos a intentar hacer un casting automático de int a char (son compatibles)
        int o = 169;
        
        //char ch = o;//comprobamos que a pesar de ser compatibles no podemos hacerlo automáticamente
        char ch = (char)o;//sin embargo si que podemos hacer un casting manual
        System.out.println("ch = " + ch);//©
        
        //boolean b = o;//No podemos hacerlo porque el tipo boolean es incompatible con todos

        ///////////////////////////////////////////////////////////////////////////////
        //CASTING MANUAL
        ///////////////////////////////////////////////////////////////////////////////
        //Si queremos asignar de un tipo más grande a uno más pequeño (siempre y cuando
        //sean compatibles) debemos hacerlo manualmente
        //Tenemos que ser cuidadosos para que no se produzca una pérdida de datos por
        //rango insuficiente en el nuevo tipo.
        //JAVA NO TE AVISA DE ESA PÉRDIDA DE DATOS!!!. ES EL PROGRAMADOR QUIEN ASUME
        //LA RESPONSABILIDAD!!!
        
        //Vamos a ver un caso de pérdida de datos...
        double miDouble = 74748494940949944004485858.8595959;
      
        long miLong = (long)miDouble;
        System.out.println("miLong = " + miLong);//9223372036854775807
        
        //Vamos a ver un caso en el que el casteo automático no se produce...
        int miInt = 1998575;
        //short miShort = miInt;//Java no lo hace por tratarse de un tipo inferior
        short miShort = (short)miInt;
        System.out.println("miShort = " + miShort);//32495
        
        int miIntPequeno = 23;
        short miShort2 = (short)miIntPequeno;
        System.out.println("miShort2 = " + miShort2);//23
        
        float miFloat = 75858585899.78F;
        int miInt3 = (int)miFloat;
        System.out.println("miInt3 = " + miInt3);//2147483647
        
        //Si intentamos pasar de float a double Java admite, como hemos visto anteriormente,
        //un casteo automático...
        double miDouble2 = miFloat;
        System.out.println("miDouble2 = " + miDouble2);//7.5858583552E10
        
        double miDouble3 = 92592595952250250.6777;
        float miFloat3 = (float)miDouble3;
        System.out.println("miFloat3 = " + miFloat3);//9.2592597E16
        
        
        
        
        
        
        
        
        
        
    }
}
