package almoxarifado;

import java.util.ArrayList;

public class AlmoxarifadoFacade {
    private ArrayList<Material> estoque;

    public AlmoxarifadoFacade() {
        this.estoque = new ArrayList<>();
    }

    public void cadastrarMaterial(String nomeDoMaterial, double valorDoMaterial) {
        Material material = new Material(nomeDoMaterial, valorDoMaterial);
        this.estoque.add(material);
    }

    public void mostrarEstoque() {
        for (Material material : estoque) {
            System.out.println(material);
        }
    }

    public void comprarMaterial(String nomeDoMaterial, double valorDoMaterial) {
        cadastrarMaterial(nomeDoMaterial, valorDoMaterial);
    }

}
