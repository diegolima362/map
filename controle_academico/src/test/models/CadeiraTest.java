package test.models;

import models.Aluno;
import models.Cadeira;
import models.Professor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CadeiraTest {

    Cadeira cadeira;
    Aluno[] alunos;
    Professor professor;

    @BeforeMethod
    public void setUp() {
        cadeira = new Cadeira(1, "Programacao");

        alunos = new Aluno[]{
                new Aluno(1, "Jane Doe"),
                new Aluno(1, "Mary Doe"),
                new Aluno(1, "Mark Doe")};

        professor = new Professor(1, "John Doe");
    }

    @Test
    public void testObjetoCriado() throws Exception {
        Assert.assertEquals(cadeira.toString(), "Nome: Programacao, Professor: Sem Professor");
    }

    @Test
    public void testSetHorario() {
        cadeira.setHorario(new String[]{"Seg 07:00", "Ter 07:00"});
        Assert.assertEquals(cadeira.toString(), "Nome: Programacao, Professor: Sem Professor, Horario: Seg 07:00 Ter 07:00 ");
    }

    @Test
    public void testSetProfessor() {
        Assert.assertNull(cadeira.getProfessor());

        cadeira.setProfessor(professor);

        Assert.assertEquals(cadeira.getProfessor(), professor);

        Assert.assertEquals(cadeira.toString(), "Nome: Programacao, Professor: John Doe");
    }

    @Test
    public void getAlunos() {
        Assert.assertEquals(cadeira.getTotalAlunos(), 0);

        for (Aluno a : alunos)
            cadeira.addAluno(a);

        Assert.assertEquals(cadeira.getAlunos(), alunos);
        Assert.assertEquals(cadeira.getTotalAlunos(), alunos.length);
    }

}
