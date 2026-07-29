package com.mycompany.clasificaredad;
import java.util.Scanner;

public class ClasificarEdad {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int edad;

        System.out.print("Digite la edad: ");
        edad = teclado.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Es un nino.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Es un adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Es un adulto.");
        } else {
            System.out.println("Es un adulto mayor.");
        }
    }
}