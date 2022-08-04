public class App {
    public static void main(String[] args) throws Exception {

    Conta contac1 = new Corrente();
    Corrente contac2 = new Corrente();
    
    contac1.depositar(100);
    System.out.println(contac1.getSaldo());
    
    
    
    contac1.tranferir(100, contac2);
    contac2.Extrato();
    contac1.Extrato();
        
    
    
    }
}
