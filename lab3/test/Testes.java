package test;

import exceptions.ExceptionValorNegativo;
import model.Circulo;
import model.FiguraGeometrica;
import model.Quadrado;
import model.Retangulo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testes {
    static FiguraGeometrica circulo;
    static FiguraGeometrica quadrado;
    static FiguraGeometrica retangulo;

    @BeforeAll
    public static void setUp() {
        try {
            circulo = new Circulo(3);
        } catch (ExceptionValorNegativo exceptionValorNegativo) {
            exceptionValorNegativo.printStackTrace();
        }
        quadrado = new Quadrado(2);
        retangulo = new Retangulo(5, 10);
    }

    @Test
    public void testGetAreaCirculo() { assertEquals(28.27, Math.round(circulo.getArea() * 100.0) / 100.0); }

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
    public void testGetAreaRetangulo() { assertEquals(50.0, Math.round(retangulo.getArea() * 100.0) / 100.0); }

    @Test
    public void testGetPerimetroRetangulo() { assertEquals(30.0, Math.round(retangulo.getPerimetro() * 100.0) / 100.0); }

}
