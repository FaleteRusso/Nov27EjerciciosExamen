package com.corenetworks.presentacion;

public class Ejercicio8 {

    public static void main(String[] args) {
        //Ver si un número es par y múltiplo de 3 y que saque mensajes del tipo:
        //Es par y múltiplo de 3
        //Es impar y múltiplo de 3
        int num =20;
        if (num%2==0 && num%3==0){
            System.out.println("Es par y multiplo de 3");
        }else if(num%2!=0 && num%3==0){
            System.out.println("Es impar y multiplo de 3");
        }else if(num%2==0 && num%3!=0){
            System.out.println("No es multiplo de 3 pero es par");
        }else {
            System.out.println("No es ni par ni multiplo de 3");
        }
    }
}
            
