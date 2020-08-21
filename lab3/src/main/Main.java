package main;

import model.Circulo;
import model.Quadrado;
import model.Retangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Quadrado quadrado = new Quadrado(4);
        Retangulo retangulo = new Retangulo(3, 4);


       // Área das figuras geométricas
       System.out.println("Área das figuras geométricas");
       System.out.printf("Área do círculo: %.2f\n", circulo.getArea());
       System.out.printf("Área do quadrado: %.2f\n", quadrado.getArea());
       System.out.printf("Área do retângulo: %.2f\n\n\n", retangulo.getArea());

       // Perímetro das figuras geométricas
       System.out.println("Perímetro das figuras geométricas");
       System.out.printf("Perímetro do círculo: %.2f\n", circulo.getPerimetro());
       System.out.printf("Perímetro do quadrado: %.2f\n", quadrado.getPerimetro());
       System.out.printf("Perímetro do retângulo: %.2f\n\n\n", retangulo.getPerimetro());

       // toString das figuras geométricas
       System.out.println("toString das figuras geométricas");
       System.out.println(circulo.toString());
       System.out.println(quadrado.toString());
       System.out.println(retangulo.toString());
    }
}
