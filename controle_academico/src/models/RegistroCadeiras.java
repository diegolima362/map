package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class RegistroCadeiras {
    public RegistroCadeiras() {
        turmas = new ArrayList<>();
    }

    private final ArrayList<TurmaModel> turmas;

    public void addTurma(TurmaModel turma) {
        this.turmas.add(turma);
    }

    public ArrayList<String> getHorario() {
        ArrayList<String> horario = new ArrayList<>();

        turmas.forEach(turma -> Arrays.stream(turma.getHorario())
                .map(horarioModel -> horarioModel + ", " + turma.getCadeira().getNome())
                .forEach(horario::add));

        horario.sort(Comparator
                .comparingInt((String dia) -> HorarioModel.weekDays.get(dia.split(",")[0]))
                .thenComparing(hora -> hora.split("-")[0].split(", ")[1]));

        return horario;
    }

    public ArrayList<TurmaModel> getAllTurmas() {
        return turmas;
    }

    public int getTotalTurmas() {
        return turmas.size();
    }

    public void removeTurma(TurmaModel turma) {
        turmas.remove(turma);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof RegistroCadeiras)) {
            return false;
        }

        RegistroCadeiras registro = (RegistroCadeiras) o;
        return registro.turmas.equals(this.turmas);
    }
}
