import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Testes: ");
        int testes = sc.nextInt();

        for (int i = 0; i < testes; i++) {
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = sc.nextDouble();

            double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
            System.out.printf("%.1f%n", media);
        }
    }    
}
