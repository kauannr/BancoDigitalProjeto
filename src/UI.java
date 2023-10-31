public class UI {
    // CRIAR A LIST

    protected static String ConfirmDeposito(Double valorDeposito) {
        return "Depósito de " + String.format("%.2f", valorDeposito) + " realizado!\n";
    }

    protected static String ConfirmTransferencia(Conta origem, Double valorTrans, Conta destino) {
        return "Transferência de " + origem.getNome() + " para " + destino.getNome() +
                " no valor de " + valorTrans + " realizada com sucesso\n";
    }

    protected static String ConfirmSaque(Double valorDeposito) {
        return "Saque de " + String.format("%.2f", valorDeposito) + " realizado!\n";
    }

}
