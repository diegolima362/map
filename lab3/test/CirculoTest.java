package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import model.Circulo;

public class CirculoTest {
    static Circulo circulo;

    @BeforeAll
    public static void setUp() {
        circulo = new Circulo(3);
    }

    @Test
    public void testGetArea() {
        assertEquals(28.27, Math.round(circulo.getArea()*100.0) / 100.0);    
    }

    @Test
    public void testGetPerimetro() {
        assertEquals(18.85, Math.round(circulo.getPerimetro()*100.0) / 100.0);
    }
}
