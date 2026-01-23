package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int count = 2;
        while (count < 100) {
            System.out.println(count);
            count += 2;
        }
        for (int i = 0; i < 100; i += 2) {
            System.out.println(i);
        }
    }
}
