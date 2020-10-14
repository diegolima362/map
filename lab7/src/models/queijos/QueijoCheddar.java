package models.queijos;

public class QueijoCheddar implements Queijo {
    private final String nome = "Queijo Cheddar";

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
        if (! (obj instanceof QueijoCheddar)) {
            return false;
        }
        
        QueijoCheddar outroQueijo = (QueijoCheddar)obj;

        return this.nome != null && this.nome.equals(outroQueijo.getNome());
    }
}
