package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Professor {
    private int id;
    private String nome;
    private final ArrayList<Cadeira> cadeiras;


    public Professor(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.cadeiras = new ArrayList<Cadeira>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cadeira[] getCadeiras() {
        return cadeiras.toArray(new Cadeira[0]);
    }

    public void addCadeira(Cadeira cadeira) {
        this.cadeiras.add(cadeira);
    }

    public String getHorario() {
        StringBuilder str = new StringBuilder();
        str.append("\n");
        for (Cadeira c : cadeiras) {
            str.append(c.getNome()).append(" ").append(Arrays.toString(c.getHorario())).append("\n");
        }
        return str.toString();
    }

    public int getTotalCadeiras() {
        return cadeiras.size();
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }


}
