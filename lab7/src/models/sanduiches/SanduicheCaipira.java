package models.sanduiches;

import models.Ingrediente;
import models.ovos.Ovo;
import models.ovos.OvoCapoeira;
import models.paes.Pao;
import models.paes.PaoFrances;
import models.presuntos.Presunto;
import models.presuntos.PresuntoFrango;
import models.queijos.Queijo;
import models.queijos.QueijoMussarela;
import models.tomates.Tomate;
import models.tomates.TomateCaqui;

public class SanduicheCaipira implements Sanduiche {
    private final String nome = "Sanduiche Caipira";

    private final Pao pao;
    private final Queijo queijo;
    private final Presunto presunto;
    private final Ovo ovo;
    private final Tomate tomate;

    public SanduicheCaipira() {
        this.pao = new PaoFrances();
        this.queijo = new QueijoMussarela();
        this.presunto = new PresuntoFrango();
        this.ovo = new OvoCapoeira();
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
        if (! (obj instanceof SanduicheCaipira)) {
            return false;
        }

        SanduicheCaipira outroSanduiche = (SanduicheCaipira)obj;
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
