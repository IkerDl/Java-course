package com.ipartek;

public class MetodosClaseString {

    public static void main(String[] args) {
        
        String hechizo = "ABRACADABRA";
        String elQuijote = "En un lugar de la Mancha";
        String cadena1 = "cadena1";
        String cadena2 = "cadena2";
        
        
        //Método lenght: devuelve el número de caracteres que tiene un String
        int numeroCaracteres = hechizo.length();
        System.out.println("numeroCaracteres = " + numeroCaracteres);
        
        //Método toUpperCase: convierte toda la cadena en mayúsculas
        String elQuijoteMayuscula = elQuijote.toUpperCase();
        System.out.println("elQuijoteMayuscula = " + elQuijoteMayuscula);
        
        //Método toLowerCase: convierte toda la cadena en minúsculas
        String hechizoMinusculas = hechizo.toLowerCase();
        System.out.println("hechizoMinusculas = " + hechizoMinusculas);
        
        //Método charAt: devuelve el caracter correspondiente al índice
        //que le pasamos como argumento
        char elCaracter = elQuijote.charAt(4);//empieza por 0
        System.out.println("elCaracter = " + elCaracter);
        
        //Método substring: partiendo de una cadena obtenemos un subcadena
        //probamos la primera sobrecarga
        String miSubcadena = hechizo.substring(3,8);//el primer parámetro es inclusivo. El segundo es exclusivo
        System.out.println("miSubcadena = " + miSubcadena);
        //probamos la segunda sobrecarga
        String miSubcadena2 = hechizo.substring(7);// el parámetro es inclusivo
        System.out.println("miSubcadena2 = " + miSubcadena2);

        //Método concat: sirve para concatenar cadenas
        String concatenacion = hechizo.concat(elQuijote).concat(" ").concat(hechizo);
        System.out.println("concatenacion = " + concatenacion);
        
        //Método endsWith: devuelve un booleano indicando si el String
        //termina con la cadena indicada como argumento
        
        String miArchivo = "flores.png";
        boolean esPNG = miArchivo.endsWith(".png");
        System.out.println("esPNG = " + esPNG);
        
        
        //Método trim: elimina los espacios en blanco que puedieran haber
        //al principio o al final de un String
        String pelicula = "      El dormilón    ";
        String peliculaLimpiaDeEspacios = pelicula.trim();
        System.out.println("peliculaLimpiaDeEspacios = " + peliculaLimpiaDeEspacios);

        //Método equals: no es específico de la clase String (lo tienen todos los objetos
        // heredado de la clase Object). En la implementación que el JDK hace en la clase
        //String (override) se puede decir que la comparativa la hace desde un punto de vista
        //"humano".

        String animal = "León";
        //String animal2 = new String("León");
        String animal2 = "León"; //Si creamos LITERALMENTE dos strings "humanamente" iguales
        //Java no crea un nuevo objeto. Interpreta que las dos variables van a apuntar al
        //mismo objeto

        //Estas dos cadenas son "visualmente" iguales (aunque son diferentes objetos)
        //Si hacemos la comparativa con "==" el resultado, sorprendente, es que las cadenas
        //son diferentes. Esto es porque son diferentes objetos y el "==" compara su idéntity
        //hash code que es único y por lo tanto diferente.
        boolean resultadoIgualdad = animal == animal2; //false
        //¿Qué debemos hacer? utilizar el método equals.
        boolean resultadoIgualdad2 = animal.equals(animal2); //true

        //Método toCharArray: convierte un String en un array de caracteres
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        char[] miArrayDeCaracteres = abecedario.toCharArray();//{'a','b','c'...}

        for( char miCaracter :  miArrayDeCaracteres ){

            System.out.println(miCaracter);
        }

        //System.out.println(miArrayDeCaracteres);


        //Método split: devuelve un array de Strings tomando la cadena original
        //y separándola según el String (separador o regex) que le pasemos como argumento

        String disco = "Abbey Road";
        String[] palabras = disco.split(" ");//{"Abbey","Road"}

        for( String laPalabra : palabras  ){

            System.out.println(laPalabra);

        }

        
        
    }
}
