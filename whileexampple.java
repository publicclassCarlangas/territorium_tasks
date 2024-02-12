import java.util.Scanner;

public class whileexampple {
    public static void main(String[] args) {
        Scanner octavio=new Scanner(System.in);

        int n, x;

        System.out.print("Ingrese un valor: ");
        n=octavio.nextInt();
        x=1;
        while(x<=n){
            System.out.print(x + "-");
            x=x+1;
        }

        octavio.close();
        
    }
    
}