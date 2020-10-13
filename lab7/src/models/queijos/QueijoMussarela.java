package models.queijos;

public class QueijoMussarela extends Queijo {
    private final String nome = "Queijo Mussarela";

    public QueijoMussarela() {
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
