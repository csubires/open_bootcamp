public class ConcesionarioBD {

    CocheDefecto cocheDefectoElectrico = new CocheElectrico()
            .setCodigoColor(345)
            .setMarca("Tesla")
            .setModelo("Model X")
            .setPotencia(1000)
            .setNumeroPuertas(3);

    CocheDefecto cocheDefectoCombustible = new CocheCombustible()
            .setCodigoColor(678)
            .setMarca("Ford")
            .setModelo("Focus")
            .setPotencia(90)
            .setNumeroPuertas(5);

    CocheDefecto cocheDefectoHibrido = new CocheHibrido()
            .setCodigoColor(789)
            .setMarca("Tesla")
            .setModelo("Model X")
            .setPotencia(1000)
            .setNumeroPuertas(3);


    public CocheDefecto dameCocheDefectoElectrico() {
        return this.cocheDefectoElectrico;
    }

    public CocheDefecto dameCocheDefectoCombustible() {
        return cocheDefectoCombustible;
    }

    public CocheDefecto dameCocheDefectoHibrido() {
        return cocheDefectoHibrido;
    }

    public void repostar(CocheDefecto coche) {
        cocheDefectoHibrido.cargar(100);
        cocheDefectoHibrido.mostrarNivel();
        cocheDefectoElectrico.showVelocidad();
    }

    public void conducir(CocheDefecto coche) {
        cocheDefectoElectrico.acelerar(140);
        cocheDefectoHibrido.descargar(80);
        cocheDefectoElectrico.desacelerar(34);
        cocheDefectoHibrido.mostrarNivel();
        cocheDefectoElectrico.showVelocidad();
    }

}
