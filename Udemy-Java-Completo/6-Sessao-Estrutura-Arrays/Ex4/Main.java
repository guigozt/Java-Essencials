import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[20];

        for (int i = 0; i < vetor.length; i++){
            int valor = sc.nextInt();
            vetor[i] = valor;
        }

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim){
            int aux = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = aux;
            
            inicio++;
            fim --;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
    }    
}
