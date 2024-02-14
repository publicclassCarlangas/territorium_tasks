public class ejercicio7 {
    public static void main(String[] args) {

        int vec[] = { 1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9 };

        for (int i = 0; i < vec.length; i++) {
            for (int c = i + 1; c < vec.length; c++) {
                if (vec[c] == vec[i]) {
                    vec[i] = 0;

                }

            }
            if (vec[i] != 0) {
                System.out.println(vec[i]);
            }
        }

    }
}