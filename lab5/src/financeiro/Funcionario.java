package financeiro;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }
    public double getSalario() {
       return this.salario;
    }
    @Override                                                                                                            public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof Funcionario)) {
            return false;
        }

        Funcionario outroFuncionario = (Funcionario)obj;
        return this.nome != null && this.nome.equals(outroFuncionario.getNome());
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
