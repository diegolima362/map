package financeiro;

public class Divida {
    private String nome;
    private double debito;
    private double credito;

    public Divida(String nome, double debito, double credito) {
        this.nome = nome;
        this.debito = debito;
        this.credito = credito;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("Conta: ")
            .append(this.nome)
            .append(", Débito: ")
            .append(this.debito)
            .append(", Crédito: ")
            .append(this.credito)
            .toString();
    }

}
