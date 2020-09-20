package professor;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private ArrayList<Disciplina> disciplinas;
    private double tempoDeCasa;

    public Professor(String nome, ArrayList<Disciplina> disciplinas, double tempoDeCasa) {
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

    @Override                                                                                                            public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof Professor)) {
            return false;
        }

        Professor outroProfessor = (Professor)obj;
        return this.nome != null && this.nome.equals(outroProfessor.getNome());
    }

}
