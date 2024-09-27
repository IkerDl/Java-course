package com.ipartek;

public class Principal {

    public static void main(String[] args) {

        //////////////////////////////////////////////////////
        //BOXING
        /////////////////////////////////////////////////////

        //Autoboxing
        Integer miWrapperInteger = 67;//automáticamente Java convierte un int en un Integer
        Boolean miWrapperBoolean = true;
        Double miWrapperDouble = 9852298.74577;
        //...pero tenemos que tener en cuenta el valor que pasamos...
        //Short miWrapperShort = 8588898998;//No podemos meter un valor muy grande en una variable en la que no quepa
        //Double miWrapperDouble2 = true; //Son tipos incompatibles
        
        //Boxing manual
        Integer miWrapperInteger2 = Integer.valueOf("234666262");
        System.out.println("miWrapperInteger2 = " + miWrapperInteger2);
        Double miWrapperDouble3 = Double.valueOf("756578.7898");


        //////////////////////////////////////////////////////
        //UNBOXING
        /////////////////////////////////////////////////////

        //Autounboxing
        int miPrimitivoInt = miWrapperInteger;//La nueva variable ya no tiene propiedades ni métodos
        boolean miPrimitivoBoolean = miWrapperBoolean;
        //short miPrimitivoShort = miWrapperInteger2;//No es posible
        //boolean miPrimitivoBoolean2 = miWrapperDouble;//No es posible
        Integer miIntegerNull = null;
        //int miPrimitivoInt2 = miIntegerNull;//NullPointerException

        //Unboxing manual
        int miPrimitivoInt3 = miWrapperInteger.intValue();
        double miPrimitivoDouble4 = miWrapperDouble3.doubleValue();


        ////////////////////////////////////////////////////////////////////////
        //LOS WRAPPERS SON INMUTABLES!!!
        ///////////////////////////////////////////////////////////////////////



    }
}
