package com.mycompany.registrovehiculo;

public class Vehiculo {

    String placa;
    String marca;
    String modelo;
    double combustible;
    boolean encendido;

    public Vehiculo(String placa, String marca, String modelo, double combustible) {

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.encendido = false;
    }
     public void método() {

        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Combustible: " + combustible + " litros");
        System.out.println("Encendido: " + encendido);
    }
    public void encender() {
        encendido = true;
        System.out.println("El vehiculo ha sido encendido.");
    }
    public void apagar() {
        encendido = false;
        System.out.println("El vehiculo ha sido apagado.");
    }
    public void recorrer(double litrosConsumidos) {

        combustible = combustible - litrosConsumidos;
        System.out.println("Recorrido registrado.");
    }

}