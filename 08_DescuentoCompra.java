package com.mycompany.descuentocompra;
import java.util.Scanner;

public class DescuentoCompra {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double compra, descuento, total;

        System.out.print("Digite el valor de la compra: ");
        compra = teclado.nextDouble();

        if (compra > 200000) {
            descuento = compra * 0.10;
        } else {
            descuento = 0;
        }

        total = compra - descuento;

        System.out.println("Valor de la compra: $" + compra);
        System.out.println("Descuento: " + descuento);
        System.out.println("Valor a pagar: $" + total);
    }
}