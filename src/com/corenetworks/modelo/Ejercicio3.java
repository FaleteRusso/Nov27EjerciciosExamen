package com.corenetworks.modelo;

import java.util.Objects;

public class Ejercicio3 {
    private int edad;
    public int calcularEdadDias(){
        return edad*365;
    }
    public long calcularEdadSegundos(){
        return edad * 24*60*60;
    }

    @Override
    public String toString() {
        return "Ejercicio3{" +
                "edad=" + edad +
                '}';
    }

    public Ejercicio3() {
    }

    public Ejercicio3(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ejercicio3 that = (Ejercicio3) o;
        return edad == that.edad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad);
    }
}
