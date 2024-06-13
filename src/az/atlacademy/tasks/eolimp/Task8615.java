package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task8615 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); /// b >= a
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (x >= b && x <= c) {
            System.out.println("IN");
        } else {
            System.out.println("OUT");
        }
    }
}
