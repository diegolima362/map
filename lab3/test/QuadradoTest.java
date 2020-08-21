package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import model.Quadrado;

public class QuadradoTest {
    static Quadrado quadrado;

    @BeforeAll
    public static void setUp() {
        quadrado = new Quadrado(2);
    }

    @Test
    public void testGetArea() {
        assertEquals(4.0, Math.round(quadrado.getArea()*100.0) / 100.0);
    }

    @Test
    public void testGetPerimetro() {
        assertEquals(8.0, Math.round(quadrado.getPerimetro()*100.0) / 100.0);
    }
}
