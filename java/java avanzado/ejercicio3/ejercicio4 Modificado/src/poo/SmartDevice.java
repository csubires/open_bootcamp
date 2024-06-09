package poo;

public class SmartDevice {

    int anchoPantalla;
    int largoPantalla;
    boolean tactil;
    double precio;
    double peso;
    String nombre;
    String modelo;

    public SmartDevice() {  }

    public SmartDevice setAnchoPantalla(int anchoPantalla) {
        this.anchoPantalla = anchoPantalla;
        return this;
    }

    public SmartDevice setLargoPantalla(int largoPantalla) {
        this.largoPantalla = largoPantalla;
        return this;
    }

    public SmartDevice setTactil(boolean tactil) {
        this.tactil = tactil;
        return this;
    }

    public SmartDevice setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public SmartDevice setPeso(double peso) {
        this.peso = peso;
        return this;
    }

    public SmartDevice setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public SmartDevice setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }







    public static class SmartPhone extends SmartDevice {
        String versionSO;
        boolean usb;

        public SmartPhone() {
            super();
        }

        public SmartPhone setVersionSO(String versionSO) {
            this.versionSO = versionSO;
            return this;
        }

        public SmartPhone setUsb(boolean usb) {
            this.usb = usb;
            return this;
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

        public SmartWatch setYokese(boolean yokese) {
            this.yokese = yokese;
            return this;
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

