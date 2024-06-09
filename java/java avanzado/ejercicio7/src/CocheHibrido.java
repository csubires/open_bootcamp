public class CocheHibrido extends Coche {
    private int desposito = 0;
    private int bateria = 0;


    public void cargar(int incremento) {
        desposito += incremento;
        bateria += incremento;
    }

    public void descargar(int decremento) {
        desposito += decremento;
        bateria += decremento;
    }

    public void mostrarNivel() {
        System.out.println("El nivel de combustible actual es:" + desposito);
        System.out.println("El nivel de bateria actual es:" + bateria);
    }


}
