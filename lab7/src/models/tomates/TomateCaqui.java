package models.tomates;

public class TomateCaqui extends Tomate {
    private final String nome = "Tomate Caqui";

    public TomateCaqui() {
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
