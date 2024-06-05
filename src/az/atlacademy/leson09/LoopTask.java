package az.atlacademy.leson09;

import java.util.Scanner;

public class LoopTask {
    public static void main(String[] args) {

        //
        //Question 1
        System.out.println("Question 1\n" +
                "\n" +
                "Write a program to print numbers from 1 to 10.");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }


        ////////
        ////////Question 2
        System.out.println("Question 2 \n" +
                "Write a program to calculate \n" +
                "the sum of first 10 natural number.");
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //
        //Question 3
        System.out.println("Question 3 \n" +
                "Input a positive integer. \n" +
                "It should then print the multiplication table of that number. ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }


        //
        //Question 4
        System.out.println("Question 4 \n" +
                "Write a program to find the factorial value of any \n" +
                "number entered through the keyboard. ");
        number = sc.nextInt();
        int factorial = 1;
        if (number < 0) {
            System.out.println("Plaese enter positive number");
        } else if (number == 0) {
            System.out.println(factorial);

        } else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial*i;
            }
            System.out.println(factorial);
        }

        ///
        ///
        //Question 5
        System.out.println("Question 5 \n" +
                "Two numbers are entered through the keyboard. \n" +
                "Write a program to find the value of one number raised to \n" +
                "the power of another. (Do not use Java built-in method)");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int result = 1;
        for (int i = 0; i <secondNumber; i++) {
            result = result*firstNumber;
        }
        System.out.println(firstNumber+"^"+secondNumber + "="+ result);

        //
        //Question 6
        System.out.println("Question 6 Write a program that prompts \n" +
                "the user to input an integer and then \n" +
                "        outputs the number with the digits reversed. For example, if the input \n" +
                "        is 12345, the output should be 54321");
        int startNumber = sc.nextInt();
        System.out.println("Before = " + startNumber);
        int finalNumber = 0;
        int temp = 0;
        while (startNumber>0){
            temp = firstNumber%10;
            finalNumber = finalNumber*10 + temp;
            firstNumber = finalNumber/10;
        }
        System.out.println("After = " + finalNumber);

        //Question 7
        System.out.println("Question 7 Write a program that reads a set of integers,\n" +
                " and then prints the sum of the even and odd integers.");
         int sumOfOdd = 0;
         int sumOfEven = 0;
        System.out.println("enter the number of numbers");
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.println("Enter number");
            number = sc.nextInt();
            if (number%2==1){
                sumOfOdd = sumOfOdd + number;
            } else {
                sumOfEven = sumOfEven +number;
            }
        }
        System.out.println("Sum of odd numbers = " + sumOfOdd );
        System.out.println("Sum of even numbers = " + sumOfEven);

        //Question 8
        System.out.println("Question 8\n" +
                "Write a program that prompts the user to input a positive \n" +
                "integer. It should then output a message indicating whether\n" +
                " the number is a prime number. ");
        number = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
        



    }
}
