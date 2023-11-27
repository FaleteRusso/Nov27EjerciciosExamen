package com.corenetworks.presentacion;

public class EjerFor8 {
    public static void main(String[] args) {
        //Con los 20 primeros números decir con cada uno por cual es divisible:
        //ejemplo: 1 --> es divisible por 1
        //2 --> es divisible por 1
        //es divisible por 2 ...
        //bucle externo
        for (int i=1;i<=20;i++){
            System.out.println(i+"es divisible por: ");
            //bucle interno
            for (int n=1; n<=i;n++){
                if (i%n==0){
                    System.out.println(n+" ");
                }
            }
            System.out.println();//salto de lieneas
        }
    }
}
