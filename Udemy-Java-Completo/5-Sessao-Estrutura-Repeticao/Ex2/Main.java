
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de X: ");
        int x = sc.nextInt();
        System.out.print("Valor de Y: ");
        int y = sc.nextInt();
        
        while(x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");
            }
            else{
                System.out.println("quarto");
            }
            
            System.out.print("Valor de X: ");
            x = sc.nextInt();
            System.out.print("Valor de Y: ");
            y = sc.nextInt();
        }

        sc.close();
    }    
}
