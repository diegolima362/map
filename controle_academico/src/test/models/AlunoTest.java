package test.models;

import models.Aluno;
import models.Cadeira;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AlunoTest {

    Aluno aluno;
    Cadeira cadeira;

    @BeforeMethod
    public void setUp() {
        aluno = new Aluno(1, "Jane Doe");
        cadeira = new Cadeira(1, "Programacao");
        cadeira.setHorario(new String[]{"Seg 07:00", "Ter 07:00"});
    }

    @Test
    public void testObjetoCriado() throws Exception {
        Assert.assertEquals(aluno.toString(), "Nome: Jane Doe Matricula: 1");
    }

    @Test
    public void testGetCadeiras() throws Exception {
        Assert.assertEquals(aluno.getTotalCadeiras(), 0);
        Assert.assertEquals(aluno.getCadeiras(), new Cadeira[0]);
    }

    @Test
    public void testAddCadeira() throws Exception {
        aluno.addCadeira(cadeira);

        Assert.assertEquals(aluno.getTotalCadeiras(), 1);
        Assert.assertEquals(aluno.getCadeiras(), new Cadeira[]{cadeira});
    }

    @Test
    public void testGetHorario() throws Exception {
        aluno.addCadeira(cadeira);
        aluno.addCadeira(new Cadeira(2, "Programacao II", new String[]{"Qua 09:00","Qui 07:00"}));

        Assert.assertEquals(aluno.getHorario(), "\nProgramacao [Seg 07:00, Ter 07:00]\n" +
                "Programacao II [Qua 09:00, Qui 07:00]\n");
    }

}
