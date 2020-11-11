package controller;

import java.util.List;
import java.util.ArrayList;

import model.source.Onibus;
import model.source.Cadeira;
import view.PainelCentral;
import view.Quiosque;
import view.Guiche;

public class SistemaRodoviaria {
    private static List<Onibus> frota;
    private static List<Quiosque> quiosques;
    private PainelCentral painelCentral;
    private Guiche guiche;

    public SistemaRodoviaria() {
        this.frota = new ArrayList<Onibus>();
        this.quiosques = new ArrayList<Quiosque>();
        this.painelCentral = new PainelCentral();
        this.guiche = new Guiche();

        for (int i = 0; i < 3; i++) {
            this.quiosques.add(new Quiosque());
        }
    }

    public static List<Onibus> getFrota() {
        return frota;
    }

    public static List<Quiosque> getQuiosques() {
        return quiosques;
    }

    public void adicionarOnibus(String rota, int numeroCadeiras) {
        Onibus novoOnibus = new Onibus(this.frota.size() + 1, rota, numeroCadeiras);
        for (Cadeira cadeira : novoOnibus.getCadeiras()) {
            for (Quiosque quiosque : this.quiosques) {
                cadeira.addCadeiraListener(quiosque);
            }
            cadeira.addCadeiraListener(painelCentral);
        }
        this.frota.add(novoOnibus);
    }

    public static boolean aCadeiraDisponivel(String rota) {
        for (Onibus onibus : frota) {
            if (onibus.getRota().equals(rota)) {
                for (Cadeira cadeira : onibus.getCadeiras()) {
                    if (cadeira.getAcento() == Cadeira.Disponivel) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void alterarEstadoCadeiraPrimeiroDisponivel(int estado, String rota) {
        for (Onibus onibus : frota) {
            if (onibus.getRota().equals(rota)) {
                for (Cadeira cadeira : onibus.getCadeiras()) {
                    if (cadeira.getAcento() == Cadeira.Disponivel) {
                        cadeira.setAcento(estado);
                        return;
                    }
                }
            }
        }
    }

    public void mostrarGuiche() {
        this.guiche.mostrarPainelControle();
    }
}
