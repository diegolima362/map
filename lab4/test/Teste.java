package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import controller.GloboFilmes;
import model.Filme;
import model.Funcionario;

public class Teste {
    @Test
    public void testeCadastrarFilme() {
        GloboFilmes globoFilmes = new GloboFilmes();
        boolean cadastrado = false;
        globoFilmes.cadastrarFilme("Rocky", 1976, Map.ofEntries(
                    Map.entry("John G. Avildsen", new ArrayList<>(Arrays.asList("Diretor"))),
                    Map.entry("Sylvester Stallone", new ArrayList<>(Arrays.asList("Roteirista", "Ator"))),
                    Map.entry("Talia Shire", new ArrayList<>(Arrays.asList("Ator"))),
                    Map.entry("Carl Weathers", new ArrayList<>(Arrays.asList("Ator"))),
                    Map.entry("Garrett Brown", new ArrayList<>(Arrays.asList("Cinegrafista")))),
                new ArrayList<>(Arrays.asList("Take Me Back", "Gonna Fly Now", "Summer Madness")));
      
      for (Filme filme : globoFilmes.getFilmes()) {
          if (filme.getNome().equals("Rocky")) {
              cadastrado = true;
          }
      }

      assertTrue(cadastrado);
    }

    @Test
    public void testeCadastrarFuncionario() {
        Filme filme = new Filme("Rocky", 1976);
        boolean cadastrado = false;
        filme.cadastrarFuncionario("Paulo", new ArrayList<>(Arrays.asList("Diretor", "Roteirista", "Ato    r")));
        for (Funcionario funcionario : filme.getFuncionarios()) {
            if (funcionario.getNome().equals("Paulo")) {
                cadastrado = true;
            }
        }
        assertTrue(cadastrado);
    }
}
