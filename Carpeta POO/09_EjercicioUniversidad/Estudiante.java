package com.mycompany.universidad;

public class Estudiante {

    String nombre;
    String codigo;
    
    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    public void método() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Codigo: " + codigo);
    }
}
