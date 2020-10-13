package models.ovos;

public class OvoCapoeira extends Ovo {
    private final String nome = "Ovo de Capoeira";

    public OvoCapoeira() {
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
