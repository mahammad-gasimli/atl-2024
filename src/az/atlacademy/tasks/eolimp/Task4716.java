package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task4716 {
    public static void main(String[] args) {
        //Divide the apples - 1
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int apples = sc.nextInt();
        int result = apples/student;
        System.out.println(result);
    }
}
