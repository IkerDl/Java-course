public class Perro {

    //Atributos o propiedad
    private String nombre;
    private int edad;
    private String raza;
    private String color;
    private int estadoAnimo; //lo parametrizamos de 0 de 10
    private int hambre; //lo parametrizamos de 0 de 10

    ////////////////////////////////////////////////////////////////
    //Método constructor
    ///////////////////////////////////////////////////////////////

    public Perro(String nombre, int edad, String raza, String color, int estadoAnimo, int hambre) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.estadoAnimo = estadoAnimo;
        this.hambre = hambre;
    }

    ///////////////////////////////////////////////////////////////////
    //Getter & Setters
    ///////////////////////////////////////////////////////////////////


}
