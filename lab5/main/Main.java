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
        sig.getProfessor().mostrarProfessoresPorDiciplina("Linguagem de Programação II");


    }
}
