public class Perro extends Mamifero {

    private String nombre;

    //////////////////////////////////

    public Perro(String especie, int edad, String genero, String pelaje, String nombre) {
        super(especie, edad, genero, pelaje);
        this.nombre = nombre;
    }


    /////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //////////////////////////////////


    public void vigilarCasa(){

    }


    //////////////////////////////////

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
