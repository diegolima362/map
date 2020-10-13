package models.sanduiches;

import models.Ingrediente;
import models.Sanduiche;
import models.ovos.Ovo;
import models.ovos.OvoGranja;
import models.paes.Pao;
import models.paes.PaoBola;
import models.presuntos.Presunto;
import models.presuntos.PresuntoFrango;
import models.queijos.Queijo;
import models.queijos.QueijoCheddar;
import models.queijos.QueijoMussarela;
import models.tomates.Tomate;
import models.tomates.TomateCaqui;

public class SanduicheEspecial extends Sanduiche {
    private final String nome = "Sanduiche Especial";

    private final Pao pao;
    private final Ovo ovo;
    private final Queijo queijo;
    private final Queijo queijoDuplo;
    private final Presunto presunto;
    private final Tomate tomate;

    public SanduicheEspecial() {
        this.pao = new PaoBola();
        this.ovo = new OvoGranja();
        this.presunto = new PresuntoFrango();
        this.queijo = new QueijoCheddar();
        this.queijoDuplo = new QueijoMussarela();
        this.tomate = new TomateCaqui();
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Ingrediente[] getIngredientes() {
        return new Ingrediente[]{pao, ovo, queijo, queijoDuplo, presunto, tomate};
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
