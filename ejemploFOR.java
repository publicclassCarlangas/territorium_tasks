//Escribir un programa que lea 10 notas de alumnos
// cuántos tienen notas mayores o iguales a 7 
//y cuántos menores.

import java.util.Scanner;

public class ejemploFOR {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int aprobados=0;
        int reprobados=0;
        int nota;
        for(int f=1; f<=10;f++) {
            System.out.print("Ingre la nota: ");
            nota=teclado.nextInt();
            if(nota>=7){
                aprobados++;
            } else{
                reprobados++;
            }



        }
        System.out.println("Cantidad de alumnos con nos mayores o iguales a 7: "+aprobados);
        System.out.println("Cantidad de alumnos con notas menores a 7: "+reprobados);
        

    }
    
}