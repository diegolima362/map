package models.sanduiches;

import models.Ingrediente;
import models.Sanduiche;
import models.ovos.Ovo;
import models.ovos.OvoCapoeira;
import models.paes.Pao;
import models.paes.PaoFrances;
import models.queijos.Queijo;
import models.queijos.QueijoMussarela;
import models.tomates.Tomate;
import models.tomates.TomateCaqui;

public class SanduicheVegetariano extends Sanduiche {
    private final String nome = "Sanduiche Vegetariano";

    private final Pao pao;
    private final Ovo ovo;
    private final Queijo queijo;
    private final Tomate tomate;

    public SanduicheVegetariano() {
        this.pao = new PaoFrances();
        this.ovo = new OvoCapoeira();
        this.queijo = new QueijoMussarela();
        this.tomate = new TomateCaqui();
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Ingrediente[] getIngredientes() {
        return new Ingrediente[]{pao, ovo, queijo, tomate};
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
}
