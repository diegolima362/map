package models;


import java.util.ArrayList;
import java.util.Arrays;

public class Cadeira {
    private final int id;
    private String nome;
    private String[] horario;
    private Professor professor;
    private final ArrayList<Aluno> alunos;

    public Cadeira(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public Cadeira(int id, String nome, Professor professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public Cadeira(int id, String nome, Professor professor, String[] horario) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.horario = horario;
        this.alunos = new ArrayList<>();
    }

    public Cadeira(int id, String nome, String[] horario) {
        this.id = id;
        this.nome = nome;
        this.horario = horario;
        this.alunos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getHorario() {
        return horario;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Aluno[] getAlunos() {
        return alunos.toArray(new Aluno[0]);
    }

    public int getTotalAlunos() {
        return alunos.size();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Nome: " + nome + ", Professor: ");

        if (this.professor != null)
            str.append(professor.getNome());
        else
            str.append("Sem Professor");

        if (horario != null) {
            str.append(", Horario: ");
            Arrays.stream(this.horario).forEach(horario -> str.append(horario).append(" "));
        }

        return str.toString();
    }
}
