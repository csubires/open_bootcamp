package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
        System.out.println("Creando Notification");
    }

    public void imprimirSaludo() {
        System.out.println("Imprimiendo saludo por pantalla");
    }
}
