package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task8941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(j + 1 + i*m + " ");
            }
            System.out.println();
        }
    }
}
