package com.ipartek;

public class Gato {

    private int edad;
    private String nombre;

    ///////////////////////////////////////////////

    //sobrecarga de constructores
    public Gato() {
    }

    public Gato(int edad) {
        this.edad = edad;
    }

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public Gato(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }


    ///////////////////////////////////////////////


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad < 12){
            this.edad = edad;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /////////////////////////////////////////////////////

    public String maullar(){

        return "miau";

    }

    public String maullar(String elMaullido){

        return elMaullido;
    }


    public String maullar(int nVeces, String elMaullido){
        String maullidoFinal="";

        while(nVeces > 0){
            maullidoFinal = maullidoFinal + elMaullido;
            nVeces--;
        }

        return maullidoFinal;

    }


    public String maullar(int nVeces){
        String maullidoFinal="";

        while(nVeces > 0){
            maullidoFinal = maullidoFinal + "miau ";
            nVeces--;
        }

        return maullidoFinal;

    }


    //////////////////////////////////////////////////////


    @Override
    public String toString() {

        return "====================================" + "\n" +
                "Nombre: " + this.nombre  + "\n" +
                "Edad: " + this.edad  + "\n" +
                "====================================";

    }


}
