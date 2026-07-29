package com.mycompany.anobisiesto;
import java.util.Scanner;

public class AnoBisiesto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int anio;

        System.out.print("Digite un ano: ");
        anio = teclado.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El ano es bisiesto.");
        } else {
            System.out.println("El ano no es bisiesto.");
        }
    }
}