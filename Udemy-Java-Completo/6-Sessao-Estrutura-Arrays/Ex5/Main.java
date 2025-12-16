import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        
        for (int i=0; i < vetor.length; i++){
            int valor = sc.nextInt();
            vetor[i] = valor;
        }

        for (int i=0; i < vetor.length; i++){
            if (vetor[i] <= 0){
                vetor[i] = 1;
            }
        }

        for (int i=0; i < vetor.length; i++){
            System.out.printf("X[%d] = %d\n", i, vetor[i]);
        }
    }
}