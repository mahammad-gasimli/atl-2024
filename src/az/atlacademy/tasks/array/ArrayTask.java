package az.atlacademy.tasks.array;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arrayin olcusunu daxil edin");
        int length = scanner.nextInt();
        int [] massiv = new int[length];

        massiv[0] = (int)(Math.random()*100);
        int minumum = massiv[0];
        System.out.print(massiv[0] + " ");
        for (int i = 1; i < massiv.length; i++) {
            int random = (int)(Math.random()*100);
            if (random< minumum){
                minumum = random;
            }
            massiv[i] = random;
            System.out.print(massiv[i] + ", ");

        }

        System.out.println();
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]%2==1){
            System.out.println(i + "-ci " + massiv[i] + " element");}

        }
        System.out.println("Arreyde minumum eded " + minumum);


    }
}
