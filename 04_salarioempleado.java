package com.mycompany.salarioempleado;
import java.util.Scanner;

public class Salarioempleado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double ht, vh;
        double sb, s, p, sn;

        System.out.print("Digite las horas trabajadas: ");
        ht = teclado.nextDouble();

        System.out.print("Digite el valor por hora: ");
        vh = teclado.nextDouble();

        sb = ht * vh;
        s = sb * 0.04;
        p = sb * 0.04;
        sn = sb - s - p;

        System.out.println("salario bruto: " + sb);
        System.out.println("descuento salud: " + s);
        System.out.println("descuento pension: " + p);
        System.out.println("salario neto: " + sn);
    }
}