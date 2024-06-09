import poo.CollecionDevice;
import poo.IteradorSmartWatch;
import poo.Iterator;
import poo.SmartDevice;

public class Main {
    public static void main(String[] args) {

        int anchoPantalla;
        int largoPantalla;
        boolean tactil;
        double precio;
        double peso;
        String nombre;
        String modelo;


        SmartDevice smartdecive1 = new SmartDevice()
                .setAnchoPantalla(1080)
                .setLargoPantalla(1920)
                .setTactil(false)
                .setPrecio(3.23)
                .setPeso(23)
                .setNombre("LG")
                .setModelo("Viseo");

        SmartDevice smartdecive2 = new SmartDevice.SmartPhone()
                .setVersionSO("Android 13")
                .setUsb(false)
                .setAnchoPantalla(1080)
                .setLargoPantalla(1920)
                .setTactil(false)
                .setPrecio(3.23)
                .setPeso(23)
                .setNombre("LG")
                .setModelo("Viseo");

        SmartDevice smartdecive3 = new SmartDevice.SmartWatch()
                .setYokese(true)
                .setAnchoPantalla(1080)
                .setLargoPantalla(1920)
                .setTactil(false)
                .setPrecio(3.23)
                .setPeso(23)
                .setNombre("LG")
                .setModelo("Viseo");




        CollecionDevice micolecion = new CollecionDevice();
        micolecion.meterDevice(smartdecive1);
        micolecion.meterDevice(smartdecive2);
        micolecion.meterDevice(smartdecive3);

        IteradorSmartWatch iterador = new IteradorSmartWatch(micolecion);


        try {
            while (iterador.hayMas()) {
                SmartDevice actual = iterador.obtenerSiguiente();
                System.out.println(actual);
            }

        } catch (Exception e) {
            System.out.println("Fin de de la lista");
        }


    }
}