package com.mycompany.tienda;

public class Tienda {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Alejandro Char",
                "Alexjchar.@gmail.com",
                "13589648"
        );

        Compra compra = new Compra(
                96,
                "04/08/2026",
                cliente
        );

        Producto p1 = new Producto(
                "Mouse",
                60000,
                2
        );

        Producto p2 = new Producto(
                "Teclado",
                120000,
                1
        );

        Producto p3 = new Producto(
                "Audifonos",
                80000,
                3
        );

        compra.Aggproducto(p1);
        compra.Aggproducto(p2);
        compra.Aggproducto(p3);

        compra.método();
    }
}
