package main;

import models.Circulo;
import models.FiguraGeometrica;
import models.Triangulo;
import models.TrianguloRetangulo;
import controller.FabricaFiguraGeometrica;

public class Main {

    public static void main(String[] args) {
        FiguraGeometrica trianguloRetangulo = FabricaFiguraGeometrica.getTriangulo(18, 24, 30);
        System.out.printf("Perímetro do triângulo retângulo: %.2f\n", trianguloRetangulo.getPerimetro());
        System.out.printf("Área do triângulo retângulo: %.2f\n\n", trianguloRetangulo.getArea());

        FiguraGeometrica trianguloIsosceles = FabricaFiguraGeometrica.getTriangulo(4, 3, 4);
        System.out.printf("Perímetro do triângulo isósceles: %.2f\n", trianguloIsosceles.getPerimetro());
        System.out.printf("Área do triângulo isósceles: %.2f\n\n", trianguloIsosceles.getArea());

        FiguraGeometrica trianguloEquilatero = FabricaFiguraGeometrica.getTriangulo(7, 7, 7);
        System.out.printf("Perímetro do triângulo equilátero: %.2f\n", trianguloEquilatero.getPerimetro());
        System.out.printf("Área do triângulo esquilátero: %.2f\n\n", trianguloEquilatero.getArea());


        FiguraGeometrica circulo = FabricaFiguraGeometrica.getCirculo(3);
        System.out.printf("Perímetro do círculo: %.2f\n", circulo.getPerimetro());
        System.out.printf("Área do círculo: %.2f\n\n", circulo.getArea());

        FiguraGeometrica quadrado = FabricaFiguraGeometrica.getQuadrado(2);
        System.out.printf("Perímetro do círculo: %.2f\n", quadrado.getPerimetro());
        System.out.printf("Área do círculo: %.2f\n\n", quadrado.getArea());
    }
}
