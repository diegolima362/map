package models;

import java.util.ArrayList;

public class AlunoRDM {
    private final AlunoModel aluno;
    private final ArrayList<TurmaModel> dados;

    public AlunoRDM(AlunoModel aluno, ArrayList<TurmaModel> dados) {
        this.aluno = aluno;
        this.dados = dados;
    }

    public Horario[] getHorario() {

        // TODO: filtrar os dados do rdm, a lista contem tudo que é preciso
        for (TurmaModel t : dados) {
            System.out.println(t.getDadosAluno(aluno));
        }

        return new Horario[0];
    }
}
