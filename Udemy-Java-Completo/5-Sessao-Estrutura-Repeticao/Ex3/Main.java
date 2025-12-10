import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantAlcool = 0;
        int quantGasolina = 0;
        int quantDiesel = 0;
        boolean control = true;

        while(control){
            System.out.println("Digite o codigo do combustivel (1 - 4)");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    quantAlcool++;
                    continue;
                case 2:
                    quantGasolina++;
                    continue;
                case 3:
                    quantDiesel++;
                    continue;
                case 4:
                    control = false;
                default:
                    continue;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + quantAlcool);
        System.out.println("Gasolina: " + quantGasolina);
        System.out.println("Diesel: " + quantDiesel);
        sc.close();
    }    
}
