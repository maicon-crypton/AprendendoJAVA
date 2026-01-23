public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 30000;
for (double parcela = 1; parcela <= 48; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela>+ 100) {        
             System.out.println("Parcela " + parcela + " R$ " + valorParcela);

                
            }
        }
    }

}
