
import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.ContaException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Conta conta = new Corrente("Kauan", "70912606436", "04/03/2002", 4268424);

        Conta conta2 = new Corrente("Jose", "70912606436", "04/03/2002", 4268424);
        Conta conta3 = new Corrente("Maria", "70912606436", "04/03/2002", 4268424);

        System.out.println("Saldo: " + conta.getSaldo());

        System.out.print("Deseja fazer um deposito inicial? (s/n): ");
        String resp = sc.nextLine();

        if (resp.equalsIgnoreCase("s")) {
            try {
                System.out.print("Digite o valor: ");
                Double valor = sc.nextDouble();
                sc.nextLine();
                conta.Depositar(valor);

                System.out.println(conta.getSaldo());

                conta.Tranferir(10d, conta3);
                conta.Tranferir(20d, conta2);

                conta2.Sacar(10d);

                System.out.println(conta.getSaldo());

                conta.Extrato();
                conta2.Extrato();

            } catch (InputMismatchException e) {
                System.out.println("Digite numeros");
                sc.nextLine();
            } catch (ContaException e) {
                System.out.println("Erro. " + e.getMessage());
                sc.nextLine();
            }

        }
        sc.close();
    }
}
