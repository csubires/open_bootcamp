package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Saludo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String mensaje;

    public Saludo() {
        this.mensaje = "Esto es un mensaje por defecto";
    }

    public Saludo( String mensaje) {
        this.mensaje = mensaje;
    }

    public void imprimirSaludo() {
        System.out.println(this.mensaje);
    }
}
