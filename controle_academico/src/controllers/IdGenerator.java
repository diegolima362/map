package controllers;

class IdGenerator {
    private int idAluno;
    private int idProfessor;
    private int idCadeira;
    private int idTurma;

    protected IdGenerator() {
        this.idAluno = 0;
        this.idProfessor = 0;
        this.idCadeira = 0;
        this.idTurma = 0;
    }

    public int getNewIdAluno() {
        return ++idAluno;
    }

    public int getNewIdProfessor() {
        return ++idProfessor;
    }

    public int getNewIdCadeira() {
        return ++idCadeira;
    }

    public int getNewIdTurma() {
        return ++idTurma;
    }

    public int getCurrentIdAluno() {
        return idAluno;
    }

    public int getCurrentIdProfessor() {
        return idProfessor;
    }

    public int getCurrentIdCadeira() {
        return idCadeira;
    }

    public int getCurrentIdTurma() {
        return idTurma;
    }
}
