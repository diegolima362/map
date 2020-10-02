package models;

public class TrianguloIsosceles extends Triangulo {
    private static TrianguloIsosceles instance;

    public static TrianguloIsosceles getInstance(double a, double b, double c) {
        if (instance == null) instance = new TrianguloIsosceles(a, b, c);
        return instance;
    }

    public static TrianguloIsosceles getInstance() {
        if (instance == null) instance = new TrianguloIsosceles(0, 0, 0);
        return instance;
    }

    private TrianguloIsosceles(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
