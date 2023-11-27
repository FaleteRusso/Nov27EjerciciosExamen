package com.corenetworks.presentacion;

public class EjStringMetodos2 {
    public static void main(String[] args) {
        //Mostrar la posicion de la primera palabra DevOps
        String texto = "DevOps es un marco de trabajo y una filosofía en constante evolución que promueve un mejor desarrollo de aplicaciones en menos tiempo y la rápida publicación de nuevas o revisadas funciones de software o productos para los clientes.";

        // Buscar la posición de la primera ocurrencia de "DevOps"
        int posicion = texto.indexOf("DevOps");

        // Mostrar la posición
        if (posicion != -1) {
            System.out.println("La primera ocurrencia de 'DevOps' está en la posición: " + posicion);
        } else {
            System.out.println("'DevOps' no encontrado en el texto.");
        }
    }
}

