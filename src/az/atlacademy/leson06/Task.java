package az.atlacademy.leson06;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
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
            System.out.println("eded ne 3-e ne 5-e nede 15 - bolunur" + eded);

        }
    }
}
