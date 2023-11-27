package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EjLocalDate4 {
    public static void main(String[] args) {
//calcular los dias del curso de inicio hasta hoy
        // Definir la fecha de inicio del curso (9 de octubre de 2023)
        LocalDate inicioCurso = LocalDate.of(2023, 10, 9);

        // Obtener la fecha actual
        LocalDate hoy = LocalDate.now();

        // Calcular la diferencia en días
        long diasTranscurridos = ChronoUnit.DAYS.between(inicioCurso, hoy);

        // Mostrar la cantidad de días
        System.out.println("Días desde el inicio del curso hasta hoy: " + diasTranscurridos + " días");
    }
}
