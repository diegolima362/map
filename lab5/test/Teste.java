package teste;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;

import sig.SIG;
import administrativo.Agenda;
import financeiro.Divida;
import financeiro.Funcionario;
import professor.Professor;
import professor.Disciplina;
import aluno.Aluno;

public class Teste {
    private static SIG sig;
    private static Agenda agenda;

    @BeforeAll
    public static void startUp() { 
        sig = new SIG();
        agenda = new Agenda();
    }
    
    @Test
    public void testAgendarReuniaoDaDiretoria() {
        agenda.agendarReuniao(LocalDate.of(2020, 10, 4));
        assertTrue(agenda.getReunioes().contains(LocalDate.of(2020, 10, 4)));
    }

    @Test
    public void testAgendarEntrevistaDaDiretoria() {
        agenda.agendarEntrevista(LocalDate.of(2020, 10, 12));
        assertTrue(agenda.getEntrevistas().contains(LocalDate.of(2020, 10, 12)));
    }

    @Test
    public void testCadastrariDivida() {
        sig.getFinanceiro().cadastrarDivida("Bolsas", 4000.00, 0.00);
        assertTrue(sig.getFinanceiro().getDividas().contains(new Divida("Bolsas", 4000.00, 0.00)));
    }

    @Test
    public void testCadastrarFuncionario() {
        sig.getFinanceiro().cadastrarFuncionario("Paulo Silva", 3000.00);
        assertTrue(sig.getFinanceiro().getFuncionarios().contains(new Funcionario("Paulo Silva", 3000.00)));
    }

    @Test
    public void testCadastrarProfessor() {
        sig.getProfessor().cadastrarProfessor("Paulo Silva", new ArrayList<>(Arrays.asList(
                        new Disciplina("Cálculo I"),
                        new Disciplina("Álgebra Linear"))), 2.0);
        assertTrue(sig.getProfessor().getProfessores().contains(
                    new Professor("Paulo Silva", new ArrayList<>(Arrays.asList(
                        new Disciplina("Cálculo I"),
                        new Disciplina("Álgebra Linear"))), 2.0)));

    }
    
    @Test
    public void testCadastrarAluno() {
        sig.getAluno().cadastrarAluno("João Gabriel", new ArrayList<>(Arrays.asList(
                       new Disciplina("Linguagem de Programação I"), 
                       new Disciplina("Linguagem de Programação II"))));
        assertTrue(sig.getAluno().getAlunos().contains(new Aluno("João Gabriel", new ArrayList<>(Arrays.asList(
                       new Disciplina("Linguagem de Programação I"), 
                       new Disciplina("Linguagem de Programação II"))))));
    }



}
