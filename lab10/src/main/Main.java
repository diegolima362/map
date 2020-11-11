package main;

import controller.SistemaRodoviaria;

public class Main {
    public static void main(String[] args) {
        SistemaRodoviaria sistemaRodoviaria = new SistemaRodoviaria();
        sistemaRodoviaria.adicionarOnibus("Campina Grande - João Pessoa", 5);
        sistemaRodoviaria.adicionarOnibus("Campina Grande - Recife", 5);
        sistemaRodoviaria.adicionarOnibus("Campina Grande - Salvador", 5);

        sistemaRodoviaria.mostrarGuiche();
    }
}
