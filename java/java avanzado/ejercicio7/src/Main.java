public class Main {
    public static void main(String[] args) {

       Coche cocheElectrico = new CocheElectrico()
               .setCodigoColor(345)
               .setMarca("Tesla")
               .setModelo("Model X")
               .setPotencia(1000)
               .setNumeroPuertas(3);

        Coche cocheCombustible = new CocheCombustible()
                .setCodigoColor(678)
                .setMarca("Ford")
                .setModelo("Focus")
                .setPotencia(90)
                .setNumeroPuertas(5);

        Coche cocheHibrido = new CocheHibrido()
                .setCodigoColor(789)
                .setMarca("Tesla")
                .setModelo("Model X")
                .setPotencia(1000)
                .setNumeroPuertas(3);
        

     System.out.println(cocheElectrico);
     cocheElectrico.cargar(100);
     cocheElectrico.descargar(80);
     cocheElectrico.mostrarNivel();
     cocheElectrico.acelerar(120);
     cocheElectrico.desacelerar(34);
     cocheElectrico.showVelocidad();

     System.out.println(cocheCombustible);
     cocheCombustible.cargar(100);
     cocheCombustible.descargar(80);
     cocheCombustible.mostrarNivel();
     cocheCombustible.acelerar(80);
     cocheCombustible.desacelerar(34);
     cocheCombustible.showVelocidad();

     System.out.println(cocheHibrido);
     cocheHibrido.cargar(100);
     cocheHibrido.descargar(80);
     cocheHibrido.mostrarNivel();
     cocheHibrido.cargar(90);
     cocheHibrido.descargar(30);
     cocheHibrido.mostrarNivel();
     cocheElectrico.acelerar(140);
     cocheElectrico.desacelerar(34);
     cocheElectrico.showVelocidad();
    }
}