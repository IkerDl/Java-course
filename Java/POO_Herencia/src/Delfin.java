public class Delfin extends Mamifero{

    //boolean marino
    //nadar
    //sobreescribir toString

    private boolean marino;

    //////////////////////////////////////////////////////

    public Delfin(String especie, int edad, String genero, String pelaje, boolean marino) {
        super(especie, edad, genero, pelaje);
        this.marino = marino;
    }


    //////////////////////////////////////////////////////


    public boolean isMarino() {
        return marino;
    }

    public void setMarino(boolean marino) {
        this.marino = marino;
    }


    ///////////////////////////////////////////////////////

    public void nadar(){


    }

    //////////////////////////////////////////////////////


    @Override
    public void emitirSonido() {
        System.out.println("Ikkk Ikkk");
    }

    @Override
    public String toString() {
        return "Delfin{" +
                "marino=" + marino +
                '}';
    }


}
