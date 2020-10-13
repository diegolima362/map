package models.sanduiches;

import models.Ingrediente;
import models.Sanduiche;
import models.ovos.Ovo;
import models.ovos.OvoCapoeira;
import models.paes.Pao;
import models.paes.PaoIntegral;
import models.presuntos.Presunto;
import models.presuntos.PresuntoPeru;
import models.queijos.Queijo;
import models.queijos.QueijoPrato;
import models.tomates.Tomate;
import models.tomates.TomateCereja;

public class SanduicheLight extends Sanduiche {
    private final String nome = "Sanduiche Light";

    private final Pao pao;
    private final Ovo ovo;
    private final Queijo queijo;
    private final Presunto presunto;
    private final Tomate tomate;

    public SanduicheLight() {
        this.pao = new PaoIntegral();
        this.ovo = new OvoCapoeira();
        this.presunto = new PresuntoPeru();
        this.queijo = new QueijoPrato();
        this.tomate = new TomateCereja();
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Ingrediente[] getIngredientes() {
        return new Ingrediente[]{pao, ovo, queijo, presunto, tomate};
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
