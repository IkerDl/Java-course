public class Principal {

    public static void main(String[] args) {

        float miValorFloat = 2345.67F; //32 bits
        double miValorDouble = 7.9876; // 64bits
        //No tiene propiedades ni metodos porque es una variable primitiva

        Float miObjetoFloat = 2345.67F;
        int resultado = miObjetoFloat.hashCode();
        System.out.println("resultado = " + resultado);
    }

}
