public class ConversorMoeda {
    public static final double TAXA = 0.06;

    public static double converterValor(double dolar, double qtd){
        return qtd * dolar;
    }

    public static double totalConvertido(double valor){
        return valor + (valor * TAXA);
    }
}
