package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import model.Retangulo;

public class RetanguloTest {
    static Retangulo retangulo;
    
    @BeforeAll
    public static void setUp() {
        retangulo = new Retangulo(5, 10);
    }

    @Test
    public void testGetArea() {
        assertEquals(50.0, Math.round(retangulo.getArea()*100.0) / 100.0);
    }

    @Test
    public void testGetPerimetro() {
        assertEquals(30.0, Math.round(retangulo.getPerimetro()*100.0) / 100.0);
    }
}
