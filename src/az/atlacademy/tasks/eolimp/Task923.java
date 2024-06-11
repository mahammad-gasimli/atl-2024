package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task923 {
    public static void main(String[] args) {
        //Season
        Scanner sc = new Scanner(System.in);
        int months = sc.nextInt();
        if (months == 12 || months == 1 || months == 2) {
            System.out.println("Winter");
        } else if (months == 3 || months == 4 || months == 5) {
            System.out.println("Spring");
        } else if (months == 6 || months == 7 || months == 8) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }
    }
}
