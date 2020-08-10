package models;

public class Horario {
    private final String dia;
    private final String inicio;
    private final String fim;
    private final String local;

    public Horario(String dia, String inicio, String fim, String local) {
        this.dia = dia;
        this.inicio = inicio;
        this.fim = fim;
        this.local = local;
    }

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
        return dia + " " + inicio + " : " + fim + " " + local;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Horario)) {
            return false;
        }

        Horario horario = (Horario) o;
        return horario.dia.equals(this.dia) &&
                horario.inicio.equals(this.inicio) &&
                horario.fim.equals(this.fim) &&
                horario.local.equals(this.local);
    }


}
