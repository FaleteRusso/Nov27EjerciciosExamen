package com.corenetworks.presentacion;

public class EjerFor9 {
    public static void main(String[] args) {
        //Hallar la lista de los números primos hasta el 100
        for (int i = 1; i <= 100; i++) {
            boolean primo = true;
            // Bucle interno para verificar si el número es primo
            for (int d = 2; d <= Math.sqrt(i); d++) {
                if (i%d == 0) {
                    primo = false;
                    break; // Si es divisible por algún número, no es primo, así que salimos del bucle
                }
            }
            // Si esPrimo sigue siendo true, entonces el número es primo
            if (primo) {
                System.out.print(i+ " ");
            }
        }
    }
}
