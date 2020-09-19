package infraEstrutura;

import java.util.ArrayList;

public class InfraEstruturaFacade {
    public ArrayList<Sala> salas;

    public InfraEstruturaFacade() {
        this.salas = new ArrayList<>();
    }

    public void cadastrarSala(int numero, String bloco, boolean disponivel) {
        Sala novaSala= new Sala(numero, bloco, disponivel);
        this.salas.add(novaSala);
    }

    public void mostrarSalasDisponiveis() {
        for (Sala sala : salas) {
            if (sala.getDisponivel()) {
                System.out.println(sala);
            }
        }
    }

    public void reservarSala(String professor, int numero, String bloco) {
        for (Sala sala : salas) {
            if (sala.getNumero() == numero && sala.getBloco().equals(bloco)) {
                sala.setProfessor(professor);
                sala.setDisponivel(false);
            }
        }
    }
}
