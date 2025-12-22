import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        Estudante estudante = new Estudante(nome, nota1, nota2, nota3);
        estudante.calcularMedia();
        estudante.situacaoFinal();

        sc.close();
    }
}
