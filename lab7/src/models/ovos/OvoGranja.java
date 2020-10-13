package models.ovos;

public class OvoGranja extends Ovo {
    private final String nome = "Ovo de Granja";

    public OvoGranja() {
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
