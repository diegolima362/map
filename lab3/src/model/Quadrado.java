package model;

public class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado() {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        return string.append("O quadrado criado tem lados de tamanho: ")
            .append(lado)
            .toString();
    }
}
