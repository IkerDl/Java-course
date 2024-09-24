public class Ave extends Animal {

    //plumaje
    //constructor
    //Getters y setters
    //ponerHuevos
    //sobreecribir toString

    private String plumaje;

    ///////////////////////////////////////////////

    public Ave(String especie, int edad, String genero, String plumaje) {
        super(especie, edad, genero);
        this.plumaje = plumaje;
    }


    ///////////////////////////////////////////////


    public String getPlumaje() {
        return this.plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }


    /////////////////////////////////////////////////

    public void ponerHuevos(int nHuevos){


    }

    /////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Ave{" +
                "plumaje='" + plumaje + '\'' +
                '}';
    }


}
