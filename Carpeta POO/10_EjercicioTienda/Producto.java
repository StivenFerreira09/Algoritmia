package com.mycompany.tienda;

public class Producto {

    String nombre;
    double precio;
    int cantidad;
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double CalcularSBT() {

        return precio * cantidad;

    }

    public void método() {

        System.out.println(nombre
                + " - Precio: $" + precio
                + " - Cantidad: " + cantidad
                + " - Subtotal: $" + CalcularSBT());

    }

}