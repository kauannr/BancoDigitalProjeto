public class Corrente extends Conta{




    @Override
    public void Cliente(String nome, String cpf, String nascimento, int rg) {
        // TODO Auto-generated method stub
        super.Cliente(nome, cpf, nascimento, rg);
    }

    @Override
    public void depositar(double valorDeposito) {
        // TODO Auto-generated method stub
        super.depositar(valorDeposito);
    }

    @Override
    public int getAgencia() {
        // TODO Auto-generated method stub
        return super.getAgencia();
    }

    @Override
    public int getNumero_conta() {
        // TODO Auto-generated method stub
        return super.getNumero_conta();
    }

    @Override
    public double getSaldo() {
        // TODO Auto-generated method stub
        return super.getSaldo();
    }

    @Override
    public void sacar(double valorSaque) {
        // TODO Auto-generated method stub
        super.sacar(valorSaque);
    }

    @Override
    public void tranferir(double valorTrans, Conta conta) {
        // TODO Auto-generated method stub
        super.tranferir(valorTrans, conta);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Conta Corrente" + super.numero_conta;
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

}
