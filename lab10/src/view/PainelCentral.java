package view;

import model.listener.CadeiraListener;
import model.source.CadeiraEvent;
import model.source.Cadeira;
import model.source.Onibus;
import controller.SistemaRodoviaria;

public class PainelCentral implements CadeiraListener {
    @Override
    public void mudancaNasCadeiras(CadeiraEvent event) {
        atualizarPainelCentral();
    }

    private void atualizarPainelCentral() {
        System.out.printf("\u001B[35m==================== Painel Central ====================\u001B[0m\n");
        for (Onibus onibus : SistemaRodoviaria.getFrota()) {
            System.out.printf("Onibus: %d, Destino: %s\n", onibus.getNumero(), onibus.getRota());
            System.out.print("[ ");
            for (Cadeira cadeira : onibus.getCadeiras()) {
                if (cadeira.getAcento() == Cadeira.Disponivel) 
                    System.out.print("\u001B[32mDisponível\u001B[0m, ");
                if (cadeira.getAcento() == Cadeira.Reservado)
                    System.out.print("\u001B[33mReservado\u001B[0m, ");
                if (cadeira.getAcento() == Cadeira.Indisponivel)
                    System.out.print("\u001B[31mIndisponível\u001B[0m, ");
            }
            System.out.println("]");
        }
        System.out.printf("\u001B[35m========================================================\u001B[0m\n");
    }

}
