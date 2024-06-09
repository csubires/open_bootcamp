package poo;

public class SmartDevice {

    int anchoPantalla;
    int largoPantalla;
    boolean tactil;
    double precio;
    double peso;
    String nombre;
    String modelo;

    public SmartDevice() {

    }

    public SmartDevice(int anchoPantalla, int largoPantalla, boolean tactil, double precio, double peso, String nombre, String modelo) {
        this.anchoPantalla = anchoPantalla;
        this.largoPantalla = largoPantalla;
        this.tactil = tactil;
        this.precio = precio;
        this.peso = peso;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public static class SmartPhone extends SmartDevice {
        String versionSO;
        boolean usb;

        public SmartPhone() {
            super();
        }

        public SmartPhone(String versionSO, boolean usb, int anchoPantalla, int largoPantalla, boolean tactil, double precio, double peso, String nombre, String modelo) {
            super();
            this.versionSO = versionSO;
            this.usb = usb;
        }

        @Override
        public String toString() {
            return "SmartPhone{" +
                    "versionSO='" + versionSO + '\'' +
                    ", usb=" + usb +
                    ", anchoPantalla=" + anchoPantalla +
                    ", largoPantalla=" + largoPantalla +
                    ", tactil=" + tactil +
                    ", precio=" + precio +
                    ", peso=" + peso +
                    ", nombre='" + nombre + '\'' +
                    ", modelo='" + modelo + '\'' +
                    '}';
        }
    }
    public static class SmartWatch extends SmartDevice {
        boolean yokese;
        public SmartWatch() {
            super();
        }
        public SmartWatch(boolean yokese, int anchoPantalla, int largoPantalla, boolean tactil, double precio, double peso, String nombre, String modelo) {
            super();
            this.yokese = yokese;
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "yokese=" + yokese +
                    ", anchoPantalla=" + anchoPantalla +
                    ", largoPantalla=" + largoPantalla +
                    ", tactil=" + tactil +
                    ", precio=" + precio +
                    ", peso=" + peso +
                    ", nombre='" + nombre + '\'' +
                    ", modelo='" + modelo + '\'' +
                    '}';
        }
    }


}

