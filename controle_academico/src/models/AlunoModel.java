package models;

public class AlunoModel {
    private final int id;
    private final RegistroCadeiras rdm;
    private String nome;

    public AlunoModel(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.rdm = new RegistroCadeiras();
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

    public RegistroCadeiras getRdm() {
        return rdm;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Nome: " + this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AlunoModel)) {
            return false;
        }

        AlunoModel aluno = (AlunoModel) o;
        return aluno.nome.equals(this.nome)
                && aluno.id == this.id
                && aluno.getRdm().equals(this.rdm);
    }
}
