package models;

public class CadeiraModel {
    private final int id;
    private String nome;

    public CadeiraModel(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Nome: " + nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CadeiraModel)) {
            return false;
        }

        CadeiraModel cadeira = (CadeiraModel) o;
        return cadeira.nome.equals(this.nome) && cadeira.id == this.id;
    }
}
