package org.example;

public class Main {
    public static void main(String[] args) {

        Singleton uno = Singleton.getInstance();
        uno.setMessage("Hola Mundo");
        Singleton dos = Singleton.getInstance();
        dos.setMessage("Adios Mundo");
        
        System.out.println(uno.getMessage() + " ------------ " + dos.getMessage());
    }
}