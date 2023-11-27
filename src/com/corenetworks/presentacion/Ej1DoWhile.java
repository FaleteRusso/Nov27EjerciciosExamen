package com.corenetworks.presentacion;

public class Ej1DoWhile {
    public static void main(String[] args) {
        long fact=1;
        int num=25;
        int i=1;
        while (i<=num){
            fact *=i;
            i++;

        }
        System.out.println("el factorial de 25 es "+ fact);
    }
}
