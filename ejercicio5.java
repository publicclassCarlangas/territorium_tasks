public class ejercicio5 {
    public static void main(String[] args) {

        int vec[] = { 1, 2, 3, 4, 5 };
        int aux;

        for (int i = 0; i < vec.length-1; i++) {
            for (int h = i + 1; h < vec.length; h++) {
                if (vec[h] < vec[i]) {
                    aux = vec[h];
                    vec[h] = vec[i];
                    vec[i] = aux;
                }
            }
        }

        for (int i = 0; i < vec.length - 1; i++) {
            System.out.println(vec[i]);
        }

    }

}