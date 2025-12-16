import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vetor[] = new double[100];

        double valor = sc.nextDouble();
        vetor[0] = valor;

        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = (vetor[i - 1]) / 2.0;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, vetor[i]);
        }
    }    
}
