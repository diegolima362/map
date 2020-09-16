package sig;

import sig.administrativo.Administratitivo;
import sig.financeiro.Financeiro;

public class SIG {
    final private Financeiro financeiro;
    final private Administratitivo administratitivo;

    public SIG() {
        this.financeiro = new Financeiro();
        this.administratitivo = new Administratitivo();
    }

    public Financeiro getFinanceiro() {
        return financeiro;
    }

    public Administratitivo getAdministratitivo() {
        return administratitivo;
    }
}
