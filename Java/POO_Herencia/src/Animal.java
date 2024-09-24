public class Animal {

    //3 atributos: especie, edad y genero
    //Crear atributos, constructor, getters y setters

    private String especie;
    private int edad;
    private String genero;

    ////////////////////////////////////////////////////


    public Animal(String especie, int edad, String genero) {
        this.especie = especie;
        this.edad = edad;
        this.genero = genero;
    }

    ///////////////////////////////////////////////////


    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    ///////////////////////////////////////////////////

    public void emitirSonido(){
        System.out.println("sonido de animal");
    }

    public void comer(){


    }

    ///////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }


}
