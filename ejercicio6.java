public class ejercicio6 {
    public static void main(String[] args) {

        int vec[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int aux = 0;

        for (int i = 0; i <= vec.length - 1; i++) {
            if (vec[i] % 2 == 0) {
                aux++;

            }
        }
        System.out.println("Esta es la cantidad de numeros pares del vector: " + aux);

    }
}