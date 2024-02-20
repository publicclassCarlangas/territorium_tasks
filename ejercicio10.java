import java.util.Scanner;
public class ejercicio10 {
    int vec[] = { 1, 6, 3, 8, 5 };
    int aux;
    
    private boolean ascen(){
        for (int i = 0; i < vec.length - 1; i++) {
            for (int h = i + 1; h < vec.length; h++) {
                if (vec[h] > vec[i]) {
                    aux = vec[h];
                    vec[h] = vec[i];
                    vec[i] = aux;
                }
            }
        }

        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
        return false;
    }
    private boolean descen(){
        for (int i = 0; i < vec.length - 1; i++) {
            for (int h = i + 1; h < vec.length; h++) {
                if (vec[h] < vec[i]) {
                    aux = vec[h];
                    vec[h] = vec[i];
                    vec[i] = aux;
                }
            }
        }

        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        acti10 ma= new acti10();
        Scanner scan = new Scanner(System.in);
        System.out.println("reproducir en orden ascendente o descendente?: 1 para ascendente, 2 para descendente:");
        int res = scan.nextInt();
        if (res== 1){
            System.out.print(ma.descen());
        }
        if (res==2) {
            System.out.print(ma.ascen());
        } 
        scan.close();
    }
}