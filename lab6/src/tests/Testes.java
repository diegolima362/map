package test;

import models.Circulo;
import models.FiguraGeometrica;
import models.Quadrado;
import models.Triangulo;
import controller.FabricaFiguraGeometrica;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class Testes {
    static FiguraGeometrica circulo;
    static FiguraGeometrica quadrado;
    static FiguraGeometrica triangulo;

    @BeforeAll
    public static void setUp() {
        circulo = FabricaFiguraGeometrica.getCirculo(3);
        quadrado = FabricaFiguraGeometrica.getQuadrado(2);
        triangulo = FabricaFiguraGeometrica.getTriangulo(18, 24, 30);
    }

    @Test
    public void testGetAreaCirculo() { 
        assertEquals(28.27, Math.round(circulo.getArea() * 100.0) / 100.0); 
    }

    @Test
    public void testGetPerimetroCirculo() {
        assertEquals(18.85, Math.round(circulo.getPerimetro() * 100.0) / 100.0);
    }

    @Test
    public void testGetAreaQuadrado() {
        assertEquals(4.0, Math.round(quadrado.getArea() * 100.0) / 100.0);
    }

    @Test
    public void testGetPerimetroQuadrado() {
        assertEquals(8.0, Math.round(quadrado.getPerimetro() * 100.0) / 100.0);
    }

    @Test
    public void testGetAreaTriangulo() { 
        assertEquals(216.0, Math.round(triangulo.getArea() * 100.0) / 100.0); 
    }

    @Test
    public void testGetPerimetroTriangulo() { 
        assertEquals(72, Math.round(triangulo.getPerimetro() * 100.0) / 100.0); 
    }

    @Test
    public void testEhEquilatero() {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(7, 7, 7));
    }

    @Test
    public void testEhIsosceles() {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(4, 3, 4));
    }

    @Test
    public void testEhRetangulo() {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(18, 24, 30));
    }

    @Test
    public void testEhTriangulo() {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(4, 3, 4));
    }

}
