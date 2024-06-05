package az.atlacademy.lesson02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bir eded daxil edin");
        Scanner sc = new Scanner(System.in);
        int eded = sc.nextInt();
        if (eded != 0 && eded%2==0){
            System.out.println("Even");
        } else if (eded != 0 && eded%2==1) {
            System.out.println("Odd");
        } else {
            System.out.println("Zero");
        }
    }
}
