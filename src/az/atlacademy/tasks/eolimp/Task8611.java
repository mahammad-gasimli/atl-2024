package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task8611 {
    public static void main(String[] args) {
        //Water and Ice
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        if (temperature > 0){
            System.out.println("Water");
        } else {
            System.out.println("Ice");
        }
    }
}
