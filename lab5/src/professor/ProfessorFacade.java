package professor;

import java.util.ArrayList;

public class ProfessorFacade {
    private ArrayList<Professor> professores;

    public ProfessorFacade() {
        this.professores = new ArrayList<>();
    }

    public void cadastrarProfessor(String nome, ArrayList<Disciplina> disciplinas, double tempoDeCasa) {
        Professor novoProfessor = new Professor(nome, disciplinas, tempoDeCasa);
        professores.add(novoProfessor);
    }

    
    public void mostrarProfessores() {
        for (Professor professor : professores) {
            System.out.printf("Nome: %s, Disiplinas: %s, Tempo: %.1f\n", 
                    professor.getNome(), professor.getDisciplinas().toString(), professor.getTempoDeCasa());
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

    public void mostrarProfessoresPorDiciplina(String disciplinaProcurada) {
        for (Professor professor : professores) {
            for (Disciplina disciplina : professor.getDisciplinas()) {
                if (disciplina.getNome().equals(disciplinaProcurada)) {
                    System.out.printf("Diciplina: %s, Professor: %s\n", 
                            disciplina.getNome(), professor.getNome());
                }
            }
        }
    }
}
