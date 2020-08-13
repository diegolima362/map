package models;

public class ProfessorModel {
    private final int id;
    private String nome;
    private final RegistroCadeiras turmas;

    public ProfessorModel(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.turmas = new RegistroCadeiras();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RegistroCadeiras getTurmas() {
        return turmas;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Nome: " + nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ProfessorModel)) return false;

        ProfessorModel professor = (ProfessorModel) o;
        return professor.id == this.id
                && professor.nome.equals(this.nome)
                && professor.getTurmas().equals(this.turmas);
    }


}
