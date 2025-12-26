import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dolar atualmente?: ");
        double precoDolar = sc.nextDouble();

        System.out.print("Quantos doláres você deseja comprar?: ");
        double quantidadeDolar = sc.nextDouble();
        
        double valorConvertido = ConversorMoeda.converterValor(precoDolar, quantidadeDolar);
        double totalConvertido = ConversorMoeda.totalConvertido(valorConvertido);

        System.out.printf("O valor a pagar é de: R$ %.2f", totalConvertido);

        sc.close();
    }  
}
