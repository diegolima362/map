package models.presuntos;

public class PresuntoPeru implements Presunto {
    private final String nome = "Presunto de Peru";

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
        if (! (obj instanceof PresuntoPeru)) {
            return false;
        }
        
        PresuntoPeru outroPresunto = (PresuntoPeru)obj;

        return this.nome != null && this.nome.equals(outroPresunto.getNome());
    }
}
