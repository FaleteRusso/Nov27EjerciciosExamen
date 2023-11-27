package com.corenetworks.presentacion;

public class EjercicioFor4 {
    public static void main(String[] args) {
        //Escribir el factorial del número 15
        int numero = 15;
        long factorial = 1;

        // Calculamos el factorial usando un bucle for
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
