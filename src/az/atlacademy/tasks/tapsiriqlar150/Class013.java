package az.atlacademy.tasks.tapsiriqlar150;

import java.util.Scanner;

public class Class013 {
    public static void main(String[] args) {
        System.out.println("Write a Java program to print the \n" +
                "area and perimeter of a rectangle.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width of rectangle:");
        float width = sc.nextFloat();
        System.out.println("Enger height of rectangle:");
        float height = sc.nextFloat();
        System.out.println("The area of rectangle: " + width*height);
        System.out.println("The perimeter of rectangle: " + 2*(width+height));

    }
}
