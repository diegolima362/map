package professor;

public class Disciplina {
    private String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
