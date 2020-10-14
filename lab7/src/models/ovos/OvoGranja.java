package models.ovos;

public class OvoGranja implements Ovo {
    private final String nome = "Ovo de Granja";

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
        if (! (obj instanceof OvoGranja)) {
            return false;
        }
        
        OvoGranja outroOvo = (OvoGranja)obj;

        return this.nome != null && this.nome.equals(outroOvo.getNome());
    }
}
