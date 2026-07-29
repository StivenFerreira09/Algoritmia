package com.mycompany.encontrarnumero;
import java.util.Scanner;

public class EncontrarNumero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[25];
        int buscar;
        boolean encontrado = false;

        // Ingresar los numeross
        for (int i = 0; i < 25; i++) {
            System.out.print("Digite el numeros " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Número a buscar
        System.out.print("\nDigite el numeros que desea buscar: ");
        buscar = teclado.nextInt();

        // Buscar el numeros
        for (int i = 0; i < 25; i++) {
            if (numeros[i] == buscar) {
                System.out.println("El numeros existe.");
                System.out.println("Se encuentra en la posición: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El numeros no existe en el arreglo.");
        }
    }
}