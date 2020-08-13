package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RegistroCadeiras {
    private final ArrayList<TurmaModel> turmas;

    public RegistroCadeiras() {
        turmas = new ArrayList<>();
    }

    public void addTurma(TurmaModel turma) {
        this.turmas.add(turma);
    }

    public ArrayList<HorarioModel> getHorario() {
        return turmas.stream().flatMap(turma -> Arrays.stream(turma.getHorario())).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<TurmaModel> getTurmasMatriculado() {
        return turmas;
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
