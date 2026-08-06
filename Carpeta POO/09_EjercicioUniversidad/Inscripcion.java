package com.mycompany.universidad;

public class Inscripcion {

    Estudiante estudiante;
    Asignatura asignatura;

    public Inscripcion(Estudiante estudiante, Asignatura asignatura) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public void método() {

        System.out.println("=Inscripcion =");

        estudiante.método();

        asignatura.método();
    }
}
