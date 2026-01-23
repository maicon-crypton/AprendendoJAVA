public class Aula07Arreys02 {
    public static void main(String[] args) {
        //byte, short, int, long, float, e double = 0
        //char, '/u0000'
        // borlean false
        // String null
        String[] names = new String[3];
        names[0] = "goku";
        names[1] = "luffy";
        names[2] = "naruto";
         for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
         }

    }

}
