package financeiro;

import java.util.ArrayList;

public class FinanceiroFacade {
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Divida> dividasEmGeral;
    
    public FinanceiroFacade() {
        this.funcionarios = new ArrayList<>();
        this.dividasEmGeral = new ArrayList<>();
    }

    public ArrayList<Divida> getDividas() {
        return this.dividasEmGeral;
    }
    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
    public void cadastrarDivida(String nome, double debito, double credito) {
        Divida novaDivida = new Divida(nome, debito, credito);
        this.dividasEmGeral.add(novaDivida);
    }

    public void cadastrarFuncionario(String nome, double salario) {
        Funcionario novoFuncionario = new Funcionario(nome, salario);
        this.funcionarios.add(novoFuncionario);
    }

    public void mostrarBalanco() {
        for (Divida divida : dividasEmGeral) {
            System.out.println(divida);
        }
    }

    public void mostrarFolhaDePagamentos() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

}
