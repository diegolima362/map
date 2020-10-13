package models;

public abstract class Sanduiche {
    public abstract String getNome();

    public abstract Ingrediente[] getIngredientes();

    public abstract void mostrarComponentes();
}
