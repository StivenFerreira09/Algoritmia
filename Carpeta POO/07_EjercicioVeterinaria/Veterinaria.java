package com.mycompany.veterinaria;

public class Veterinaria {

    public static void main(String[] args) {

        Mascota mascota1 = new Mascota(
                "Kayser",
                "Perro",
                4,
                18.5,
                "Claudia Lopez"
        );

        mascota1.método();

        mascota1.registrarConsulta();

    }

}