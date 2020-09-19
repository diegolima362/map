package sig;

import administrativo.AdministrativoFacade;
import financeiro.FinanceiroFacade;
import professor.ProfessorFacade;
import aluno.AlunoFacade;
import almoxarifado.AlmoxarifadoFacade;
import infraEstrutura.InfraEstruturaFacade;


public class SIG {

    final private FinanceiroFacade financeiro;
    final private AdministrativoFacade administrativo;
    final private ProfessorFacade professor;
    final private AlunoFacade aluno;
    final private AlmoxarifadoFacade almoxarifado;
    final private InfraEstruturaFacade infraEstrutura;

    public SIG() {
        this.financeiro = new FinanceiroFacade();
        this.administrativo = new AdministrativoFacade();
        this.professor = new ProfessorFacade();
        this.aluno = new AlunoFacade();
        this.almoxarifado = new AlmoxarifadoFacade();
        this.infraEstrutura = new InfraEstruturaFacade();
    }

    public FinanceiroFacade getFinanceiro() {
        return this.financeiro;
    }

    public AdministrativoFacade getAdministrativo() {
        return this.administrativo;
    }

    public ProfessorFacade getProfessor() {
        return this.professor;
    }

    public AlunoFacade getAluno() {
        return this.aluno;
    }

    public AlmoxarifadoFacade getAlmoxarifado() {
        return this.almoxarifado;
    }

    public InfraEstruturaFacade getInfraEstrutura() {
        return this.infraEstrutura;
    }
}
