package com.mycompany.registroempleado;

public class Registroempleado {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(
                "Carlos Guevara",
                "Auxiliar",
                1800000,
                10
        );

        empleado1.método();

        System.out.println("Salario final: $" + empleado1.calcularSalarioFinal());

    }

}
