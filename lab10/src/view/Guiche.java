package view;

import java.util.Scanner;

import controller.SistemaRodoviaria;
import model.source.Cadeira;

public class Guiche {
    public void comprarPassagem(String rota) {
        if (!SistemaRodoviaria.aCadeiraDisponivel(rota)) {
            System.out.println("Sem lugares dispoíveis para esse destino");
            return;
        }
        SistemaRodoviaria.alterarEstadoCadeiraPrimeiroDisponivel(Cadeira.Indisponivel, rota);
    }

    public void reservarPassagem(String rota) {
        if (!SistemaRodoviaria.aCadeiraDisponivel(rota)) {
            System.out.println("Sem lugares dispoíveis para esse destino");
            return;
        }
        SistemaRodoviaria.alterarEstadoCadeiraPrimeiroDisponivel(Cadeira.Reservado, rota);
    }
    
    public void mostrarPainelControle() {
        Scanner sc = new Scanner(System.in);
        String destino;

        while (true) {
            System.out.println("1 - Compra passagem");
            System.out.println("2 - Reservar passagem");
            System.out.println("3 - Fachar sistema");
            System.out.println("");
            System.out.print("Digite sua escolha: ");
            int escolha = Integer.parseInt(sc.nextLine());

            if (escolha == 3) {
                sc.close();
                break;
            }

            switch (escolha) {
                case 1: 
                    System.out.print("Destino: ");
                    destino = sc.nextLine();
                    comprarPassagem(destino);
                    break;
                case 2:
                    System.out.print("Destino: ");
                    destino = sc.nextLine();
                    reservarPassagem(destino);
                    break;
            }
        }
    }
}

