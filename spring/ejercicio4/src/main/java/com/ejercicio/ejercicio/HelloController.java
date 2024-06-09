package com.ejercicio.ejercicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     * Visitar en el navegador http://localhost:8080/saludo
     */
    @GetMapping("/saludo")
    public String saludo(){
        return "Hola, ¿Cómo te va?, Adios";
    }
}
