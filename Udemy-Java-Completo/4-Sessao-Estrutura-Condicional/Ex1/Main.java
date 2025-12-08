import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        int valor = sc.nextInt();

        String res = (valor < 0) ? "NEGATIVO" : "NAO NEGATIVO";

        System.out.println(res);
        sc.close();
    }
}