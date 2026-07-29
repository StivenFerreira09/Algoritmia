package com.mycompany.mayormenor;
import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[15];

        // Ingresar los numeros
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        // Buscar el mayor y el menor
        for (int i = 1; i < 15; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
