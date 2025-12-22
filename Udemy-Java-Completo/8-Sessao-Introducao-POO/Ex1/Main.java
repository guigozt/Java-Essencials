
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Largura: ");
        double largura = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);
        retangulo.imprimeDados();

        sc.close();
    }
}