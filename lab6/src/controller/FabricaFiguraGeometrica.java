package controller;

import models.Circulo;
import models.Quadrado;
import models.Triangulo;

public class FabricaFiguraGeometrica {
    public static Circulo getCirculo(double raio) {
        return Circulo.getInstance(raio);
    }

    public static Quadrado getQuadrado(double lado) {
        return new Quadrado(lado);
    }

    public static Triangulo getTriangulo(double a, double b, double c) {
        return Triangulo.getInstance(a, b, c);
    }



}
