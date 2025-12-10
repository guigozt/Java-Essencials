
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char opcao;

        do { 
            System.out.print("Digite a temperatura em Celcius: ");
            double cel = sc.nextDouble();
            double fa = 9.0 * cel / 5.0 + 32.0;
            System.out.printf("É equivalente em Fahrenheit: %.1f", fa);

            System.out.println("Quer testar novamente? (S/N): ");
            opcao = sc.next().charAt(0);
        } while (opcao != 'n');

        sc.close();
    }    
}
