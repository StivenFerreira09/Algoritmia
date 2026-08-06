package com.mycompany.supermercado;

public class Producto {

    String nombre;
    double precio;
    double cantidad;

    public Producto(String nombre, double precio, double cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void método() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    public double calcularInv() {
        return precio * cantidad;
    }

}
