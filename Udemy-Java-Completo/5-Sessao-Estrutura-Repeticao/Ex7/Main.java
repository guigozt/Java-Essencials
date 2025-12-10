import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Testes: ");
        int testes = sc.nextInt();

        for (int i = 0; i < testes; i++) {
            System.out.print("Número 1: ");
            int num1 = sc.nextInt();
            System.out.print("Número 2: ");
            int num2 = sc.nextInt();

            if (num2 == 0){
                System.out.println("divisão impossivel");
            }
            else{
                double resultado = (double) num1 / num2;
                System.out.println(resultado);
            }
        }

        sc.close();
    }    
}
