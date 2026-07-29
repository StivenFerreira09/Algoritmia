package com.mycompany.numero;
import java.util.Scanner;

public class Numero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero;

        System.out.print("Digite un numero: ");
        numero = teclado.nextDouble();

        if (numero > 0) {
            System.out.println("El numero es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
    }
}