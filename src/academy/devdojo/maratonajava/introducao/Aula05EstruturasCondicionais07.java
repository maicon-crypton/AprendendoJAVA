package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais07 {
    public static void main(String[] args) {
        // while, do while, for e foreach
        int contador = 12;
        while (contador < 10) {
            System.out.println("contador: " + ++contador);
        }
        do {
            System.out.println("contador: " + "dentro do do while " + contador);
            contador+=2;
        } while (contador < 10);

        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("for: " + i);
        }

        // foreach loop
        int[] array = {1, 2, 3, 4, 5};
        for (int num : array) {
            System.out.println("foreach: " + num);
        }
    }
}