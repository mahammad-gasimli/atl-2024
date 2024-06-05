package az.atlacademy.tasks.tapsiriqlar20taskloop;

import java.util.Scanner;

public class TaskForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir eded daxil edin");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
