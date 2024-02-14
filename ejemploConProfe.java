public class Carlos {

    public static void main(String[] args) {

        int vec[];
        vec = new int[10];

        int cr = 5;

        for (int i = 0; i <= 9; i++) {
            vec[i] = cr;
            cr = cr + 5;
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(vec[i]);
        }

    }

}
