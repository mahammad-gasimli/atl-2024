package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Write a program which reads a two-digit
        // number and prints every digit, separated by a space
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number01 = number/10;
        number = number%10;
        System.out.println(number01 + " " + number);

    }
}
