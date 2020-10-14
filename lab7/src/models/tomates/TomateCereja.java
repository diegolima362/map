package models.tomates;

public class TomateCereja implements Tomate {
    private final String nome = "Tomate Cereja";

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
        if (! (obj instanceof TomateCereja)) {
            return false;
        }
        
        TomateCereja outroTomate = (TomateCereja)obj;

        return this.nome != null && this.nome.equals(outroTomate.getNome());
    }
}
