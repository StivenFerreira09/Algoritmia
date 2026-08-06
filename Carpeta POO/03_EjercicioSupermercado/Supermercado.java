package com.mycompany.supermercado;

public class Supermercado {

    public static void main(String[] args) {

        Producto producto1 = new Producto(
                "Polet",
                7.300,
                2
        );

        producto1.método();

        System.out.println("Valor total del inventario: $" + producto1.calcularInv());

    }

}
