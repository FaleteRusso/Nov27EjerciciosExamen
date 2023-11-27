package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
      //Comparar tres números y decir cuál es el mayor
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el mayor.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es el mayor.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " es el mayor.");
        } else {
            System.out.println("Hay al menos dos números iguales.");
        }
    }

}
