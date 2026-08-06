package com.mycompany.tienda;

import java.util.ArrayList;

public class Compra {

    int numero;
    String fecha;
    Cliente cliente;

    ArrayList<Producto> productos;

    public Compra(int numero, String fecha, Cliente cliente) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        productos = new ArrayList<>();
    }
   
    public void Aggproducto(Producto producto) {
        productos.add(producto);
    }
    public double CalcularT() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.CalcularSBT();
        }
        return total;
    }
    public void método() {
        System.out.println("Numero: " + numero);
        System.out.println("Fecha: " + fecha);

        cliente.método();
        System.out.println("Productos:");
        for (Producto producto : productos) {
            producto.método();
        }
        System.out.println("Total a pagar: " + CalcularT());
    }

}
