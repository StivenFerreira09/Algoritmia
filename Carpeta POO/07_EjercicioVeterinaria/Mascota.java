package com.mycompany.veterinaria;

public class Mascota {

    String nombre;
    String especie;
    int edad;
    double peso;
    String propietario;
    
 public Mascota(String nombre, String especie, int edad, double peso, String propietario) {

        this.nombre = nombre;
        this.especie = especie;
        this.propietario = propietario;

        if (edad >= 0) {
            this.edad = edad;
        } else {
            this.edad = 0;
            System.out.println("La edad no puede ser negativa.");
        }
        
        if (peso >= 0) {
            this.peso = peso;
        } else {
            this.peso = 0;
            System.out.println("El peso no puede ser negativo.");
        }
    }
        public void método() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Propietario: " + propietario);
    }

    public void registrarConsulta() {

        System.out.println("Consulta medica registrada para " + nombre);

    }

}
