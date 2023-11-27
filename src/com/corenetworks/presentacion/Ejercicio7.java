package com.corenetworks.presentacion;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Hallar una renta de C x r x t / 1200
        //Si el tiempo es <=24 meses --> el redito es 5%
        //Si el tiempo es <=60 meses --> el redito es 8%
        //Si el tiempo es >60 meses --> el redito es 10%
                double capital = 1_000;
                double redito = 0;
                int tiempo = 70;

                if(tiempo <= 24){
                    redito = 0.05;
                }else if(tiempo <=60){
                    redito=0.8;
                }else {
                    redito = 0.1;
                }
                System.out.println(capital*redito*tiempo);
            }

        }

