package lab1;


import controllers.ControleAcademico;
import models.*;

public class Main {

    public static void main(String[] args) {

        ControleAcademico ca = new ControleAcademico();

        // add professores
        ProfessorModel professor1 = ca.addProfessor("John Doe");
        ProfessorModel professor2 = ca.addProfessor("Jane Doe");

        // add alunos
        AlunoModel aluno1 = ca.addAluno("Mark");
        ca.addAluno("Jack");
        ca.addAluno("Mary");
        ca.addAluno("Jimmy");

        // add disciplinas
        CadeiraModel cadeira1 = ca.addCadeira("Programacao");
        CadeiraModel cadeira2 = ca.addCadeira("Redes");
        ca.addCadeira("Banco de Dados");


        // criar turmas
        TurmaModel turma1 = ca.addTurma(cadeira1, "Noite");
        TurmaModel turma2 = ca.addTurma(cadeira1, "Manha");
        TurmaModel turma3 = ca.addTurma(cadeira2, "Noite");

        // set horario to turma
        turma1.setHorario(
                new HorarioModel[]{new HorarioModel("Seg", "18:00", "20:00", "Sala 1"),
                        new HorarioModel("Qua", "20:00", "22:00", "Sala 1")});

        turma2.setHorario(
                new HorarioModel[]{new HorarioModel("Seg", "07:00", "09:00", "Sala 2"),
                        new HorarioModel("Qua", "09:00", "11:00", "Sala 2")});

        turma3.setHorario(
                new HorarioModel[]{new HorarioModel("Qua", "18:00", "20:00", "Sala 1"),
                        new HorarioModel("Seg", "20:00", "22:00", "Sala 1")});

        // set professor to turma
        turma1.setProfessor(professor1);
        turma2.setProfessor(professor2);
        turma3.setProfessor(professor1);


        // add alunos to turma
        turma1.addAluno(ca.getAluno(1));
        turma1.addAluno(ca.getAluno(2));
        turma1.addAluno(ca.getAluno(3));

        turma3.addAluno(ca.getAluno(1));



        System.out.println("\n-----------------------------------");
        System.out.println(professor1);

        System.out.println("\nTurmas de um professor");
        professor1.getTurmas().getAllTurmas().forEach(System.out::println);

        System.out.println("\nHorario de um professor");
        professor1.getTurmas().getHorario().forEach(System.out::println);

        System.out.println("-----------------------------------\n");

        System.out.println(cadeira1);
        System.out.println("Turmas com essa disciplina");
        ca.getTurmas(cadeira1).forEach(System.out::println);

        System.out.println("-----------------------------------\n");

        System.out.println(turma1);
        System.out.println("Alunos na turma: " + turma1.getTotalAlunos());
        turma1.getAlunos().forEach(System.out::println);

        System.out.println("-----------------------------------\n");

        System.out.println(aluno1);
        System.out.println("Turmas que o aluno faz parte: " + aluno1.getRdm().getTotalTurmas());
        System.out.println("Horario: ");
        aluno1.getRdm().getHorario().forEach(System.out::println);



    }
}
