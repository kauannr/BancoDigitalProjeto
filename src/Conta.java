
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exceptions.ContaException;

public abstract class Conta {
    protected Integer agencia;
    protected Integer numero_conta;
    protected Double saldo;
    private static final Integer AGENCIA_PADRAO = 1;
    private static Integer n_conta_sequencial = 1;
    protected static final Double TAXA_DE_ABERTURA = -19.85;

    // Cliente:
    protected String nome;
    protected String cpf;
    protected String nascimento;
    protected Integer rg;
    protected Date dataTransacao;
    protected List<String> listExtrato = new ArrayList<>();

    public Conta(String nome, String cpf, String nascimento, Integer rg) {
        this.agencia = AGENCIA_PADRAO;
        this.numero_conta = n_conta_sequencial++;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.rg = rg;
    }

    public void Cliente(String nome, String cpf, String nascimento, Integer rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.rg = rg;
    }

    public void Sacar(double valorSaque) {
        if (saldo >= valorSaque) {
            saldo = saldo - valorSaque;
            String s = UI.ConfirmSaque(valorSaque);
            listExtrato.add(s);
        } else {
            throw new ContaException("Você não tem este valor para sacar.");
        }
    }

    public void Depositar(double valorDeposito) {
        if (valorDeposito >= 0d) {
            this.saldo = saldo + valorDeposito;
            String s = UI.ConfirmDeposito(valorDeposito);
            listExtrato.add(s);

        } else {
            throw new ContaException("valor não permitido");
        }

    }

    public void Tranferir(Double valorTrans, Conta destino) {

        if (getSaldo() >= valorTrans) {
            setSaldo(saldo - valorTrans);
            dataTransacao = new Date();
            destino.setSaldo(saldo + valorTrans);
            UI.ConfirmTransferencia(this, valorTrans, destino);
            String s = UI.ConfirmTransferencia(this, valorTrans, destino);
            listExtrato.add(s);

        } else {
            throw new ContaException("Você não tem esse valor para transferir");
        }

    }

    public void Extrato() {
        System.out.println("--Extrato da conta--\n" + listExtrato);
    }

    public double getSaldo() {
        return saldo;
    }

    public static Double getTaxaDeAbertura() {
        return TAXA_DE_ABERTURA;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero_conta() {
        return numero_conta;
    }

    public String getNome() {
        return nome;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public void setNumero_conta(Integer numero_conta) {
        this.numero_conta = numero_conta;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static Integer getAgenciaPadrao() {
        return AGENCIA_PADRAO;
    }

    public static Integer getN_conta_sequencial() {
        return n_conta_sequencial;
    }

    private static void setN_conta_sequencial(Integer n_conta_sequencial) {
        Conta.n_conta_sequencial = n_conta_sequencial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

}
