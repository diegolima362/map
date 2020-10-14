package models.paes;

public class PaoFrances implements Pao {
    private final String nome = "Pão Frances";

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
        if (! (obj instanceof PaoFrances)) {
            return false;
        }
        
        PaoFrances outroPao = (PaoFrances)obj;

        return this.nome != null && this.nome.equals(outroPao.getNome());
    }
}
