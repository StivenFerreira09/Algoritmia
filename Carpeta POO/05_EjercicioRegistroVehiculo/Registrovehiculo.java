package com.mycompany.registrovehiculo;

public class Registrovehiculo {

    public static void main(String[] args) {

        Vehiculo carro = new Vehiculo(
                "2TY-876",
                "Toyota",
                "Corolla",
                50
        );

        System.out.println("=Datos iniciales =");
        carro.método();

        carro.encender();

        carro.recorrer(10);

        System.out.println("=Despues del recorrido =");
        carro.método();

        carro.apagar();

        System.out.println("=Estado final =");
        carro.método();

    }

}