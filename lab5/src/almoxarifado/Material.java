package almoxarifado;

public class Material {
    private String nome;
    private double valor;

    public Material(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("Nome: ")
            .append(this.nome)
            .append(", Preço: ")
            .append(this.valor)
            .toString();
    }
}
