public class ejercicio1 {

    public static void main(String[] args) {

        int vec[];
        vec = new int[10];

        int cr = 3;

        for (int i = 0; i <= 9; i++) {
            vec[i] = cr;
            cr = cr + 3;
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(vec[i]);
        }

    }

}