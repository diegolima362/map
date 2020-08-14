package controllers;

import models.AlunoModel;
import models.CadeiraModel;
import models.ProfessorModel;
import models.TurmaModel;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ControleAcademico {
    private final ArrayList<CadeiraModel> cadeiras;
    private final ArrayList<AlunoModel> alunos;
    private final ArrayList<ProfessorModel> professores;
    private final ArrayList<TurmaModel> turmas;

    private final IdGenerator idGenerator;

    public ControleAcademico() {
        this.cadeiras = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.idGenerator = new IdGenerator();
    }

    // Gerenciar Disciplinas

    public CadeiraModel addCadeira(String nome) {
        int id = idGenerator.getNewIdCadeira();
        CadeiraModel cadeira = new CadeiraModel(id, nome);
        cadeiras.add(cadeira);

        return cadeira;
    }

    public int getTotalCadeiras() {
        return cadeiras.size();
    }

    public CadeiraModel getCadeira(String nome) {
        return cadeiras.stream().filter(c -> c.getNome().equals(nome)).findFirst().orElse(null);
    }

    public CadeiraModel getCadeira(int id) {
        return cadeiras.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public void removeCadeira(CadeiraModel cadeira) {
        cadeiras.removeIf(c -> c.equals(cadeira));
    }

    public void removeCadeira(int id) {
        cadeiras.removeIf(c -> c.getId() == id);
    }

    public ArrayList<CadeiraModel> getAllCadeiras() {
        return cadeiras;
    }

    // Gerenciamento de Alunos

    public AlunoModel addAluno(String nome) {
        int id = idGenerator.getNewIdAluno();
        AlunoModel aluno = new AlunoModel(id, nome);
        alunos.add(aluno);

        return aluno;
    }

    public int getTotalAlunos() {
        return alunos.size();
    }

    public AlunoModel getAluno(String nome) {
        return alunos.stream().filter(a -> a.getNome().equals(nome)).findFirst().orElse(null);
    }

    public AlunoModel getAluno(int id) {
        return alunos.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    public void removeAluno(AlunoModel aluno) {
        alunos.removeIf(a -> a.equals(aluno));
    }

    public void removeAluno(int id) {
        alunos.removeIf(a -> a.getId() == id);
    }

    public ArrayList<AlunoModel> getAllAlunos() {
        return alunos;
    }


    // Gerenciar Professores

    public ProfessorModel addProfessor(String nome) {
        int id = idGenerator.getNewIdProfessor();
        ProfessorModel professor = new ProfessorModel(id, nome);
        professores.add(professor);

        return professor;
    }

    public int getTotalProfessores() {
        return professores.size();
    }

    public ProfessorModel getProfessor(String nome) {
        return professores.stream().filter(p -> p.getNome().equals(nome)).findFirst().orElse(null);
    }

    public ProfessorModel getProfessor(int id) {
        return professores.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void removeProfessor(ProfessorModel professor) {
        professores.removeIf(p -> p.equals(professor));
    }

    public void removeProfessor(int id) {
        professores.removeIf(p -> p.getId() == id);
    }

    public ArrayList<ProfessorModel> getAllProfessores() {
        return professores;
    }


    // Gerenciar Turmas

    public TurmaModel addTurma(CadeiraModel cadeira, String turno) {
        int id = idGenerator.getNewIdTurma();
        TurmaModel turma = new TurmaModel(id, cadeira, turno);
        turmas.add(turma);
        return turma;
    }

    public int getTotalTurmas() {
        return turmas.size();
    }

    public TurmaModel getTurma(int id) {
        return turmas.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    public ArrayList<TurmaModel> getTurmas(CadeiraModel cadeira) {
        return turmas.stream().filter(t -> t.getCadeira().equals(cadeira)).collect(Collectors.toCollection(ArrayList::new));
    }

    public void removeTurma(TurmaModel turma) {
        turmas.removeIf(t -> t.equals(turma));
    }

    public void removeTurma(int id) {
        turmas.removeIf(t -> t.getId() == id);
    }

    public ArrayList<TurmaModel> getAllTurmas() {
        return turmas;
    }
}

