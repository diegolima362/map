package almoxarifado;

public class Material {
    private String nome;
    private double valor;

    public Material(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValor() {
        return this.valor;
    }
}
