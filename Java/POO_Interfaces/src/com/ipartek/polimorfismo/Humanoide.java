package com.ipartek.polimorfismo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Humanoide extends MundoTolkien {

    private String nombre;
    private Integer fuerza;
    private Integer inteligencia;
    private Genero genero;
    private Double dinero;
    private Rol rol;
    private List<IComercializable> posesiones = new ArrayList<>();

    ////////////////////////////////////////////////////////////////

    public Humanoide(Ubicacion dondeEstoy, Double peso, String nombre, Integer fuerza, Integer inteligencia, Genero genero, Double dinero, Rol rol) {
        super(dondeEstoy, peso);
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.genero = genero;
        this.dinero = dinero;
        this.rol = rol;
    }


    //////////////////////////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

    public List<IComercializable> getPosesiones() {
        return posesiones;
    }

    public void setPosesiones(List<IComercializable> posesiones) {
        this.posesiones = posesiones;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    /////////////////////////////////////////////////////////
    //MÉTODOS PROPIOS
    /////////////////////////////////////////////////////////

    public void domesticar(IDomesticable elDomesticable){

        //Comprobar si elDomesticable está domesticado
        if(elDomesticable.getDomesticado()){
            JOptionPane.showMessageDialog(null,"El " + elDomesticable.getDenominacion() + " ya está domesticado");
        }else{
            elDomesticable.setDomesticado(true);
            JOptionPane.showMessageDialog(null,"El " + elDomesticable.getDenominacion() + " ha sido domesticado");

            if(elDomesticable instanceof ICabalgable){
                //YES es 0 - NO es 1 y CERRAR CON LA x ES -1
                int opcionElegida = JOptionPane.showConfirmDialog(
                        null,
                        "¿Quieres cabalgar a " + elDomesticable.getDenominacion() + "?",
                        "Cabalgar!!!",
                        JOptionPane.YES_NO_OPTION
                );

                if(opcionElegida == 0){

                    cabalgar((ICabalgable) elDomesticable);
                }

            }

        }

    }


    public void cabalgar(ICabalgable elCabalgable){

        if (elCabalgable.getDomesticado()) {

            if (Utilidades.compruebaMismoLugar(this, (MundoTolkien) elCabalgable)) {
                //Comprobar si elCabalgable aguanta el peso
                if(elCabalgable.getCargaMaxima() < this.getPeso()) {
                    JOptionPane.showMessageDialog(null, this.nombre + " no ha podido montar sobre " + elCabalgable.getDenominacion() + " por exceso de peso");
                    return;
                }

                JOptionPane.showMessageDialog(null, this.nombre + " está montado sobre " + elCabalgable.getDenominacion());
                //String destino = JOptionPane.showInputDialog("¿A qué ciudad va a viajar?");
                //String[] destinos = {"GONDOR","RIVENDEL"};
                Ubicacion[] ubicaciones = Ubicacion.values();

                /*ubicaciones[0] es el botón que queda marcado por defecto*/
                int destinoElegido = JOptionPane.showOptionDialog(

                        null,
                        "¿A qué ciudad va a viajar?",
                        "Selecciona una",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        ubicaciones,
                        ubicaciones[0]

                );

                if (destinoElegido == -1) {
                    JOptionPane.showMessageDialog(null, "No has elegido ninguna ciudad");
                } else {

                    //Comprobar si la ciudad de destino es distinta a la ciudad en la que estoy
                    if (Objects.equals(ubicaciones[destinoElegido].toString(), this.getDondeEstoy().toString())) {

                        JOptionPane.showMessageDialog(null, "No puedes viajar a la misma ciudad en la que te encuentras");
                    } else {

                        JOptionPane.showMessageDialog(null, this.nombre + " llega a " + ubicaciones[destinoElegido].toString());
                        //Cambiamos ubicacion a caballo y a jinete
                        this.setDondeEstoy(ubicaciones[destinoElegido]);
                        ((MundoTolkien) elCabalgable).setDondeEstoy(ubicaciones[destinoElegido]);

                    }


                }


            }

        }else{
            //YES es 0 - NO es 1 y CERRAR CON LA x ES -1
            int opcionElegida = JOptionPane.showConfirmDialog(
                    null,
                    "¿Quieres domesticar a " + elCabalgable.getDenominacion() + "?",
                    "Tu reto",
                    JOptionPane.YES_NO_OPTION
            );

            switch (opcionElegida) {
                case JOptionPane.YES_OPTION -> domesticar(elCabalgable);
                case JOptionPane.NO_OPTION -> JOptionPane.showMessageDialog(null, "Has elegido no domesticar a " + elCabalgable.getDenominacion());
                case JOptionPane.CLOSED_OPTION -> JOptionPane.showMessageDialog(null, "No has elegido nada...");
            }
        }

    }

    public void comprar(IComercializable item){

        //Comprobar si yo (this) y el item estamos en el
        //mismo sitio
        if(Utilidades.compruebaMismoLugar(this,(MundoTolkien)item)){

            // Comprobar si tenemos suficiente dinero
            if(this.dinero >= item.getPrecio()){

                posesiones.add(item);//Incluímos el item entre nuestras posesiones
                this.dinero -= item.getPrecio();//Efectuamos el pago
                JOptionPane.showMessageDialog(null,"Compra efectuada con éxito ("  + item.getDenominacion() + ")");

            }else{
                JOptionPane.showMessageDialog(null,"No podemos efectuar la compra porque no tenemos suficiente dinero");

            }

        }else{

            JOptionPane.showMessageDialog(null,"No podemos efectuar la compra porque estamos en distintas ciudades");

        }









    }

    public String listadoSimplePosesiones(){
        String listadoFinal="";
        List<String> posesionesSimple = new ArrayList<>();

        for( IComercializable item  :  posesiones  ){

            posesionesSimple.add(item.getDenominacion());

        }

        //A esta altura del método tengo un ArrayList de String (posesionesSimple)
        //con mis posesiones o un ArrayList vacío

        if(posesionesSimple.isEmpty()){
            return "No tiene posesiones";
        }else{

            for( String item  : posesionesSimple ){

                listadoFinal = listadoFinal + " - " + item;
            }
            return listadoFinal.substring(3);

        }

    }






    ///////////////////////////////////////////////////////////
    //FIN MÉTODOS PROPIOS
    /////////////////////////////////////////////////////////




}
