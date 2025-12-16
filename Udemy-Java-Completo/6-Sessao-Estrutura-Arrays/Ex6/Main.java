import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();

        int vetor[] = new int[tamanho];
        
        for (int i=0; i < vetor.length; i++){
            int valor = sc.nextInt();
            vetor[i] = valor;
        }

        int menor = vetor[0];
        int posicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor){
                menor = vetor[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " +  posicao);
    }
}
