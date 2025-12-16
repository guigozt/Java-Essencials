import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[1000];

        int valor = sc.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i % valor;

            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
    }    
}
