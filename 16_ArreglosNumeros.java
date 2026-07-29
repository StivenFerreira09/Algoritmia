package com.mycompany.arreglonumeros;
import java.util.Scanner;

public class ArregloNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        // Ingresar los numero
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Mostrar los numero
        System.out.println("Los numero almacenados son:");

        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }
}