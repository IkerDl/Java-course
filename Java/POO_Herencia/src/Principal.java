public class Principal {


    public static void main(String[] args) {
        
        /*Perro dientitos = new Perro("Dientitos");
        
        String resultado = dientitos.toString();
        System.out.println("resultado = " + resultado);
        
        dientitos.vigilarCasa();*/
        
        /*Ave unAve = new Ave("Amarillo");
        String resultado2 = unAve.toString();
        System.out.println("resultado2 = " + resultado2);*/

        Gorrion pitiu = new Gorrion("Granero",3,"Macho","Marrón y negro",false);
        System.out.println(pitiu);

        pitiu.emitirSonido();

        Delfin flipper = new Delfin("Delfínido",23,"Hembra","Gris Claro",true);

        flipper.emitirSonido();
        Pato lucas = new Pato("Mandarín",6,"Macho", "Negro",true);
        lucas.emitirSonido();

        pitiu.ponerHuevos(7);

    }


}
