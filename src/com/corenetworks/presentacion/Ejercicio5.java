package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Comparar dos números y decir cuál es el mayor
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("Ambos números son iguales");
        }

    }
}


