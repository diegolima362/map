package model;

public class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() { return "O quadrado criado tem lados de tamanho: " + lado; }
}
