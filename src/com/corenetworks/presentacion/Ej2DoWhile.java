package com.corenetworks.presentacion;

public class Ej2DoWhile {
    public static void main(String[] args) {
        //Calcular la potencia de 2 elevado a 8
        int exp = 1;
            int i=1;
            while( i <= 8) {
                exp = exp * 2;
                System.out.println("En la iteracion " + i + " -> " + exp);
                i++;
            }
            System.out.println(exp);
        }


    }

