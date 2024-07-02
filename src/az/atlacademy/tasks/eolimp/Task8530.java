package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task8530 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int [] [] masiv = new int[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                masiv[i][j] = scanner.nextInt();
            }
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(masiv[i][j] + " ");

            }
            System.out.println();

        }


    }
}
