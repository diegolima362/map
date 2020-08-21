package exceptions;

public class ExceptionValorNegativo extends Exception {
    public ExceptionValorNegativo() {
        super("Valor invalido", new Throwable("valor < 0"));
    }
}
