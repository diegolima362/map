package models;

public class TrianguloEquilatero extends Triangulo {
    private static TrianguloEquilatero instance;

    public static TrianguloEquilatero getInstance(double a, double b, double c) {
        if (instance == null) instance = new TrianguloEquilatero(a, b, c);
        return instance;
    }

    public static TrianguloEquilatero getInstance() {
        if (instance == null) instance = new TrianguloEquilatero(0, 0, 0);
        return instance;
    }

    private TrianguloEquilatero(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
