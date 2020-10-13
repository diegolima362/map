package models.queijos;

public class QueijoCheddar extends Queijo {
    private final String nome = "Queijo Cheddar";

    public QueijoCheddar() {
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
