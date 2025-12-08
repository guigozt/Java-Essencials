
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código do lanche: ");
        int codigo = sc.nextInt();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        double total;

        switch (codigo) {
            case 1:
                total = 4.0 * quantidade; 
                break;
            case 2:
                total = 4.5 * quantidade;
                break;
            case 3:
                total = 5.0 * quantidade;
                break;
            case 4:
                total = 2.0 * quantidade;
                break;
            case 5:
                total = 1.5 * quantidade;
                break;
            default:
                throw new AssertionError();
        }

        System.out.printf("Total: R$ %.2f", total);
    }    
}
