package com.corenetworks.presentacion;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Se va a subir el sueldo a los empleados de la siguiente manera:
        //Los que cobren < 15000 se les aumenta el 15%
        //Los que cobren >= 15000 aumento del 12%
        //además:
        //Si son mujeres tienen un 2% adicional
        //Si tienen hijos tienen un 1% adicional por hijo
        double sueldo = 12_000;
        double incremento = 0;
        char genero = 'M';
        int numhijos = 2;

        if(sueldo <15_000){
            incremento = 0.15;
        }else{
            incremento = 0.12;
        }
        if(genero=='M'){
            incremento += 0.02;
        }
        System.out.println("Incremento -> " + incremento);
        incremento += numhijos*0.01;

        System.out.println("El porcentaje de incremento -> " + incremento);
        System.out.println("El sueldo es -> " + sueldo*(1+incremento));
    }
}
