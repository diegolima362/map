package controllers;

import models.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ControleAcademico {
    private final ArrayList<CadeiraModel> cadeiras;
    private final ArrayList<AlunoModel> alunos;
    private final ArrayList<ProfessorModel> professores;
    private final ArrayList<TurmaModel> turmas;

    private final IdGenerator idGenerator = IdGenerator.instanceOf();

    public ControleAcademico() {
        this.cadeiras = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    public int getTotalCadeiras() {
        return cadeiras.size();
    }

    public void addCadeira(CadeiraModel cadeira) {
        this.cadeiras.add(cadeira);
    }

    public void removeCadeira(CadeiraModel cadeira) {
        cadeiras.removeIf(c -> c.equals(cadeira));
    }

    public CadeiraModel[] getAllCadeiras() {
        return cadeiras.toArray(new CadeiraModel[0]);
    }

    public AlunoModel registrarAluno(String nome) {
        int id = idGenerator.getNewIdTurma();
        AlunoModel aluno = new AlunoModel(id, nome);
        alunos.add(aluno);

        return aluno;
    }

    public AlunoRDM getRDM(AlunoModel aluno) {
        ArrayList<TurmaModel> alunoTurmas = turmas.stream().filter(turma -> turma.hasAluno(aluno)).collect(Collectors.toCollection(ArrayList::new));

        //        for (TurmaModel turma : turmas) {
        //            if (turma.hasAluno(aluno)) {
        //                alunoTurmas.add(turma);
        //            }
        //        }

        return new AlunoRDM(alunoTurmas);
    }

    public ProfessorModel registrarProfessor(String nome) {
        int id = idGenerator.getNewIdProfessor();
        ProfessorModel professor = new ProfessorModel(id, nome);
        professores.add(professor);

        return professor;
    }

    public TurmaModel registrarTurma(CadeiraModel cadeira, String turno) {
        int id = idGenerator.getNewIdTurma();
        TurmaModel turma = new TurmaModel(id, cadeira, turno);
        turmas.add(turma);

        return turma;
    }
}

