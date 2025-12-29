import java.util.Scanner;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double valorConta;

    public ContaBancaria(int numConta, String nmTitular, double vlrConta) {
        this.numeroConta = numConta;
        this.nomeTitular = nmTitular;
        this.valorConta = vlrConta;
    }

    public void imprimirDados(){
        System.out.println("\nDADOS DA CONTA");
        System.out.println("--------------");

        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome: " + nomeTitular);
        System.out.printf("Valor na Conta: R$ %.2f", valorConta);
        System.out.println();
    }

    public void depositoValor(Scanner sc){
        System.out.print("\nQuanto deseja Depositar? (R$): ");
        double vlrDeposito = sc.nextDouble();
        
        if (vlrDeposito > 0){
            this.valorConta += vlrDeposito;
            System.out.println("Valor de R$ " + vlrDeposito + " depositado com sucesso!");
            System.out.println();
        }
        else{
            System.out.println("Valor inválido ou insuficente para realizar depósito...");
            System.out.println();
        }
    }

    public void sacarValor(Scanner sc){
        System.out.print("\nQuanto deseja Sacar? (R$): ");
        double vlrSaque = sc.nextDouble();

        if (vlrSaque > valorConta || vlrSaque <= 0){
            System.out.println("Valor inválido ou insuficente para realizar o saque...");
            System.out.println();
        }
        else{
            this.valorConta -= vlrSaque;
            System.out.println("Valor de R$ " + vlrSaque + " sacado com sucesso!");
            System.out.println();
        }
    }
}
