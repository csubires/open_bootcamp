import java.util.Scanner;

public class Main {

    static float IVA = 21f;    // 21%

    public static void main(String[] args) {

        System.out.println("Introduce el precio:");
        Scanner precio = new Scanner(System.in);
        double precioSinIVA = precio.nextDouble();
        double precioTotal = precioConIVA(precioSinIVA);
        System.out.println("Precio sin IVA: " + precioSinIVA);
        System.out.println("Precio con IVA: " + precioTotal);
    }

    static double precioConIVA(double precio) {
        double cantidadIVA = precio * (IVA / 100);
        return (cantidadIVA + precio);
    }
}