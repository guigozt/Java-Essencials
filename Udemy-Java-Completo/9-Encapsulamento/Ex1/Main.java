import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria contaBancaria = menuCriarConta(sc);

        menuConta(sc, contaBancaria);
        
        sc.close();
    }

    public static ContaBancaria menuCriarConta(Scanner sc){
        System.out.print("Número da Conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Nome do Titular: ");
        String nomeTitular = sc.next().strip();
        System.out.print("Quer fazer um depósito inicial? (S/N): ");
        char opcaoDeposito = sc.next().toLowerCase().charAt(0);
        double valorInicial = 0.0;

        if (opcaoDeposito == 's') {
            System.out.print("Valor do depósito inicial (R$):");
            valorInicial = sc.nextDouble();
        }

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, valorInicial);
        return conta;
    }

    public static void menuConta(Scanner sc, ContaBancaria conta){
        boolean controleMenu = true;
        
        do {
            System.out.println("\nMENU DE MOVIMENTAÇÕES");
            System.out.println("---------------------");

            System.out.println("[1] para Depositar");
            System.out.println("[2] para Sacar");
            System.out.println("[3] Informações da Conta");
            System.out.println("[4] para Sair");
            System.out.print("Informe sua opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.depositoValor(sc);
                    break;
                case 2:
                    conta.sacarValor(sc);
                    break;
                case 3:
                    conta.imprimirDados();
                    break;
                case 4:
                    controleMenu = opcaoSair();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente...");
                    break;
            }
        } while (controleMenu);
    }

    public static boolean opcaoSair(){
        System.out.println("\nMuito obrigado por utilizar");
        System.out.println("Saindo...");
        return false;
    }
}