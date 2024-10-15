package com.ipartek.genericVSwildcard;

public class Casa {

    private String direccion;

    ///////////////////////////////////


    public Casa(String direccion) {
        this.direccion = direccion;
    }

    //////////////////////////////////


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    ////////////////////////////////////


    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}
