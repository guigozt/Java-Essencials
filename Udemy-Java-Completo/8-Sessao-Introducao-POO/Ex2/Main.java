import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Salário Bruto (R$): ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Impostos (R$): ");
        double impostos = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, impostos);
        funcionario.imprimirDados();

        System.out.print("Quanto você quer acrescentar ao salário desse funcionario? (%): ");
        double porcento = sc.nextDouble();
        funcionario.aumentarSalario(porcento);

        funcionario.imprimirDados();
        
        sc.close();
    }
}