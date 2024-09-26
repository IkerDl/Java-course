package com.ipartek;

public class Principal {

    public static void main(String[] args) {
        
        Gato gatoCallejero = new Gato();
        Gato mizifuz = new Gato(3,"Mizifuz");
        Gato zafiron =  new Gato(6);
        Gato felix = new Gato("Félix");

        //Java nunca deja los atributos de un objeto "en blanco"
        //1) a los objetos (por ejemplo un String) les da por defecto un valor null
        //2) a los valores numéricos les da por defecto un valor 0 (enteros) y 0.0 (punto flotante)
        //3) a los valores boolean les da por defecto un valor de false

        //Podemos crear un objeto con atributos por defecto (sin inicializar)
        //(mediante un constructor vacío)
        //y darles valores posteriormente mediante los seters
        gatoCallejero.setEdad(11);
        gatoCallejero.setNombre("Silvestre");
        

        System.out.println(gatoCallejero);
        System.out.println(mizifuz);
        System.out.println(zafiron);
        System.out.println(felix);

        String elMaullido = mizifuz.maullar(5,"Marramiaghhhh!!!");
        System.out.println("elMaullido = " + elMaullido);



        
    }
    
    
}
