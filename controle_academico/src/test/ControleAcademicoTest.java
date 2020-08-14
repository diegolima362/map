package teste;

import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;

import controllers.ControleAcademico;
import models.CadeiraModel;
import models.AlunoModel;
import models.ProfessorModel;
import models.TurmaModel;

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
		ca.addAluno("Carlos Silava");
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
		ca.addTurma(ca.getCadeira(2),"Manhã");
		ca.addTurma(ca.getCadeira(3), "Noite");
		ca.addTurma(ca.getCadeira(1), "Manhã");
	}
	
	@Test
	@Order(1)
	void testGetAllCadeiras() {
		ArrayList<CadeiraModel> caCadeiras = ca.getAllCadeiras();
		assertEquals(7, caCadeiras.size());
	}
	
	@Test
	@Order(2)
	void testGetTotalCadeiras() {
		assertEquals(7, ca.getTotalCadeiras());
	}

	@Test
	@Order(3)
	void testGetCadera() {
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
		assertTrue(ca.getCadeira("MATEMÁTICA DISCRETA I") == null);
	}

	@Test
	@Order(7)
	void testRemoveCadeiraPorId() {
		ca.addCadeira("CÁLCULO DIFERENCIAL E INTEGRAL I");
		ca.removeCadeira(ca.getCadeira("CÁLCULO DIFERENCIAL E INTEGRAL I").getId());
		assertTrue(ca.getCadeira("CÁLCULO DIFERENCIAL E INTEGRAL I") == null);
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
		assertTrue(ca.getAluno("Novo Aluno") == null);
	}

	@Test
	@Order(13)
	void testRemoveAlunoPorId() {
		ca.addAluno("Juliana Costa");
		ca.removeAluno(ca.getAluno("Juliana Costa").getId());

		assertTrue(ca.getAluno("Juliana Costa") == null);
	}

	@Test
	@Order(14)
	void testGetAllAlunos() {
		ArrayList<AlunoModel> caAlunos = ca.getAllAlunos();
		assertEquals(10, caAlunos.size());

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
		assertTrue(ca.getProfessor("Novo Professor") == null);
	}

	@Test
	@Order(20)
	void testRemoveProfessorPorId() {
		ca.addProfessor("Paulo");
		ca.removeProfessor(ca.getProfessor("Paulo").getId());

		assertTrue(ca.getProfessor("Paulo") == null);
	}

	@Test
	@Order(21)
	void testGetAllProfessores() {
		ArrayList<ProfessorModel> caProfessores = ca.getAllProfessores();
		assertEquals(6, caProfessores.size());		
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
		assertTrue(ca.getTurma(5) == null);
	}

	@Test
	@Order(26)
	void testRemoveTurmaPorId() {
		ca.addTurma(ca.getCadeira(6), "Noite");
		ca.removeTurma(6);
		assertTrue(ca.getTurma(5) == null);
	}

	@Test
	@Order(27)
	void testGetAllTurmas() {
		ArrayList<TurmaModel> caTurmas = ca.getAllTurmas();
		assertEquals(4, caTurmas.size());
	}

	

}