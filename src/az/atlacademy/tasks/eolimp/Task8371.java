package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task8371 {
    public static void main(String[] args) {
        //Even or Odd
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number%2==1){
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }
    }
}
