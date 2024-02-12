import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner octavio = new Scanner(System.in);

        int vec[];
        vec = new int[5];

        for (int i = 0; i <= 4; i++) {
            System.out.print("Ingrese un numero: ");
            vec[i] = octavio.nextInt();
            vec[i] = vec[i] * vec[i];
        }
        octavio.close();

    }

}
