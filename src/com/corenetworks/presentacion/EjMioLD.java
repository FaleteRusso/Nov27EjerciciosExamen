package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class EjMioLD {
    public static void main(String[] args) {
        //Calcular los dias desde el inicio del curso
        LocalDate incioCurso =LocalDate.of(2023,10,9);

        LocalDate hoy= LocalDate.now();

        long diasPasados= ChronoUnit.DAYS.between(incioCurso,hoy);
        System.out.println(diasPasados);
        //durecion del curso total
        System.out.println(Period.between(LocalDate.of(2024,3,15),LocalDate.of(2023,10,9)));

    }
}
