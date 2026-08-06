package com.mycompany.restaurante;

public class Restaurante {

    public static void main(String[] args) {

        Plato plato1 = new Plato(
                "Pote carcelario",
                21000
        );

        Pedido pedido1 = new Pedido(
                20,
                "04/08/2026",
                "Juanita Mesa",
                plato1
        );

        pedido1.método();

    }

}
