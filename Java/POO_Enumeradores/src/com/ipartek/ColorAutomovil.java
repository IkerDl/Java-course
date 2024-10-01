package com.ipartek;

public enum ColorAutomovil {

    //Aquí es donde definimos las instancia (ÚNICAS INSTANCIAS)
    //que va a tener la "futura clase" ColorAutomóvil

    ROJO("Rojo metalizado","RO7766"),
    AMARILLO("Amarillo desierto","AM1134"),
    AZUL("Azul prusia","AZ9967"),
    BLANCO("Blanco alaska","BL5432"),
    GRIS("Gris metalizado","GR7733");//De aquí para abajo definimos una clase normal y corriente

    ////////////////////////////////////////////////////

    private String colorComercial;
    private String refColor;

    ////////////////////////////////////////////////////


    ColorAutomovil(String colorComercial, String refColor) {
        this.colorComercial = colorComercial;
        this.refColor = refColor;
    }

    ////////////////////////////////////////////////////
    //Los enumeradores no tienen setters porque sus
    //instancias son final

    public String getColorComercial() {
        return colorComercial;
    }

    public String getRefColor() {
        return refColor;
    }

    //////////////////////////////////////////////////


}
