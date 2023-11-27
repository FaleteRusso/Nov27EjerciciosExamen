package com.corenetworks.presentacion;

public class EjStringMetodos3 {
    public static void main(String[] args) {
        //Mostrar la posicion de la ultima palabra menos
        String texto = "DevOps es un marco de trabajo y una filosofía en constante evolución que promueve un mejor desarrollo de aplicaciones en menos tiempo y la rápida publicación de nuevas o revisadas funciones de software o productos para los clientes.";

        // Buscar la posición de la última ocurrencia de "menos"
        int posicion = texto.lastIndexOf("menos");

        // Mostrar la posición
        if (posicion != -1) {
            System.out.println("'menos' está en la posición: " + posicion);
        } else {
            System.out.println("'menos' no encontrado en el texto.");
        }
    }
}
