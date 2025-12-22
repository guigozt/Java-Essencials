class Retangulo{
    public double largura;
    public double altura;

    public Retangulo(double larg, double alt){
        this.largura = larg;
        this.altura = alt;
    }

    public double calcularArea(){
        return largura * altura;
    }

    public double calcularPerimetro(){
        return (largura + altura) * 2;
    }

    public double calcularDiagonal(){
        return Math.sqrt((largura * largura) + (altura * altura));
    }

    public void imprimeDados(){
        System.out.printf("AREA = %.2f\n", calcularArea());
        System.out.printf("PERIMETRO = %.2f\n", calcularPerimetro());
        System.out.printf("DIAGONAL = %.2f", calcularDiagonal());
    }
}