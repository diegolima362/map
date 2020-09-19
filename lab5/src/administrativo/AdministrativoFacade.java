package administrativo;

import java.time.LocalDate;

public class AdministrativoFacade {
    private Agenda agenda;

    public AdministrativoFacade() {
        this.agenda = new Agenda();
    }

    public void agendarReuniaoDaDiretoria(LocalDate dataDaReuniao) {
        this.agenda.agendarReuniao(dataDaReuniao);
    }

    public void agendarEntrevistaDaDiretoria(LocalDate dataDaEntrevista) {
        this.agenda.agendarEntrevista(dataDaEntrevista);
    }

    public void reunioesAgendadasDiretoria() {
        this.agenda.mostrarReunioesDiretoria();
    }

    public void entrevistasAgendadasDiretoria() {
        this.agenda.mostrarEntrevistasDiretoria();
    }
}
