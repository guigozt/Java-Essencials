import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantIn = 0;
        int quantOut = 0;

        System.out.print("Quantidade da sequencia: ");
        int sequencia = sc.nextInt();

        for (int i = 0; i < sequencia; i++) {
            System.out.print("Valor: ");
            int valor = sc.nextInt();

            if (valor >= 10 && valor <= 20){
                quantIn++;
            }
            else{
                quantOut++;
            }
        }

        System.out.println(quantIn + " in");
        System.out.println(quantOut + " out");

        sc.close();
    }    
}
