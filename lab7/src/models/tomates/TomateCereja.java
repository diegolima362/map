package models.tomates;

public class TomateCereja extends Tomate {
    private final String nome = "Tomate Cereja";

    public TomateCereja() {
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
