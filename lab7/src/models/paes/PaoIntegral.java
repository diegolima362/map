package models.paes;

public class PaoIntegral implements Pao {
    private final String nome = "Pão Integral";

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
        if (! (obj instanceof PaoIntegral)) {
            return false;
        }
        
        PaoIntegral outroPao = (PaoIntegral)obj;

        return this.nome != null && this.nome.equals(outroPao.getNome());
    }
}
