package aluno;

import java.util.ArrayList;

import professor.Disciplina;

public class Aluno {
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(String nome, ArrayList<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void mostrarRDM() {
        for (Disciplina disciplina : disciplinas) {
            System.out.printf("Disciplina: %s\n", disciplina.getNome());
        }
    }
}
