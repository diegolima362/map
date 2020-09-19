package financeiro;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("Nome: ")
            .append(this.nome)
            .append(String.format(", Salário: %.2f", this.salario))
            .toString();
    }
}
