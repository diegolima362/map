package controllers;

class IdGenerator {
    private int idAluno;
    private int idProfessor;
    private int idCadeira;
    private int idTurma;

    private static IdGenerator idGenerator;

    private IdGenerator() {
        this.idAluno = 0;
        this.idProfessor = 0;
        this.idCadeira = 0;
        this.idTurma = 0;

    }

    public static IdGenerator instanceOf() {
        if (idGenerator == null)
            idGenerator = new IdGenerator();

        return idGenerator;
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
}
