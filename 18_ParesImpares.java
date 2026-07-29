package com.mycompany.paresimpares;
import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[20];
        int suma = 0;
        int pares = 0;
        int impares = 0;
        double promedio;

        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();

            suma = suma + numeros[i];

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        promedio = (double) suma / 20;

        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}
