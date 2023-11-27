package com.corenetworks.presentacion;

public class Ej5DoWhile {
    public static void main(String[] args) {
        //Un numero es perfecto cuando todos sus divisores sumados dan el mismo numero
        //Ejemplo: 6 = 1 + 2 + 3; luego 6 es un numero perfecto
        //Mostrar los números perfectos hasta el 100
        System.out.println("Números perfectos hasta el 100:");

        int numero = 0;
        do {
            // Verificar si el número es perfecto
            if (esNumeroPerfecto(numero)) {
                System.out.println(numero);
            }

            numero++;
        } while (numero <= 100);
    }

    // Función para verificar si un número es perfecto
    private static boolean esNumeroPerfecto(int num) {
        int sumaDivisores = 1; // 1 siempre es divisor, comienza desde 1
        // Bucle para encontrar los divisores y sumarlos
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sumaDivisores += i;
                if (i != num / i) {
                    sumaDivisores += num / i;
                }
            }
        }
        // Si la suma de los divisores es igual al número, es perfecto
        return sumaDivisores == num;
    }
}

