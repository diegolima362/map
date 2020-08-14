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

    public void addFalta() {
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

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AlunoMatriculadoTurma)) {
            return false;
        }

        AlunoMatriculadoTurma alunoMatriculado = (AlunoMatriculadoTurma) o;
        return alunoMatriculado.getAlunoModel().equals(this.getAlunoModel()) &&
                alunoMatriculado.faltas == this.faltas &&
                alunoMatriculado.notaUndI == this.notaUndI &&
                alunoMatriculado.notaUndII == this.notaUndII &&
                alunoMatriculado.notaProvaFinal == this.notaProvaFinal;
    }

    @Override
    public String toString() {
        return aluno + " faltas: " + faltas + " nota1: " + notaUndI + " nota2: " + notaUndII + " final: " + notaProvaFinal;
    }
}
