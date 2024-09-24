public class Pato extends Ave {

    private boolean migrador;

    ////////////////////////////////////////////

    public Pato(String especie, int edad, String genero, String plumaje, boolean migrador) {
        super(especie, edad, genero, plumaje);
        this.migrador = migrador;
    }


    ////////////////////////////////////////////


    public boolean isMigrador() {
        return migrador;
    }

    public void setMigrador(boolean migrador) {
        this.migrador = migrador;
    }

    ////////////////////////////////////////////

    public void nadar(){


    }

    ////////////////////////////////////////////


    @Override
    public void ponerHuevos(int nHuevos) {
        System.out.println("pone 3 huevos blancos");
    }

    @Override
    public void emitirSonido() {
        System.out.println("cuac cuac");
    }


    @Override
    public String toString() {
        return "Pato{" +
                "migrador=" + migrador +
                '}';
    }


}
