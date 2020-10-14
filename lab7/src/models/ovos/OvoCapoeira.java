package models.ovos;

public class OvoCapoeira implements Ovo {
    private final String nome = "Ovo de Capoeira";

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof OvoCapoeira)) {
            return false;
        }
        
        OvoCapoeira outroOvo = (OvoCapoeira)obj;

        return this.nome != null && this.nome.equals(outroOvo.getNome());
    }
}
