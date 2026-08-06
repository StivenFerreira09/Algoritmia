package com.mycompany.tienda;
public class Cliente {
    
    String nombre;
    String correo;
    String identificacion;
    
    public Cliente(String nombre, String correo, String identificacion) {

        this.nombre = nombre;
        this.correo = correo;
        this.identificacion = identificacion;
    }

    public void método() {

        System.out.println("Cliente: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Identificacion: " + identificacion);

    }

}
