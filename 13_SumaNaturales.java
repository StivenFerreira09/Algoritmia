package com.mycompany.suma100;
public class Suma100 {

    public static void main(String[] args) {

        double suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de los primeros 100 numeros naturales es: " + suma);
    }
}