package com.ipartek;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //De una consulta a una BBDD nos llega un teléfono con el 
        //siguiente formato: "    5256284000     "
        //Debemos modificarlo dejándolo así: (52)-5-6284000
        
        String telefonoInicial = "    5256284000     ";
        
        String telefonoInicial2 = telefonoInicial.trim();//"5256284000"
        String t1 = telefonoInicial2.substring(0,2);//"52"
        String t2 = telefonoInicial2.substring(2,3);//"5"
        String t3 = telefonoInicial2.substring(3);//"6284000"
        
        String telefonoFinal = "(" + t1 + ")" + "-" + t2 + "-" + t3;
        System.out.println("telefonoFinal = " + telefonoFinal);
        
        
        
    }
}
