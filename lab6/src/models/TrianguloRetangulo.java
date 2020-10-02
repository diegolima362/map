package models;

public class TrianguloRetangulo extends Triangulo {
    private static TrianguloRetangulo instance;

    public static TrianguloRetangulo getInstance(double a, double b, double c) {
        if (instance == null) instance = new TrianguloRetangulo(a, b, c);
        return instance;
    }

    public static TrianguloRetangulo getInstance() {
        if (instance == null) instance = new TrianguloRetangulo(0, 0, 0);
        return instance;
    }

    private TrianguloRetangulo(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getArea() {
        return 0;
    }

}
