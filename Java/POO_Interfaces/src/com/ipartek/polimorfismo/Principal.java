package com.ipartek.polimorfismo;

public class Principal {

    public static void main(String[] args) {

        Humano gandalf = new Humano(Ubicacion.RIVENDEL,80.0,"Gandalf",8,10,Genero.MASCULINO,1000.0,Rol.MAGO);
        Caballo sombraGris = new Caballo(Ubicacion.RIVENDEL,400.0,"Sombra Gris",false,250.0,150.0);
        Barril barrilPolvora1 = new Barril(Ubicacion.GONDOR,20.0,"Pólvora",10.0);
        Orco urk = new Orco(Ubicacion.MORDOR,130.0,"Urk",9,4,Genero.MASCULINO,50.0,Rol.GUERRERO);
        Wargo dientitos = new Wargo(Ubicacion.MORDOR,350.0,"Dientitos",false,20.0,200.0);
        Gallina turuleta = new Gallina(Ubicacion.RIVENDEL,3.0,"Turuleta",false, 10.0);
        //gandalf.comprar(sombraGris);
        //gandalf.cabalgar(sombraGris);

        //gandalf.comprar(barrilPolvora1);

        //System.out.println(gandalf);
        //System.out.println(sombraGris);

        urk.comprar(dientitos);
        //urk.cabalgar(dientitos);
        urk.domesticar(turuleta);


        System.out.println(turuleta);


    }


}
