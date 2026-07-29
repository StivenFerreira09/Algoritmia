package com.mycompany.notad;

import java.util.Scanner;

public class NotaD {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double p1, p2, pf, df;

        System.out.print("Digite la nota del Parcial 1: ");
        p1 = teclado.nextDouble();

        System.out.print("Digite la nota del Parcial 2: ");
        p2 = teclado.nextDouble();

        System.out.print("Digite la nota del Proyecto Final: ");
        pf = teclado.nextDouble();

        df = (p1 * 0.30) + (p2 * 0.30) + (pf * 0.40);

        System.out.println("La nota defintiva es: " + df);
    }
}