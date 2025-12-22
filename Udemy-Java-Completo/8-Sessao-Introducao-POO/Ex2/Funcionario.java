public class Funcionario{
    String nome;
    double salarioBruto;
    double impostos;

    public Funcionario(String nm, double sal, double imp){
        this.nome = nm;
        this.salarioBruto = sal;
        this.impostos = imp;
    }

    public double salarioLiquido(){
        return salarioBruto - impostos;
    }

    public void aumentarSalario(double valorAcrescido){
        double porcento = valorAcrescido / 100;
        salarioBruto += salarioBruto * porcento;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: R$ %.2f",  salarioLiquido());
        System.out.println();
    }
}