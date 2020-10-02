package main;

import models.Circulo;
import models.FiguraGeometrica;
import models.Triangulo;
import models.TrianguloRetangulo;

public class Main {

    public static void main(String[] args) {
        FiguraGeometrica f = TrianguloRetangulo.getInstance(1, 2, 3);
        System.out.println(f.getPerimetro());

        f = TrianguloRetangulo.getInstance();
        System.out.println(f.getPerimetro());

        f = TrianguloRetangulo.getInstance(1, 2, 3);
        System.out.println(f.getPerimetro());

        ((Triangulo) f).setA(2);
        System.out.println(f.getPerimetro());

        FiguraGeometrica c = Circulo.getInstance(3);
        System.out.println("Perimetro: " + c.getPerimetro());
        System.out.println("Area: " + c.getArea());
    }
}
