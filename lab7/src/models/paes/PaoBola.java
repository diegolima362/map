package models.paes;

public class PaoBola implements Pao {
    private final String nome = "Pão Bola";

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof PaoBola)) {
            return false;
        }
        
        PaoBola outroPao = (PaoBola)obj;

        return this.nome != null && this.nome.equals(outroPao.getNome());
    }
}

