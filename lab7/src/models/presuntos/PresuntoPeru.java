package models.presuntos;

public class PresuntoPeru extends Presunto {
    private final String nome = "Presunto de Peru";

    public PresuntoPeru() {
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
