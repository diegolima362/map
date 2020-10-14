package models.queijos;

public class QueijoPrato implements Queijo {
    private final String nome = "Queijo Prato";

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
        if (! (obj instanceof QueijoPrato)) {
            return false;
        }
        
        QueijoPrato outroQueijo = (QueijoPrato)obj;

        return this.nome != null && this.nome.equals(outroQueijo.getNome());
    }
}
