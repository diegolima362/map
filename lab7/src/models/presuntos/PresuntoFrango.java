package models.presuntos;

public class PresuntoFrango extends Presunto {
    private final String nome = "Presunto de Frango";

    public PresuntoFrango() {
    }

    @Override
    public String getNome() {
        return nome;
    }
}
