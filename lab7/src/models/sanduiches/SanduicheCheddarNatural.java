package models.sanduiches;

import models.Ingrediente;
import models.ovos.Ovo;
import models.ovos.OvoGranja;
import models.paes.Pao;
import models.paes.PaoBola;
import models.queijos.Queijo;
import models.queijos.QueijoCheddar;
import models.presuntos.Presunto;
import models.presuntos.PresuntoFrango;
import models.tomates.Tomate;
import models.tomates.TomateCaqui;

public class SanduicheCheddarNatural implements Sanduiche {
    private final String nome = "Sanduiche Cheddar Natural";

    private final Pao pao;
    private final Queijo queijo;
    private final Presunto presunto;
    private final Ovo ovo;
    private final Tomate tomate;

    public SanduicheCheddarNatural() {
        this.pao = new PaoBola();
        this.queijo = new QueijoCheddar();
        this.presunto = new PresuntoFrango();
        this.ovo = new OvoGranja();
        this.tomate = new TomateCaqui();
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Ingrediente[] getIngredientes() {
        return new Ingrediente[]{pao, queijo, presunto, ovo, tomate};
    }

    @Override
    public void mostrarComponentes() {
        for (Ingrediente i : getIngredientes()) {
            System.out.println(i.getNome());
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(this.nome);
        s.append(" : ");
        for (Ingrediente i : getIngredientes()) {
            s.append(i.getNome()).append(", ");
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof SanduicheCheddarNatural)) {
            return false;
        }

        SanduicheCheddarNatural outroSanduiche = (SanduicheCheddarNatural)obj;
        Ingrediente[] outroIngredientes = outroSanduiche.getIngredientes();
        Ingrediente[] atualIngredientes = getIngredientes();

        for (int i = 0; i < atualIngredientes.length; i++) {
            if (!atualIngredientes[i].getNome().equals(outroIngredientes[i].getNome())) {
                return false;
            }
        }

        return true;
    }
}
