public abstract class CocheDefecto {
    private String marca;
    private String modelo;
    private int codigoColor;
    private int numeroPuertas;
    private double potencia;

    public CocheDefecto() {}

    private int velocidad = 0;

    void acelerar(int incremento) {
        velocidad += incremento;
    }

    void desacelerar(int decremento) {
        velocidad += decremento;
    }

    void showVelocidad() {
        System.out.println("La velocidad actual es:" + velocidad);
    }


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", codigoColor=" + codigoColor +
                ", numeroPuertas=" + numeroPuertas +
                ", potencia=" + potencia +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public CocheDefecto setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public CocheDefecto setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public int getCodigoColor() {
        return codigoColor;
    }

    public CocheDefecto setCodigoColor(int codigoColor) {
        this.codigoColor = codigoColor;
        return this;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public CocheDefecto setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
        return this;
    }

    public double getPotencia() {
        return potencia;
    }

    public CocheDefecto setPotencia(double potencia) {
        this.potencia = potencia;
        return this;
    }

    abstract void cargar(int i);
    abstract void descargar(int i);
    abstract void mostrarNivel();


}
