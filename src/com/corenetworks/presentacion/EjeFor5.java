package com.corenetworks.presentacion;

public class EjeFor5 {
    public static void main(String[] args) {
        int base = 2;
        int exp = 8;
        int resultado = 1;

        // Calculamos 2 elevado a la 8 usando un bucle for
        for (int i = 1; i <= exp; i++) {
            resultado *= base;
            System.out.println("La iteracion "+ i +"-->"+exp);
        }

        // Mostramos el resultado
        System.out.println(base + " elevado a la " + exp + " es= " + resultado);

       /*
        int base =2;
        int exp = 8;
        double resultado;
        resultado= Math.pow(base,exp);
        System.out.println("El resultado de esta potencias es: "+resultado);
        */


    }
}
