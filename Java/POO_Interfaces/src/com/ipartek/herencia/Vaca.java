package com.ipartek.herencia;

public class Vaca extends Mamifero{

    public void metodoVaca(){

        System.out.println("Soy un método de Vaca");
    }

    @Override
    public void metodoMamifero() {

    }

    @Override
    public void metodoAnimal() {

    }


    @Override
    public void metodoIDos1() {
        System.out.println("metodo de IDos desde Vaca");
    }

    @Override
    public void metodoIUna1() {
        System.out.println("metodo de IUna desde Vaca");
    }

    @Override
    public void metodoIUna2() {
        System.out.println("metodo de IUna desde Vaca");
    }

}
