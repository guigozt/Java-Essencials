
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de A: ");
        int A = sc.nextInt();
        System.out.print("Valor de B: ");
        int B = sc.nextInt();
        
        if (B > A){
            int aux = B;
            A = B;
            B = aux;
        }

        if (A % B == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
        
        sc.close();
    }    
}
