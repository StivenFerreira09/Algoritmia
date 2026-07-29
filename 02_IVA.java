package com.mycompany.tiendaiva;

import java.util.Scanner;

public class TiendaIVA {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double vp, iva, tt;

        System.out.print("Digite el valor del producto: ");
        vp = teclado.nextDouble();

        iva = vp * 0.19;
        tt = vp + iva;

        System.out.println("Valor antes del IVA " + vp);
        System.out.println("Valor del IVA: " + iva);
        System.out.println("Valor total: " + tt);
    }
}