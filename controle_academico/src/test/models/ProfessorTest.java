package test.models;

import models.Cadeira;
import models.Professor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ProfessorTest {

    Professor professor;
    Cadeira cadeira;

    @BeforeMethod
    public void setUp() {
        professor = new Professor(1, "John Doe");
        cadeira = new Cadeira(1, "Programacao");
        cadeira.setHorario(new String[]{"Seg 07:00", "Ter 07:00"});
        cadeira.setProfessor(professor);
    }

    @Test
    public void testObjetoCriado() throws Exception {
        Assert.assertEquals(professor.toString(), "Nome: John Doe");
    }

    @Test
    public void testGetCadeiras() throws Exception {
        Assert.assertEquals(professor.getTotalCadeiras(), 0);
        Assert.assertEquals(professor.getCadeiras(), new Cadeira[0]);
    }

    @Test
    public void testAddCadeira() throws Exception {
        professor.addCadeira(cadeira);

        Assert.assertEquals(professor.getTotalCadeiras(), 1);
        Assert.assertEquals(professor.getCadeiras(), new Cadeira[]{cadeira});
    }

    @Test
    public void testGetHorario() throws Exception {
        professor.addCadeira(cadeira);

        Assert.assertEquals(professor.getHorario(), "\nProgramacao [Seg 07:00, Ter 07:00]\n");
    }

} 
