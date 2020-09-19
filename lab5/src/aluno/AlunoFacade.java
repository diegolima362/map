package aluno;

import java.util.ArrayList;
import professor.Disciplina;

public class AlunoFacade {
    private ArrayList<Aluno> alunos;

    public AlunoFacade() {
        this.alunos = new ArrayList<>();
    }

    public void cadastrarAluno(String nome, ArrayList<Disciplina> disciplinas) {
        Aluno novoAluno = new Aluno(nome, disciplinas);
        this.alunos.add(novoAluno);
    }

    public void mostrarRDMDoAluno(String alunoProcurado) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(alunoProcurado)) {
                aluno.mostrarRDM();
                break;
            }
        }    
    }
}
