
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] mat = new double[12][12];

        char operacao = sc.next().toLowerCase().charAt(0);

        //Preencher matriz
        for (int linha = 0; linha < mat.length; linha++){
            for (int coluna = 0; coluna < mat[linha].length; coluna++){
                mat[linha][coluna] = sc.nextDouble();
            }
        }

        double soma = 0.0;
        int quantidade = 0;

        for (int linha = 7; linha < mat.length; linha++){
            for (int coluna = 12 - linha; coluna < linha; coluna++){
                soma += mat[linha][coluna];
                quantidade++;
            }
        }
        
        if (operacao == 's'){
            System.out.printf("%.1f\n", soma);
        }
        else{
            double media = soma / quantidade;
            System.out.printf("%.1f\n", media);
        }
    }    
}
