package model;

public class Retangulo implements FiguraGeometrica {
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "O retângulo criado tem altura de tamanho: " + altura + " e largura de tamanho: " + base;
    }
}
