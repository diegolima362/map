package models;

public class Circulo implements FiguraGeometrica {
    private static Circulo instance;

    private double raio;

    public static Circulo getInstance(double raio) {
        if (instance == null) instance = new Circulo(raio);
        return instance;
    }

    public static Circulo getInstance() {
        if (instance == null) instance = new Circulo(0);
        return instance;
    }

    private Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "O circulo criado tem raio de tamanho: " + raio;
    }
}
