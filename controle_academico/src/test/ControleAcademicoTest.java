package test;

import controllers.ControleAcademico;
import models.AlunoModel;
import models.CadeiraModel;
import models.ProfessorModel;
import models.TurmaModel;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ControleAcademicoTest {

    static ControleAcademico ca;

    @BeforeAll
    public static void setUp() {
        ca = new ControleAcademico();

        ca.addCadeira("REDES DE COMPUTADORES");
        ca.addCadeira("TÉCNICAS DE ANÁLISE DE ALGORITMO");
        ca.addCadeira("BANCO DE DADOS");
        ca.addCadeira("MÉTODOS AVANÇADOS DE PROGRAMAÇÃO");
        ca.addCadeira("ENGENHARIA DE SOFTWARE I");
        ca.addCadeira("PARADIGMAS DE PROGRAMAÇÃO");
        ca.addCadeira("PROBABILIDADE E ESTATÍSTICA II");

        ca.addAluno("João Gabriel");
        ca.addAluno("Diego Lima");
        ca.addAluno("Davi Campos");
        ca.addAluno("Maria Coutinho");
        ca.addAluno("Pedro Silva");
        ca.addAluno("Carlos Gomes");
        ca.addAluno("Carlos Silva");
        ca.addAluno("Renan Coelho");
        ca.addAluno("Luan Silva");
        ca.addAluno("Joel Carvalho");

        ca.addProfessor("PAULO CESAR OLVEIRA BRITO");
        ca.addProfessor("FÁBIO LUIZ LEITE JÚNIOR");
        ca.addProfessor("SABRINA DE FIGUEIRÊDO SOUTO");
        ca.addProfessor("LUCIANA DE QUEIROZ LEAL GOMES");
        ca.addProfessor("JANDERSON JASON BARBOSA AGUIAR");
        ca.addProfessor("MARIA DAS VITÓRIAS ALEXANDRE SERAFIM");

        ca.addTurma(ca.getCadeira(1), "Noite");
        ca.addTurma(ca.getCadeira(2), "Manhã");
        ca.addTurma(ca.getCadeira(3), "Noite");
        ca.addTurma(ca.getCadeira(1), "Manhã");
    }

    @Test
    @Order(1)
    void testGetAllCadeiras() {
        ArrayList<CadeiraModel> caCadeiras = new ArrayList<>();

        caCadeiras.add(new CadeiraModel(1, "REDES DE COMPUTADORES"));
        caCadeiras.add(new CadeiraModel(2, "TÉCNICAS DE ANÁLISE DE ALGORITMO"));
        caCadeiras.add(new CadeiraModel(3, "BANCO DE DADOS"));
        caCadeiras.add(new CadeiraModel(4, "MÉTODOS AVANÇADOS DE PROGRAMAÇÃO"));
        caCadeiras.add(new CadeiraModel(5, "ENGENHARIA DE SOFTWARE I"));
        caCadeiras.add(new CadeiraModel(6, "PARADIGMAS DE PROGRAMAÇÃO"));
        caCadeiras.add(new CadeiraModel(7, "PROBABILIDADE E ESTATÍSTICA II"));

        assertArrayEquals(caCadeiras.toArray(), ca.getAllCadeiras().toArray());
    }

    @Test
    @Order(2)
    void testGetTotalCadeiras() {
        assertEquals(7, ca.getTotalCadeiras());
    }

    @Test
    @Order(3)
    void testGetCadeira() {
        assertEquals("TÉCNICAS DE ANÁLISE DE ALGORITMO",
                ca.getCadeira("TÉCNICAS DE ANÁLISE DE ALGORITMO")
                        .getNome());

    }

    @Test
    @Order(4)
    void testGetCadeiraPorId() {
        assertEquals("REDES DE COMPUTADORES",
                ca.getCadeira(1).getNome());
    }

    @Test
    @Order(5)
    void testAddCadeira() {
        ca.addCadeira("MATEMÁTICA DISCRETA I");
        assertEquals("MATEMÁTICA DISCRETA I",
                ca.getCadeira("MATEMÁTICA DISCRETA I")
                        .getNome());
    }

    @Test
    @Order(6)
    void testRemoveCadeira() {
        ca.removeCadeira(ca.getCadeira("MATEMÁTICA DISCRETA I"));
        assertNull(ca.getCadeira("MATEMÁTICA DISCRETA I"));
    }

    @Test
    @Order(7)
    void testRemoveCadeiraPorId() {
        ca.addCadeira("CÁLCULO DIFERENCIAL E INTEGRAL I");
        ca.removeCadeira(ca.getCadeira("CÁLCULO DIFERENCIAL E INTEGRAL I").getId());
        assertNull(ca.getCadeira("CÁLCULO DIFERENCIAL E INTEGRAL I"));
    }

    @Test
    @Order(8)
    void testGetAluno() {
        assertEquals("Davi Campos", ca.getAluno("Davi Campos").getNome());
    }

    @Test
    @Order(9)
    void testGetAlunoPorId() {
        assertEquals("Diego Lima", ca.getAluno(2).getNome());
    }

    @Test
    @Order(10)
    void testTotalAlunos() {
        assertEquals(10, ca.getTotalAlunos());
    }

    @Test
    @Order(11)
    void testAddAluno() {
        ca.addAluno("Novo Aluno");
        assertEquals("Novo Aluno", ca.getAluno("Novo Aluno").getNome());
    }

    @Test
    @Order(12)
    void testRemoveAluno() {
        ca.removeAluno(ca.getAluno("Novo Aluno"));
        assertNull(ca.getAluno("Novo Aluno"));
    }

    @Test
    @Order(13)
    void testRemoveAlunoPorId() {
        ca.addAluno("Juliana Costa");
        ca.removeAluno(ca.getAluno("Juliana Costa").getId());

        assertNull(ca.getAluno("Juliana Costa"));
    }

    @Test
    @Order(14)
    void testGetAllAlunos() {
        ArrayList<AlunoModel> caAlunos = new ArrayList<>();

        caAlunos.add(new AlunoModel(1, "João Gabriel"));
        caAlunos.add(new AlunoModel(2, "Diego Lima"));
        caAlunos.add(new AlunoModel(3, "Davi Campos"));
        caAlunos.add(new AlunoModel(4, "Maria Coutinho"));
        caAlunos.add(new AlunoModel(5, "Pedro Silva"));
        caAlunos.add(new AlunoModel(6, "Carlos Gomes"));
        caAlunos.add(new AlunoModel(7, "Carlos Silva"));
        caAlunos.add(new AlunoModel(8, "Renan Coelho"));
        caAlunos.add(new AlunoModel(9, "Luan Silva"));
        caAlunos.add(new AlunoModel(10, "Joel Carvalho"));

        assertArrayEquals(caAlunos.toArray(), ca.getAllAlunos().toArray());

    }

    @Test
    @Order(15)
    void testGetProfessor() {
        assertEquals("MARIA DAS VITÓRIAS ALEXANDRE SERAFIM",
                ca.getProfessor("MARIA DAS VITÓRIAS ALEXANDRE SERAFIM")
                        .getNome());
    }

    @Test
    @Order(16)
    void testGetProfessorPorId() {
        assertEquals("SABRINA DE FIGUEIRÊDO SOUTO", ca.getProfessor(3).getNome());
    }

    @Test
    @Order(17)
    void testGetTotalProfessores() {
        assertEquals(6, ca.getTotalProfessores());
    }

    @Test
    @Order(18)
    void testAddProfessor() {
        ca.addProfessor("Novo Professor");
        assertEquals("Novo Professor", ca.getProfessor("Novo Professor").getNome());
    }

    @Test
    @Order(19)
    void testRemoveProfessor() {
        ca.removeProfessor(ca.getProfessor("Novo Professor"));
        assertNull(ca.getProfessor("Novo Professor"));
    }

    @Test
    @Order(20)
    void testRemoveProfessorPorId() {
        ca.addProfessor("Paulo");
        ca.removeProfessor(ca.getProfessor("Paulo").getId());

        assertNull(ca.getProfessor("Paulo"));
    }

    @Test
    @Order(21)
    void testGetAllProfessores() {
        ArrayList<ProfessorModel> caProfessores = new ArrayList<>();

        caProfessores.add(new ProfessorModel(1, "PAULO CESAR OLVEIRA BRITO"));
        caProfessores.add(new ProfessorModel(2, "FÁBIO LUIZ LEITE JÚNIOR"));
        caProfessores.add(new ProfessorModel(3, "SABRINA DE FIGUEIRÊDO SOUTO"));
        caProfessores.add(new ProfessorModel(4, "LUCIANA DE QUEIROZ LEAL GOMES"));
        caProfessores.add(new ProfessorModel(5, "JANDERSON JASON BARBOSA AGUIAR"));
        caProfessores.add(new ProfessorModel(6, "MARIA DAS VITÓRIAS ALEXANDRE SERAFIM"));

        assertArrayEquals(caProfessores.toArray(),
                ca.getAllProfessores().toArray());

    }

    @Test
    @Order(22)
    void testGetTotalTurmas() {
        assertEquals(4, ca.getTotalTurmas());
    }

    @Test
    @Order(23)
    void testGetTurma() {
        assertEquals("REDES DE COMPUTADORES", ca.getTurma(1).getCadeira().getNome());
    }

    @Test
    @Order(24)
    void testAddTurma() {
        ca.addTurma(ca.getCadeira(5), "Noite");
        assertEquals("ENGENHARIA DE SOFTWARE I", ca.getTurma(5).getCadeira().getNome());
    }

    @Test
    @Order(25)
    void testRemoveTurma() {
        ca.removeTurma(ca.getTurma(5));
        assertNull(ca.getTurma(5));
    }

    @Test
    @Order(26)
    void testRemoveTurmaPorId() {
        ca.addTurma(ca.getCadeira(6), "Noite");
        ca.removeTurma(6);
        assertNull(ca.getTurma(5));
    }

    @Test
    @Order(27)
    void testGetAllTurmas() {
        ControleAcademico ca2 = new ControleAcademico();
        ArrayList<TurmaModel> turmas = new ArrayList<>();
        ArrayList<CadeiraModel> cadeiras = new ArrayList<>();

        cadeiras.add(new CadeiraModel(1,"Cadeira 1"));
        cadeiras.add(new CadeiraModel(1,"Cadeira 2"));
        cadeiras.add(new CadeiraModel(1,"Cadeira 3"));

        AtomicInteger i = new AtomicInteger();
        cadeiras.forEach(c -> turmas.add(new TurmaModel(i.incrementAndGet(), c, "Noite")));

        cadeiras.forEach(c -> ca2.addTurma(c, "Noite"));

        assertEquals(turmas, ca2.getAllTurmas());

    }
}
