package models.queijos;

public class QueijoPrato extends Queijo {
    private final String nome = "Queijo Prato";

    public QueijoPrato() {
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
