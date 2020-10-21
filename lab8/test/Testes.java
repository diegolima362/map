package test;

import models.Circulo;
import models.Retangulo;
import models.Triangulo;
import models.Trapezio;
import models.Forma;
import visitors.VisitorCalcularPerimetro;
import visitors.VisitorCalcularArea;
import visitors.VisitorMaximizar;
import visitors.VisitorDesenhar;
import visitors.Visitor;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class Testes {

    static Triangulo triangulo;
    static Retangulo retangulo;
    static Trapezio trapezio;
    static Circulo circulo;

    static Visitor calcularArea;
    static Visitor desenhar;
    static Visitor calcularPerimetro;
    static Visitor maximizar;


    @BeforeAll
    public static void setUp() {
        
        triangulo = new Triangulo(10, 10, 12);
        retangulo = new Retangulo(40, 20);
        circulo = new Circulo(5);
        trapezio = new Trapezio(20, 10, 15);

        calcularArea = new VisitorCalcularArea();
        desenhar = new VisitorDesenhar();
        calcularPerimetro = new VisitorCalcularPerimetro();
        maximizar = new VisitorMaximizar();
    }

    @Test
    public void testAceitarVisita() {
        assertEquals(78.5, Math.round(circulo.aceitarVisita(calcularArea) * 10.0) / 10.0);
    }


    @Test
    public void testVisitarCirculo() {
        Circulo cir = new Circulo(5);
        maximizar.visitarCirculo(cir);
        assertEquals(10.0, cir.getRaio()); 
    }

    @Test
    public void testVisitarRetangulo() {
        assertEquals(120.0, Math.round(calcularPerimetro.visitarRetangulo(retangulo) * 10.0) / 10.0);
    }

    @Test
    public void testVisitarTrapezio() {
        assertEquals(0.0, desenhar.visitarTrapezio(trapezio));
    }

    @Test
    public void testVisitarTriangulo() {
        assertEquals(48.0, Math.round(calcularArea.visitarTriangulo(triangulo) * 10.0) / 10.0);
    }

}
