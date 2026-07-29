package com.mycompany.estudiantesnotas;
import java.util.Scanner;

public class EstudiantesNotas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] notas = new double[30];
        double suma = 0;
        double mayor, menor, promedio;
        int aprobados = 0;
        int reprobados = 0;

        
        for (int i = 0; i < 30; i++) {
            System.out.print("Digite la nota del estudiante " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }

        mayor = notas[0];
        menor = notas[0];

        
        for (int i = 0; i < 30; i++) {

            suma = suma + notas[i];

            if (notas[i] > mayor) {
                mayor = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }

            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        promedio = suma / 30;

        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);
    }
}
