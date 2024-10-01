package com.ipartek;

public enum TipoAutomovil {

    SEDAN("Sedán", "4","Automóvil de tamaño mediano"),
    COUPE("Coupé","2","Automóvil deportivo"),
    FURGON("Furgón","6","Camioneta transporte"),
    SUB("SUB","5", "Todoterreno deportivo");

    //////////////////////////////////////

    private String nombre;
    private String numeroPuertas;
    private String descripcion;

    ///////////////////////////////////////


    TipoAutomovil(String nombre, String numeroPuertas, String descripcion) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    /////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
