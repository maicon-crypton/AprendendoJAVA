package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    // € 0 € 34,712 9.70%
    // € 34,713 € 68,507 37.35%
    // € 68,508 49.50%
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            double impostoPrimeiraFaixa = 34712 * primeiraFaixa;
            double restante = salarioAnual - 34712;
            valorImposto = impostoPrimeiraFaixa + (restante * segundaFaixa);
        } else {
            double impostoPrimeiraFaixa = 34712 * primeiraFaixa;
            double impostoSegundaFaixa = (68507 - 34712) * segundaFaixa;
            double restante = salarioAnual - 68507;
            valorImposto = impostoPrimeiraFaixa + impostoSegundaFaixa + (restante * terceiraFaixa);
        }
        System.out.println("Valor do imposto: " + valorImposto);
    }
}