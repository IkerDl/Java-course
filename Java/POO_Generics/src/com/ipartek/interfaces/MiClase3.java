package com.ipartek.interfaces;

//En la implementación es donde decido lo que es T,A,B
public class MiClase3 implements MiInterfaceGenerica<Camion,Oveja,Edificio> {


    @Override
    public Camion metodo1(Camion s) {
        return null;
    }

    @Override
    public Edificio metodo2(Oveja a, Oveja b) {
        return null;
    }
}
