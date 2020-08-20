package model;

public class Circulo implements FiguraGeometrica {
    private double raio;

    public Circulo (double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio() {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        return string.append("O circulo criado tem raio de tamanho: ")
            .append(raio)
            .toString();
    }
}
