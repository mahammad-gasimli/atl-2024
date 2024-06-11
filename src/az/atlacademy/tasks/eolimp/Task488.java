package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task488 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {

            for (int j = 1; j <= number; j++) {
                if (i % 2 == 0) {
                    System.out.print(i * number + j + " ");
                } else {
                    System.out.print((i+1)*number-j+1 + " ");
                }
            }
            System.out.println();
        }
    }
}
