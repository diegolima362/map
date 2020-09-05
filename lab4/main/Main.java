package main;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Filme;
import controller.GloboFilmes;

public class Main {
    public static void main(String[] args) {
        GloboFilmes  globoFilmes = new GloboFilmes();
        
        globoFilmes.cadastrarFilme("Rocky II", 1979, Map.ofEntries(
                Map.entry("Sylvester Stallone", new ArrayList<>(Arrays.asList("Diretor", "Roteirista", "Ator"))),
                Map.entry("Talia Shire", new ArrayList<>(Arrays.asList("Ator"))),
                Map.entry("Carl Weathers", new ArrayList<>(Arrays.asList("Ator"))),
                Map.entry("Martin G. Beazell", new ArrayList<>(Arrays.asList("Cinegrafista")))),
                new ArrayList<>(Arrays.asList("Street Scat", "Two Kinds of Love", "Gonna Fly Now")));


        globoFilmes.cadastrarFilme("Rocky", 1976, Map.ofEntries(
                    Map.entry("John G. Avildsen", new ArrayList<>(Arrays.asList("Diretor"))),
                    Map.entry("Sylvester Stallone", new ArrayList<>(Arrays.asList("Roteirista", "Ator"))),
                    Map.entry("Talia Shire", new ArrayList<>(Arrays.asList("Ator"))),
                    Map.entry("Carl Weathers", new ArrayList<>(Arrays.asList("Ator"))),
                    Map.entry("Garrett Brown", new ArrayList<>(Arrays.asList("Cinegrafista")))),
                    new ArrayList<>(Arrays.asList("Take Me Back", "Gonna Fly Now", "Summer Madness")));

        globoFilmes.mostrarInformacoesFilme("Rocky II");
        globoFilmes.mostrarInformacoesFilme("Rocky");

        globoFilmes.mostrarFilmografia("Sylvester Stallone", "Ator");
    }
}
