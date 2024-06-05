package az.atlacademy.lesson02;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DataTypeApp {
    public static void main(String[] args) {
        byte num01 = 1;
        short num02 = 2;
        int num03 = 5;
        long num04 = 6;
        float num05 = 6.0f;
        double num06 = 6.0;
        char character = 'a';
        String world = "hello World!";
        System.out.println("==================");
        boolean bluean01 = true;
        long a = 11;
        long b = 12;
        double doubleA = 10.25;
        double doubleB = 44;
        long sum = a + b;
        double differance = doubleA - doubleB;
        System.out.println("sum:"+ a + "+" + b + "=" + sum);
        System.out.println("================================");
        System.out.println("difference = " + differance);
        System.out.println("==============================");
        long multiple = a * b;
        System.out.println("multiple: " + a + "+" + b + "=" + multiple);
        System.out.println("divade:" + a + "/" + (double)b +"="+ (a/b));
        Scanner sc = new Scanner(System.in);
        System.out.println("bir eded daxil edin");
        int eded = sc.nextInt();

        if (eded%15==0){
            System.out.println("fizzbuzz");
        } else if (eded%3==0){
            System.out.println("fizz");
        } else if (eded%5==0){
            System.out.println("buzz");
        } else {
            System.out.println("eded ne 3-e ne 5-e nede 15 - bolunur");
        }


    }
}