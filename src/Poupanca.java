
public class Poupanca extends Conta {

    public Poupanca(String nome, String cpf, String nascimento, Integer rg) {
        super(nome, cpf, nascimento, rg);
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

        return "Conta Poupança" + super.numero_conta;
    }

    @Override
    public String getNome() {

        return super.getNome();
    }

}
