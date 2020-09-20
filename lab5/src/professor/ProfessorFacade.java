package professor;

import java.util.ArrayList;

public class ProfessorFacade {
    private final ArrayList<Professor> professores;

    public ProfessorFacade() {
        this.professores = new ArrayList<>();
    }

    public ArrayList<Professor> getProfessores() {
        return this.professores;
    }

    public void cadastrarProfessor(String nome, ArrayList<Disciplina> disciplinas, double tempoDeCasa) {
        Professor novoProfessor = new Professor(nome, disciplinas, tempoDeCasa);
        professores.add(novoProfessor);
    }


    public void mostrarProfessores() {
        for (Professor professor : professores) {
            System.out.printf("Nome: %s, Disciplinas: %s, Tempo: %.1f\n",
                    professor.getNome(), professor.getDisciplinas() == null ? "" : professor.getDisciplinas().toString(), professor.getTempoDeCasa());
        }
    }

    public void mostrarTempoDeCasa(String professorProcurado) {
        for (Professor professor : professores) {
            if (professor.getNome().equals(professorProcurado)) {
                System.out.printf("Nome: %s, Tempo: %f\n", professor.getNome(), professor.getTempoDeCasa());
                break;
            }
        }
    }

    public void mostrarProfessoresPorDisciplina(String disciplinaProcurada) {
        for (Professor professor : professores) {
            if(professor.getDisciplinas() == null)
                continue;
            for (Disciplina disciplina : professor.getDisciplinas()) {
                if (disciplina.getNome().equals(disciplinaProcurada)) {
                    System.out.printf("Disciplina: %s, Professor: %s\n",
                            disciplina.getNome(), professor.getNome());
                }
            }
        }
    }
}
