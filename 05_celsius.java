package com.mycompany.grados;
import java.util.Scanner;

public class Grados {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double ce, fh, ke;

        System.out.print("Digite la temperatura en grados Celsius: ");
        ce = teclado.nextDouble();

        fh = (ce * 9 / 5) + 32;
        ke = ce + 273.15;

        System.out.println("grados Fahrenheit: " + fh);
        System.out.println("grados Kelvin: " + ke);
    }
}