
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Valor: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        String res = (valor % 2 == 0) ? "PAR" : "IMPAR";

        System.out.println(res);
        sc.close();
    }
}
