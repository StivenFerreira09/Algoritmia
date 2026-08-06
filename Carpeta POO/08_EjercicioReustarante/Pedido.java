package com.mycompany.restaurante;

public class Pedido {

    int numero;
    String fecha;
    String cliente;
    Plato plato;

    public Pedido(int numero, String fecha, String cliente, Plato plato) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.plato = plato;
    }
    public void método() {
        System.out.println("Numero del pedido: " + numero);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente);

        plato.método();

    }

}