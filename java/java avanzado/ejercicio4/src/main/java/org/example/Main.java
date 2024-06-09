package org.example;

/**
 * Proyecto destinado a comentar cosas
 *
 * @author yo
 * @version 1.0
 */
public class Main {


    /**
     * Es el constructor
     * @param args argumentos por consola
     */
    public static void main(String[] args) {
        /** precio sirve para guardar la suma */
        int precio;
        precio = sumarPrecios(345, 34534);
        mostrarPrecio(precio);
    }

    /**
    * Hace la suma de dos precios
     *
     * @param a Precio 1
     * @param b Precio 2
    * @ return Suma de los precios
    *
    * */
    private static int sumarPrecios(int a, int b) {
        return a + b;
    }

    /**
     * Mostrar el precio
     * @param precio Precio del producto
     */
    private static void mostrarPrecio(int precio) {
        System.out.println("El precio es: " + precio);
    }
}