package models;

import java.util.ArrayList;
import java.util.Arrays;

public class TurmaModel {

    private final int id;
    private final CadeiraModel cadeira;
    private final String turno;
    private final ArrayList<AlunoMatriculadoTurma> alunos;

    private ProfessorModel professor;
    private HorarioModel[] horario;

    public TurmaModel(int id, CadeiraModel cadeira, String turno) {
        this.id = id;
        this.cadeira = cadeira;
        this.turno = turno;
        this.alunos = new ArrayList<>();
    }

    public TurmaModel(int id, CadeiraModel cadeira, String turno, ProfessorModel professor, ArrayList<AlunoMatriculadoTurma> alunos, HorarioModel[] horario) {
        this.id = id;
        this.cadeira = cadeira;
        this.turno = turno;
        this.professor = professor;
        this.alunos = alunos;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public String getTurno() {
        return turno;
    }

    public CadeiraModel getCadeira() {
        return cadeira;
    }

    public ProfessorModel getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorModel professor) {
        this.professor = professor;
        professor.getTurmas().addTurma(this);
    }

    // Gerenciar alunos

    public ArrayList<AlunoMatriculadoTurma> getAlunos() {
        return alunos;
    }

    public AlunoMatriculadoTurma getDadosAluno(AlunoModel aluno) {
        return alunos.stream().filter(a -> a.getAlunoModel().equals(aluno)).findFirst().orElse(null);
    }

    public void addAluno(AlunoModel aluno) {
        AlunoMatriculadoTurma alunoMatriculado = new AlunoMatriculadoTurma(aluno);
        aluno.getRdm().addTurma(this);
        alunos.add(alunoMatriculado);
    }

    public boolean hasAluno(AlunoModel aluno) {
        return alunos.stream().anyMatch(a -> a.getAlunoModel().equals(aluno));
    }

    public void removeAluno(AlunoModel aluno) {
        alunos.removeIf(a -> a.getAlunoModel().equals(aluno));
        aluno.getRdm().removeTurma(this);
    }

    public int getTotalAlunos() {
        return alunos.size();
    }

    // Horario management

    public HorarioModel[] getHorario() {
        return horario;
    }

    public void setHorario(HorarioModel[] horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        String str = "Id: " + id + " Cadeira: " + cadeira.getNome() + " Turno: " + turno;

        str += " Professor: ";
        if (professor != null)
            str += professor.getNome();

        str += " Horario: ";
        if (horario != null)
            str += Arrays.toString(horario);

        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TurmaModel)) {
            return false;
        }

        TurmaModel turma = (TurmaModel) o;
        return turma.id == this.id &&
                turma.cadeira.equals(this.cadeira) &&
                turma.turno.equals(this.turno);
    }


}
