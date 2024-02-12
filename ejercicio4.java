public class ejercicio4 {
    public static void main(String[] args) {

        int vec[] = { 7, 24, 87, 25, 8 };
        int maximo = -99999;
        int minimo = 999999;

        for (int i = 0; i <= vec.length - 1; i++) {
            // El valor menor
            if (vec[i] < minimo) {
                minimo = vec[i];
            }
            // El valor mayor
            if (vec[i] > maximo) {
                maximo = vec[i];

            }

        }
        System.out.println("El numero mayor es: " + maximo);
        System.out.println("El numero menor es: " + minimo);

    }
}