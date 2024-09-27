package com.ipartek;

public class Principal {

    public static void main(String[] args) {

        Caballo furia = new Caballo("Furia","Andaluz");
        Humanoide irwee = new ElfoOscuro("Irwee",8,10,1);
        Wargo brutus = new Wargo("Brutus");

        Orco urk = new Orco("Urk",8,3,8);

        irwee.cabalgar(furia);
        urk.cabalgar(brutus);
        //irwee.tirarConArco();
        //furia.emitirSonido();





    }
}
