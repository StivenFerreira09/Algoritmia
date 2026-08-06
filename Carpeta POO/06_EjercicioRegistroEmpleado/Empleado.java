package com.mycompany.registroempleado;

public class Empleado {

    String nombre;
    String cargo;
    double salarioBase;
    int horasExtras;

    public Empleado(String nombre, String cargo, double salarioBase, int horasExtras) {

        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }
    public void método() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
    }
    
    public double calcularSalarioFinal() {

        double pagoHorasExtras = horasExtras * 20000;

        return salarioBase + pagoHorasExtras;

    }

}
