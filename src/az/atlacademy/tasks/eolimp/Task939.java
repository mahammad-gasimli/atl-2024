package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while (number>0){
            sum = sum + number%10;
            number = number/10;
        }
        int pow = sum*sum;
        System.out.println(pow);
    }
}
