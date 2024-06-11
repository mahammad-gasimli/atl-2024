package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task8608 {
    public static void main(String[] args) {
        //sgn function
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number>0){
            System.out.println("1");
        } else if (number < 0){
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
}
