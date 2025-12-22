public class Estudante{
    String nome;
    double nota1;
    double nota2;
    double nota3;

    public Estudante(String nm, double n1, double n2, double n3){
        this.nome = nm;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public double calcularMedia(){
        return nota1 + nota2 + nota3;
    }

    public double pontosNecessarios(double media){
        return 60.0 - media;
    }

    public void situacaoFinal(){
        double media = calcularMedia();

        System.out.printf("Nota Final: %.2f\n", media);

        if (media >= 60){
            System.out.println("PASSOU");
        }
        else{
            System.out.println("REPROVADO");
            System.out.println("É PRECISO DE " + pontosNecessarios(media) + " PONTOS PARA PASSAR");
        }
    }
}