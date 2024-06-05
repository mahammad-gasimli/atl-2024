package az.atlacademy.tasks.tapsiriqlar150;

import java.util.Scanner;

public class Class011 {
    public static void main(String[] args) {
        System.out.println("Write a Java program to print the area \n" +
                "and perimeter of a circle.");
        System.out.println("Ender Radius:");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println("The area of circle:" + Math.PI*radius*radius);
        System.out.println("The perimeter of circle:" + 2*Math.PI*radius);

    }
}
