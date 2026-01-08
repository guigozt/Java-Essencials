
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hospede[] quartos = new Hospede[10];

        System.out.print("Quantos quartos serão alugados? (10 disponíveis): ");
        int qtdQuartos = sc.nextInt();

        sc.nextLine();

        for (int i = 1; i <= qtdQuartos; i++) {
            System.out.println("\nAluguel #" + i);
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Número do Quarto: ");
            int numeroQuarto = sc.nextInt();

            Hospede novoHospede = new Hospede(nome, email);
            quartos[numeroQuarto] = novoHospede;

            sc.nextLine();
        }

        System.out.println("\nINFORMAÇÕES DOS QUARTOS");
        System.out.println("------------------------");

        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null){
                System.out.println(i + ": " + quartos[i].getNome() + " - " + quartos[i].getEmail());
            }
        }

        sc.close();
    }
}

