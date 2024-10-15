package com.ipartek.genericVSwildcard;

import org.w3c.dom.xpath.XPathResult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        //////////////////////////////////////////////
        //MÉTODOS GENÉRICOS
        /////////////////////////////////////////////
        Impresora.imprimir(new Arbol("Abedul"));
        Impresora.imprimir(new Casa("Rue del Percebe 13"));
        Impresora.imprimir("Hola");

        //Podemos comprobar que esto funciona perfectamente: podemos
        //pasar cualquier clase que deseemos.

        //////////////////////////////////////////////
        //TIPOS DE RETORNO
        /////////////////////////////////////////////
        //Vamos a crear un método llamado mergeWildcard
        //que va a devolver un tipo "wildcard"...
        List<Number> numeros1 = new ArrayList<>();
        numeros1.add(5);//Integer
        numeros1.add(34L);//Long
        List<Number> numeros2 = new ArrayList<>();
        numeros2.add(23.8F);//Float
        numeros2.add(20.5);//Double
        //Dado que estamos pasando dos List<Number> al método como argumento
        //Esperaríamos recibir el mismo tipo de List
        //List<Number> numerosUnidos = mergeWildcard(numeros1,numeros2);
        List<?> numerosUnidos = mergeWildcard(numeros1,numeros2);

        //Ahora vamos a intentar lo mismo llamando a mergeWildcard2
        List<Number> numerosUnidos2 = mergeWildcard2(numeros1,numeros2);

        //Podemos llegar a la siguiente conclusión: cuando un método genérico
        //devuelve un tipo genérico (mergeWildcard2) deberíamos usar un
        //parámetro de tipo en lugar de un Wildcard (de esta forma controlamos
        //lo que devuelve el método)

        //////////////////////////////////////////////
        //LÍMITES O BOUNDS
        /////////////////////////////////////////////
        //GENERICS
        //El límite de un tipo genérico nos permite restringir qué tipos
        //podemos utilizar en el lugar del tipo genérico...
        //Esta característica de Java permite tratar genéricos de forma
        //polimórfica...
        //Por ejemplo, es posible que un método que opere con números
        //solo quiera aceptar instancias (objetos) de la clase Number
        //o de sus subclases.
        //Podemos utilizar tipos parametrizados de dos formas:
        // 1) de tipo ilimitado: List<T> REPRESENTA UNA LISTA DE TIPOS T (ver argumentos del metodo1 en la clase Impresora)
        Impresora.metodo1(numeros1);//numeros1 es un objeto de tipo List<Number>
        // 2) de tipo limitado: List<T extends Number> REPRESENTA UNA LISTA DE TIPOS T QUE HEREDEN DE NUMBER (ver metodo2 en la clase impresora)
        Impresora.metodo2(numeros1);//numeros1 es un objeto de tipo List<Number> por lo tanto lo admite
        List<String> palabras1 = new ArrayList<>();//Hacemos un objeto de tipo List<String> para ver si lo admite el metodo2
        palabras1.add("hola");
        palabras1.add("mundo");
        //Impresora.metodo2(palabras1);//no es admitido
        // NOTA: no podemos utilizar tipos parametrizados con límite INFERIOR (con wildcards si se puede)
        // NOTA2 : los tipos parametrizados pueden tener múltiples límites: List<T extends Number & Comparable) (con wildcards no se puede)

        //WILDCARDS
        //Podemos utilizar wildcards con limites de tres formas:
        // 1) Wildcards ilimitados: List<?> REPRESENTA UNA LISTA DE CUALQUIER TIPO (ver metodo3 de la clase Impresora)
        Impresora.metodo3(palabras1);//se admite un List de String (List<String>)
        Impresora.metodo3(numeros1);//se admite un List de Number (List<Number>)
        // 2) Wildcards con límite superior: List<? extends Number> (ver metodo4 de la clase Impresora)
        Impresora.metodo4(numeros1);//se admite un List de Number (List<Number>)
        //Impresora.metodo4(palabras1);//no se adminte un List de String (List<String>) porque String no hereda de Number
        //Vamos a hacer un ArrayList de cualquier clase que herede de Number...
        List<Double> double1 = new ArrayList<>();
        double1.add(234.56);
        double1.add(78.13);
        Impresora.metodo4(double1);//se admite un List de Double (List<Double>) porque Double hereda de Number

        // 3) Wildcards con límite inferior (esto es imposible con tipos genéricos): List<? super Double> REPRESENTA UNA LISTA DE INTEGER Y DE SUS SUPERTIPOS
        Impresora.metodo5(double1);// se admite un List de Double (List<Double>)
        Impresora.metodo5(numeros1);// se admite un List de Number (List<Number>) porque Number es super de Double
        //Vamos a hacer un List de Object...
        List<Object> objetos1 = new ArrayList<>();
        objetos1.add("Hola");
        objetos1.add(234.78);
        Impresora.metodo5(objetos1);//se admite un List de Object (List<Object>) porque Object es super de Double



    }

    //Este método "devuelve" wildcards
    public static <E> List<? extends E> mergeWildcard(List<? extends E> miLista, List<? extends E> miLista2){

        //Este método static recibe dos listas y las convierte en una sola lista
        return Stream.concat(miLista.stream(),miLista2.stream())
                .collect(Collectors.toList());

    }

    //Este método "devuelve" Generics
    public static <E> List<E> mergeWildcard2(List<? extends E> miLista, List<? extends E> miLista2){

        //Este método static recibe dos listas y las convierte en una sola lista
        return Stream.concat(miLista.stream(),miLista2.stream())
                .collect(Collectors.toList());

    }




}
