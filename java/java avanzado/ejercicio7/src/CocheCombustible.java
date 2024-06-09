public class CocheCombustible extends Coche {
    private int desposito = 0;


    public void cargar(int incremento) {
        desposito += incremento;
    }

    public void descargar(int decremento) {
        desposito += decremento;
    }

    public void mostrarNivel() {
        System.out.println("El nivel de combustible actual es:" + desposito);
    }


}
