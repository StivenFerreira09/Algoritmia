package com.mycompany.banco;

public class Banco {

    public static void main(String[] args) {

        Cuentabancaria cuenta = new Cuentabancaria(
                "252689569",
                "Jhon duran",
                900.000
        );

        System.out.println("Datos iniciales");
        cuenta.método();

        cuenta.depositar(100.000);

        System.out.println("Despues del deposito ");
        cuenta.método();

        cuenta.retirar(600.000);

        System.out.println("Despues del retiro ");
        cuenta.método();

    }

}
