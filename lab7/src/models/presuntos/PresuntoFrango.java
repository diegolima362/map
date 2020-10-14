package models.presuntos;

public class PresuntoFrango implements Presunto {
    private final String nome = "Presunto de Frango";

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
        if (! (obj instanceof PresuntoFrango)) {
            return false;
        }
        
        PresuntoFrango outroPresunto = (PresuntoFrango)obj;

        return this.nome != null && this.nome.equals(outroPresunto.getNome());
    }
}
