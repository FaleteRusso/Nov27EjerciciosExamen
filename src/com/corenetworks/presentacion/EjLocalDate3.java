package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Month;

public class EjLocalDate3 {
    public static void main(String[] args) {
        //Restar 3 meses a la fecha de final de curso 15 de marzo de 2024
        // Definir la fecha de final de curso (15 de marzo de 2024)
        LocalDate fechaFinalCurso = LocalDate.of(2024, Month.MARCH, 15);

        // Restar 3 meses
        LocalDate nuevaFecha = fechaFinalCurso.minusMonths(3);

        // Mostrar la fecha original y la nueva fecha
        System.out.println("Fecha de final de curso: " + fechaFinalCurso);
        System.out.println("Fecha después de restar 3 meses: " + nuevaFecha);
    }
}
