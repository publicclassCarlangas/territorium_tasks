public class ejercicio8 {
    public static void main(String[] args) {
        int vec[]={48,25,5,34,7};
        int suma=0;
        int prom;
        int lar=0;
        for (int i =0; i < vec.length;i++){
            suma = vec[i]+ suma;
            lar++;
        }
        prom = suma / lar;
        System.out.println("este es el promedio: "+ prom); 
    }
}