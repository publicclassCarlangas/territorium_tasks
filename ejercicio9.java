import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[]= {10,11,12,13,14,15};
        System.out.println("que posicion quiere buscar: 0,1,2,3,4,5: ");
        int n = scan.nextInt();
        if (n == 0 || n ==1 || n ==2 || n ==3 || n ==4 || n ==5){
        System.out.println(arr[n]);
        }
        scan.close();
    }
        
}