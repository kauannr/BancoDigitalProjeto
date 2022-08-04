import java.util.Scanner;

public abstract class Conta {
    protected int agencia;
    protected int numero_conta;
    protected double saldo;
    private static final int AGENCIA_PADRAO = 1;
    private static int n_conta_sequencial = 1;
    //Cliente:
    protected String nome;
    protected String cpf;
    protected String nascimento;
    protected int rg;
    Scanner scanner = new Scanner(System.in);
    
        public Conta(){
            
            this.agencia = AGENCIA_PADRAO;
            this.numero_conta = n_conta_sequencial++;
            System.out.print("Nome: " ); this.nome = scanner.nextLine();
            System.out.print("CPF: "); this.cpf = scanner.nextLine();
            System.out.print("Data de nascimento "); this.nascimento = scanner.nextLine();
            System.out.print("RG "); this.rg = scanner.nextInt();
            System.out.println();
        }

    public void Cliente(String nome, String cpf, String nascimento, int rg){
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.rg = rg;
    }    
    
    public int getAgencia() {
        return agencia;
    }
    
    public int getNumero_conta() {
        return numero_conta;
    }
    public String getNome(){
        return nome;
    }

        public void sacar(double valorSaque){
            if(saldo>=valorSaque){
                saldo = saldo - valorSaque;
            }else{
                System.out.println("Você não tem este valor para sacar.");
            }
        }

        public void depositar(double valorDeposito){
            if(valorDeposito<0){
                System.out.println("Não permitido valores negativos");
            }
            else{
                saldo = saldo + valorDeposito;
            }
        }
        
        public void tranferir(double valorTrans, Conta conta){
            if(saldo>=valorTrans){
                this.sacar(valorTrans);
                conta.depositar(valorTrans);
                System.out.println("Tranferência de " + this.nome + " para a conta " + conta.getNome() + " realizada." + 
                " Valor: " + valorTrans);
            }else{
                System.out.println("Você não tem este valor para transferir");
            }
           
        }
        public double getSaldo() {
            if(saldo<0){
                System.out.println("Dívida com o banco");
            }
            return saldo;
        }
        public void Extrato(){
            System.out.println("===Extrato===");
            System.out.println("Cliente " + getNome());
            System.out.println("Conta: " + getNumero_conta());
            System.out.println("Agência: " + getAgencia());
            System.out.println("Saldo da conta: " + getSaldo());
            
            
        }
}
