public class Gorrion extends Ave {

    private boolean urbano;

    ////////////////////////////

    public Gorrion(String especie, int edad, String genero, String plumaje, boolean urbano) {
        super(especie, edad, genero, plumaje);//Esta linea tiene que estar obligatoriamente la primera
        this.urbano = urbano;
    }


    ////////////////////////////


    public boolean isUrbano() {
        return urbano;
    }

    public void setUrbano(boolean urbano) {
        this.urbano = urbano;
    }

    /////////////////////////////

    public void atraparInsectos(){


    }

    ////////////////////////////


    @Override
    public void ponerHuevos(int nHuevos) {
        System.out.println("pone " + nHuevos + " huevos pintos");
    }

    @Override
    public void emitirSonido() {
        System.out.println("pio pio");
    }

    @Override
    public String toString() {
        return "Gorrion{" + "\n" +
                "urbano=" + this.urbano + "\n" +
                "plumaje=" + super.getPlumaje() + "\n" +
                "especie=" + super.getEspecie() + "\n" +
                "género =" + super.getGenero() + "\n" +
                "edad =" + super.getEdad() + "\n" +
                '}';
    }


}
