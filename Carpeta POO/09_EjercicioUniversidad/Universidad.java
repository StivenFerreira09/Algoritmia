package com.mycompany.universidad;

public class Universidad {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(
                "Lamine Yamal",
                "2026001"
        );

        Asignatura asignatura1 = new Asignatura(
                "Programacion",
                4
        );

        Inscripcion inscripcion1 = new Inscripcion(
                estudiante1,
                asignatura1
        );

        inscripcion1.método();

    }

}