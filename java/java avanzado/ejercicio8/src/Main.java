public class Main {
    public static void main(String[] args) {

        ConcesionarioBD concesionarioBD = new ConcesionarioBD();

        CocheDefecto cocheCombustible = concesionarioBD.dameCocheDefectoCombustible();
        CocheDefecto cocheElectrico = concesionarioBD.dameCocheDefectoElectrico();
        CocheDefecto cocheHibrido = concesionarioBD.dameCocheDefectoHibrido();

        System.out.println(cocheCombustible.getMarca() + " " + cocheCombustible.getModelo());
        concesionarioBD.repostar(cocheCombustible);
        concesionarioBD.conducir(cocheCombustible);

        System.out.println(cocheElectrico.getMarca() + " " + cocheElectrico.getModelo());
        concesionarioBD.repostar(cocheElectrico);
        concesionarioBD.conducir(cocheElectrico);

        System.out.println(cocheHibrido.getMarca() + " " + cocheHibrido.getModelo());
        concesionarioBD.repostar(cocheHibrido);
        concesionarioBD.conducir(cocheHibrido);

    }
}