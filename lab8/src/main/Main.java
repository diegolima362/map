package main;

import models.*;
import visitors.*;

public class Main {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10, 10, 12);
        Retangulo retangulo = new Retangulo(40, 20);
        Circulo circulo = new Circulo(5);
        Trapezio trapezio = new Trapezio(20, 10, 15);

        Visitor calcularArea = new VisitorCalcularArea();
        Visitor desenhar = new VisitorDesenhar();
        Visitor calcularPerimetro = new VisitorCalcularPerimetro();
        Visitor maximizar = new VisitorMaximizar();

        System.out.println("\nFormas\n");

        desenhar.visitarCirculo(circulo);
        desenhar.visitarRetangulo(retangulo);
        desenhar.visitarTrapezio(trapezio);
        desenhar.visitarTriangulo(triangulo);

        System.out.println("\nAreas\n");

        System.out.println("Circulo: " + calcularArea.visitarCirculo(circulo));
        System.out.println("Retangulo: " + calcularArea.visitarRetangulo(retangulo));
        System.out.println("trapezio: " + calcularArea.visitarTrapezio(trapezio));
        System.out.println("Triangulo: " + calcularArea.visitarTriangulo(triangulo));

        System.out.println("\nPerimetros\n");

        System.out.println("Circulo: " + calcularPerimetro.visitarCirculo(circulo));
        System.out.println("Retangulo: " + calcularPerimetro.visitarRetangulo(retangulo));
        System.out.println("trapezio: " + calcularPerimetro.visitarTrapezio(trapezio));
        System.out.println("Triangulo: " + calcularPerimetro.visitarTriangulo(triangulo));

        maximizar.visitarCirculo(circulo);
        maximizar.visitarRetangulo(retangulo);
        maximizar.visitarTrapezio(trapezio);
        maximizar.visitarTriangulo(triangulo);

        System.out.println("\nMaximizado\n");

        desenhar.visitarCirculo(circulo);
        desenhar.visitarRetangulo(retangulo);
        desenhar.visitarTrapezio(trapezio);
        desenhar.visitarTriangulo(triangulo);
    }
}
