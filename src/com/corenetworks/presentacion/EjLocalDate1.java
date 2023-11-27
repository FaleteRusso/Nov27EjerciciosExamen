package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Period;

public class EjLocalDate1 {
    public static void main(String[] args) {
        //calcular la edad de una persona que nació en 3 de septiembre de 1998


                // Fecha de nacimiento
                LocalDate fechaNacimiento = LocalDate.of(1998, 9, 3);

                // Fecha actual
                LocalDate fechaActual = LocalDate.now();

                // Calcular la diferencia entre las fechas
                Period periodo = Period.between(fechaNacimiento, fechaActual);

                // Obtener la edad en años
                int edad = periodo.getYears();

                // Mostrar la edad
                System.out.println("Fecha de nacimiento: " + fechaNacimiento);
                System.out.println("Fecha actual: " + fechaActual);
                System.out.println("Edad: " + edad + " años");
            }
        }

