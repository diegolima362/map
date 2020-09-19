package professor;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private ArrayList<Disciplina> disciplinas;
    private double tempoDeCasa;

    public Professor(String nome, ArrayList<Disciplina> diciplinas, double tempoDeCasa) {
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.tempoDeCasa = tempoDeCasa;
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public double getTempoDeCasa() {
        return this.tempoDeCasa;
    }

}
