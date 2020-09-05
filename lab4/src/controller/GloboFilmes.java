package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Filme;
import model.Funcionario;

public class GloboFilmes {
    private ArrayList<Filme> filmes;

    public GloboFilmes() {
        this.filmes = new ArrayList<Filme>();
    }

    public void cadastrarFilme(String nome, int ano, Map<String, ArrayList<String>> funcionarios,
            ArrayList<String> trilhaSonora) {

        Filme novoFilme = new Filme(nome, ano);
        for (Map.Entry<String, ArrayList<String>> campo : funcionarios.entrySet()) {
            novoFilme.cadastrarFuncionario(
                    campo.getKey(),
                    campo.getValue());
        }
        novoFilme.setTrilhaSonora(trilhaSonora);
        filmes.add(novoFilme);
    }
    
    public void mostrarFilmografia(String nome, String funcao) {
        for (Filme filme : filmes) {
            for (Funcionario funcionario : filme.getFuncionarios()) {
                if (nome.equals(funcionario.getNome())) {
                    for (String func : funcionario.getFuncoes()) {
                        if (func.equals(funcao)) {
                            System.out.printf("Filme: %s, %s: %s\n", filme.getNome(), funcao, nome);
                        }
                    }
                }
            }
        }
    }

    public void mostrarInformacoesFilme(String nome) {
        for (Filme filme : filmes) {
            if (filme.getNome().equals(nome)) {
                System.out.println(filme);
            }
        }
    }
}


    
