package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task903 {
    public static void main(String[] args) {
        //First or last?
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = number % 10;
        int b = number / 100;


        if (a > b) {
            System.out.println(a);
        } else if (b > a) {

            System.out.println(b);
        } else {
            System.out.println("=");
        }

    }
}
