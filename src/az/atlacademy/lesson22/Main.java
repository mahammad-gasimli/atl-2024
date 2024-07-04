package az.atlacademy.lesson22;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start...");
        Scanner in = new Scanner(System.in);
        char c = in.nextLine().charAt(0);
        System.out.println("Please insert first number:");
        Double a = in.nextDouble();
        System.out.println("Please insert second number:");
        Double b = in.nextDouble();
        Operation operation =Operation.getOperation(c);
        System.out.println(calculate(a,b,operation));
    }

    public static Double calculate(Double a, Double b, Operation operation) {
        if (operation == Operation.SUM) {
            return a + b;
        } else if (operation == Operation.SUBTRACT) {
            return a - b;
        } else return null;



    }

}


