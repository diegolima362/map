package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import controller.SistemaRodoviaria;
import model.source.Cadeira;
import view.Quiosque;

public class Tests {

    @Test
    public void testAdicionarOnibus() {
        SistemaRodoviaria sistemaRodoviaria = new SistemaRodoviaria();
        sistemaRodoviaria.adicionarOnibus("Campina Grande - Recife", 9);
        assertEquals(1, sistemaRodoviaria.getFrota().size());
    }

    @Test
    public void testACadeiraDisponivel() {
        SistemaRodoviaria sistemaRodoviaria = new SistemaRodoviaria();
        sistemaRodoviaria.adicionarOnibus("Campina Grande - Recife", 9);
        assertTrue(sistemaRodoviaria.aCadeiraDisponivel("Campina Grande - Recife"));
    }

    @Test
    public void testAlterarEstadoCadeiraPrimeiroDisponivel() {
        SistemaRodoviaria sistemaRodoviaria = new SistemaRodoviaria();
        sistemaRodoviaria.adicionarOnibus("Campina Grande - Recife", 9);
        sistemaRodoviaria.alterarEstadoCadeiraPrimeiroDisponivel(Cadeira.Reservado, "Campina Grande - Recife");
        assertEquals(Cadeira.Reservado, sistemaRodoviaria.getFrota().get(0).getCadeiras()[0].getAcento());

    }

    @Test
    public void testAddCadeiraListener() {
        Cadeira cadeira = new Cadeira();
        cadeira.addCadeiraListener(new Quiosque());
        assertEquals(1, cadeira.getCadeiraListeners().size());
    }

    @Test
    public void testRemoveCadeiraListener() {
        Cadeira cadeira = new Cadeira();
        Quiosque quiosque = new Quiosque();
        cadeira.addCadeiraListener(quiosque);
        cadeira.removeCadeiraListener(quiosque);
        assertEquals(0, cadeira.getCadeiraListeners().size());
    }
}
