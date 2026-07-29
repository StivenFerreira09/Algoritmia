package com.mycompany.compararnumeros;
import java.util.Scanner;

public class CompararNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero1, numero2;

        System.out.print("Digite el primer numero: ");
        numero1 = teclado.nextDouble();

        System.out.print("Digite el segundo numero: ");
        numero2 = teclado.nextDouble();

        if (numero1 > numero2) {
            System.out.println("Mayor: " + numero1);
            System.out.println("Menor: " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("Mayor: " + numero2);
            System.out.println("Menor: " + numero1);
        } else {
            System.out.println("Los dos numeros son iguales.");
        }
    }
}