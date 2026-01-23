package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // UTILIZANDO SWITCH E DADOS OS VALORES DE 1 ATE 7, IMPRIMA SE É DIA ÚTIL OU FIM DE SEMANA
        // CONSIDERANDO 1 COMO DOMINGO
        byte dia = 1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3: 
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}




























