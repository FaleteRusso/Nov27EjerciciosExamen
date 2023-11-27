package com.corenetworks.presentacion;

import java.time.LocalDate;

public class EjLocalDate2 {
    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcular la fecha de mañana
        LocalDate fechaManana = fechaActual.plusDays(1);

        // Mostrar la fecha de mañana
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Fecha de mañana: " + fechaManana);
    }

}
