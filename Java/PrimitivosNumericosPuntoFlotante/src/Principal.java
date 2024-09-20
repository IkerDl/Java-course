public class Principal {

    public static void main(String[] args) {

        float miValorFloat = 2345.67F;//32 bits
        double miValorDouble = 7.9876;//64 bits
        //No tiene propiedades ni métodos porque es una variable primitiva
        //miValorFloat.

        Float miObjetoFloat = 2345.67F;

        //miObjetoFloat tiene propiedades y métodos porque es un objeto
        int resultado = miObjetoFloat.hashCode();
        System.out.println("resultado = " + resultado);//1158847160



    }


}
