import java.util.Scanner;

public class calculadoraMetodos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        System.out.print("Ingrese el número de la operación: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + suma(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + resta(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicacion(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + division(num1, num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }
}