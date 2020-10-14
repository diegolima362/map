package models.tomates;

public class TomateCaqui implements Tomate {
    private final String nome = "Tomate Caqui";

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
        if (! (obj instanceof TomateCaqui)) {
            return false;
        }
        
        TomateCaqui outroTomate = (TomateCaqui)obj;

        return this.nome != null && this.nome.equals(outroTomate.getNome());
    }
}
