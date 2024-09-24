public class Mamifero extends Animal{

    //pelaje
    //constructor
    //getters y setters
    //amamantar
    //sobreescribir toString

    private String pelaje;

    ///////////////////////////////////////

    public Mamifero(String especie, int edad, String genero, String pelaje) {
        super(especie, edad, genero);
        this.pelaje = pelaje;
    }


    /////////////////////////////////////////


    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    //////////////////////////////////////////

    public void amamantar(){



    }

    ////////////////////////////////////////////


    @Override
    public String toString() {
        return "Mamifero{" +
                "pelaje='" + pelaje + '\'' +
                '}';
    }
}
