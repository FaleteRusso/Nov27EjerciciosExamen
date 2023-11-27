package com.corenetworks.presentacion;

public class EjerFor7 {
    public static void main(String[] args) {
        //Hallar todas las tablas de multiplicar con for anidados
        // Bucle externo para el multiplicando
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");

            // Bucle interno para el multiplicador
            for (int m = 1; m <= 10; m++) {
                int resultado = i * m;
                System.out.println(i + " x " + m + " = " + resultado);
            }

            System.out.println(); // Salto de línea entre las tablas
        }
    }
}
