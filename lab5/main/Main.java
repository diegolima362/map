package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import sig.SIG;
import professor.Disciplina;

public class Main {

    public static void main(String[] args) {
        SIG sig = new SIG();

        System.out.println("SubSistema Administrativo.");
        System.out.println("Agenda das reuniões da diretoria");
        sig.getAdministrativo().agendarReuniaoDaDiretoria(LocalDate.of(2020, 10, 4));
        sig.getAdministrativo().agendarReuniaoDaDiretoria(LocalDate.of(2020, 12, 25));

        sig.getAdministrativo().reunioesAgendadasDiretoria();

        System.out.println("Agenda das entrevitas da diretoria");
        sig.getAdministrativo().agendarEntrevistaDaDiretoria(LocalDate.of(2020, 12, 24));
        sig.getAdministrativo().agendarEntrevistaDaDiretoria(LocalDate.of(2020, 10, 12));

        sig.getAdministrativo().entrevistasAgendadasDiretoria();

        System.out.println("");
        System.out.println("SubSistema Financeiro.");
        System.out.println("Balanço das Contas");
        sig.getFinanceiro().cadastrarDivida("Bolsas", 4000.00, 0.00);
        sig.getFinanceiro().cadastrarDivida("Contas à pagar", 0.00, 10000.00);

        sig.getFinanceiro().mostrarBalanco();

        System.out.println("Folha de Pagamentos");
        sig.getFinanceiro().cadastrarFuncionario("Paulo Silva", 3000.00);
        sig.getFinanceiro().cadastrarFuncionario("Maria Gomes", 5000.00);

        sig.getFinanceiro().mostrarFolhaDePagamentos();


        System.out.println("");
        System.out.println("SubSistema Professor");
        System.out.println("Professores");


        sig.getProfessor().cadastrarProfessor("Paulo Silva", new ArrayList<>(Arrays.asList(
                        new Disciplina("Cálculo I"),
                        new Disciplina("Álgebra Linear"))), 2.0);

        sig.getProfessor().cadastrarProfessor("Maria Gomes", new ArrayList<>(Arrays.asList(
                        new Disciplina("Linguagem de Programação I"),
                        new Disciplina("Linguagem de Programação II"))), 1.6);

        sig.getProfessor().cadastrarProfessor("Luciana", new ArrayList<>(Arrays.asList(
                        new Disciplina("Linguagem de Programação I"),
                        new Disciplina("Linguagem de Programação II"))), 4.0);
        
        sig.getProfessor().mostrarProfessores();

        System.out.println("Tempo de casa de um professor");
        sig.getProfessor().mostrarTempoDeCasa("Paulo Silva");

        System.out.println("Professores de uma mesma disciplina");
        sig.getProfessor().mostrarProfessoresPorDisciplina("Linguagem de Programação II");

        System.out.println("");
        System.out.println("SubSistema Aluno.");
        System.out.println("Alunos.");

       sig.getAluno().cadastrarAluno("João Gabriel", new ArrayList<>(Arrays.asList(
                       new Disciplina("Linguagem de Programação I"), 
                       new Disciplina("Linguagem de Programação II"))));
       sig.getAluno().cadastrarAluno("Diego Lima", new ArrayList<>(Arrays.asList(
                       new Disciplina("Cálculo I"),
                       new Disciplina("Álgebra Linear"))));

       sig.getAluno().mostrarRDMDoAluno("João Gabriel");
       sig.getAluno().mostrarRDMDoAluno("Diego Lima");

       System.out.println("");
       System.out.println("SubSistema Álmoxarifado");
       System.out.println("Materias");

       sig.getAlmoxarifado().cadastrarMaterial("Cadeira", 300.00);
       sig.getAlmoxarifado().cadastrarMaterial("Apagador", 33.95);

       sig.getAlmoxarifado().comprarMaterial("Computador", 1785.00);

       sig.getAlmoxarifado().mostrarEstoque();
        
       System.out.println("");
       System.out.println("SubSistema InfraEstrutura.");
       System.out.println("Salas.");
        
       sig.getInfraEstrutura().cadastrarSala(201, "A", true);
       sig.getInfraEstrutura().cadastrarSala(103, "C", true);
       sig.getInfraEstrutura().cadastrarSala(104, "B", true);

       sig.getInfraEstrutura().reservarSala("Paulo Silva", 103, "C");
        
       sig.getInfraEstrutura().mostrarSalas();

       System.out.println("Salas disponíveis");
       sig.getInfraEstrutura().mostrarSalasDisponiveis();

    }
}
