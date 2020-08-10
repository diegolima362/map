package models;

public class AlunoMatriculadoTurma {
    private final AlunoModel aluno;
    private int faltas;

    private double notaUndI;
    private double notaUndII;
    private double notaProvaFinal;

    public AlunoMatriculadoTurma(AlunoModel aluno) {
        this.aluno = aluno;
    }

    public AlunoModel getAlunoModel() {
        return aluno;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public void addFalta(){
        ++this.faltas;
    }

    public double getNotaUndI() {
        return notaUndI;
    }

    public void setNotaUndI(double notaUndI) {
        this.notaUndI = notaUndI;
    }

    public double getNotaUndII() {
        return notaUndII;
    }

    public void setNotaUndII(double notaUndII) {
        this.notaUndII = notaUndII;
    }

    public double getNotaProvaFinal() {
        return notaProvaFinal;
    }

    public void setNotaProvaFinal(double notaProvaFinal) {
        this.notaProvaFinal = notaProvaFinal;
    }
}
