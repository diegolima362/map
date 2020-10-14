package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import factories.SanduicheFactory;
import models.sanduiches.Sanduiche;
import models.sanduiches.SanduicheTipo;
import models.sanduiches.SanduicheIntegral;
import models.Ingrediente;
import models.paes.PaoBola;
import models.paes.PaoFrances;
import models.queijos.QueijoMussarela;
import models.presuntos.PresuntoFrango;
import models.ovos.OvoCapoeira;
import models.tomates.TomateCaqui;

public class Teste {
    private static SanduicheFactory sf;

    @BeforeAll
    public static void setUp() {
        sf = new SanduicheFactory();
    }

    @Test
    public void testGetSanduiche() {
        Sanduiche sanduicheFactory = sf.getSanduiche(SanduicheTipo.INTEGRAL);
        assertEquals(sanduicheFactory, new SanduicheIntegral());
    }

    @Test
    public void testGetNome() {
        assertEquals("Pão Bola", new PaoBola().getNome());
    }

    @Test
    public void testGetIngredientes() {
        assertArrayEquals(new Ingrediente[]{
            new PaoFrances(), new QueijoMussarela(), new PresuntoFrango(), new OvoCapoeira(), new TomateCaqui()
        }, sf.getSanduiche(SanduicheTipo.CAIPIRA).getIngredientes());
    }
}
