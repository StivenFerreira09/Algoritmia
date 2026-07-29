package com.mycompany.solicitarnumeros;
import java.util.Scanner;

public class SolicitarNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero, suma = 0, promedio;
        int cantidad = 0;

        System.out.print("Digite un numero (0 para terminar): ");
        numero = teclado.nextDouble();

        while (numero != 0) {
            suma = suma + numero;
            cantidad++;

            System.out.print("Digite un numero (0 para terminar): ");
            numero = teclado.nextDouble();
        }

        if (cantidad > 0) {
            promedio = suma / cantidad;

            System.out.println("Cantidad de numero: " + cantidad);
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron numero.");
        }
    }
}