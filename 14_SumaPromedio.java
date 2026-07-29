package com.mycompany.sumapromedio;
import java.util.Scanner;

public class SumaPromedio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero, suma = 0, promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite el numero " + i + ": ");
            numero = teclado.nextDouble();
            suma = suma + numero;
        }

        promedio = suma / 10;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}