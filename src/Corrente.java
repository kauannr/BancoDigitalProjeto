
public class Corrente extends Conta {
    private static final Double TAXA_DE_ABERTURA = -19.85;

    public Corrente(String nome, String cpf, String nascimento, Integer rg) {
        super(nome, cpf, nascimento, rg);
        this.saldo = TAXA_DE_ABERTURA;
    }

    @Override
    public void Depositar(double valorDeposito) {
        super.Depositar(valorDeposito);
    }

    @Override
    public Integer getAgencia() {
        return super.getAgencia();
    }

    @Override
    public Integer getNumero_conta() {
        return super.getNumero_conta();
    }

    public static Double getTAXA_DE_ABERTURA() {
        return TAXA_DE_ABERTURA;
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void Sacar(double valorSaque) {
        super.Sacar(valorSaque);
    }

    @Override
    public void Tranferir(Double valorTrans, Conta destino) {
        super.Tranferir(valorTrans, destino);
    }

    @Override
    public String toString() {
        return "Conta Corrente" + super.numero_conta;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

}
