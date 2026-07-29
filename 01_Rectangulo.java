package com.mycompany.rectangulo;
import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double b, a, ar, pe;

        System.out.print("Digite la base del rectangulo: ");
        b = teclado.nextDouble();

        System.out.print("Digite la altura del rectangulo: ");
        a = teclado.nextDouble();

        ar = b * a;
        pe = 2 * (b + a);

        System.out.println("Area = " + ar);
        System.out.println("Perimetro = " + pe);
    }
}