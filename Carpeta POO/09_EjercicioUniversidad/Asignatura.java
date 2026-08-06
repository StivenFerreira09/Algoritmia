package com.mycompany.universidad;

public class Asignatura {

    String nombre;
    int creditos;
    public Asignatura(String nombre, int creditos) {

        this.nombre = nombre;
        this.creditos = creditos;
    }
    public void método() {

        System.out.println("Asignatura: " + nombre);
        System.out.println("Creditos: " + creditos);
    }
}
