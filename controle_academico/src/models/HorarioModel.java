package models;

import java.util.HashMap;
import java.util.Map;

public class HorarioModel {
    private final String dia;
    private final String inicio;
    private final String fim;
    private final String local;

    public HorarioModel(String dia, String inicio, String fim, String local) {
        this.dia = dia;
        this.inicio = inicio;
        this.fim = fim;
        this.local = local;
    }

    public final static Map<String, Integer> weekDays = new HashMap<String, Integer>() {{
        put("Seg", 1);
        put("Ter", 2);
        put("Qua", 3);
        put("Qui", 4);
        put("Sex", 5);
    }};

    public String getDia() {
        return dia;
    }

    public String getInicio() {
        return inicio;
    }

    public String getFim() {
        return fim;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public String toString() {
        return dia + ", " + inicio + "-" + fim + ", " + local;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof HorarioModel)) {
            return false;
        }

        HorarioModel horario = (HorarioModel) o;
        return horario.dia.equals(this.dia) &&
                horario.inicio.equals(this.inicio) &&
                horario.fim.equals(this.fim) &&
                horario.local.equals(this.local);
    }


}
