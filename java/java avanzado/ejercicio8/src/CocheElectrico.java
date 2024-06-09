public class CocheElectrico extends CocheDefecto implements CocheElectron {
    private int bateria = 0;


    public void cargar(int incremento) {
        bateria += incremento;
    }

    public void descargar(int decremento) {
        bateria += decremento;
    }

    public void mostrarNivel() {
        System.out.println("La carga de bateria actual es:" + bateria);
    }
}
