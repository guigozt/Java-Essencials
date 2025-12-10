import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 2002;

        System.out.print("Senha: ");
        int senhaUser = sc.nextInt();

        while (senhaUser != senha){
            System.out.println("Senha Invalida");
            System.out.print("Senha: ");
            senhaUser = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }    
}
