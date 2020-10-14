package models.sanduiches;

import models.Ingrediente;

public interface Sanduiche {
    public String getNome();

    public Ingrediente[] getIngredientes();

    public void mostrarComponentes();
}
