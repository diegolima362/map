package models.queijos;

public class QueijoMussarela implements Queijo {
    private final String nome = "Queijo Mussarela";

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
        if (! (obj instanceof QueijoMussarela)) {
            return false;
        }
        
        QueijoMussarela outroQueijo = (QueijoMussarela)obj;

        return this.nome != null && this.nome.equals(outroQueijo.getNome());
    }
}
