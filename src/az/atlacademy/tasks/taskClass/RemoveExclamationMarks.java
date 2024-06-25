package az.atlacademy.tasks.taskClass;

import java.util.Scanner;

public class RemoveExclamationMarks {


//        public static void main(String[] args) {
//            String input = "Hello World!!!";
//            String result = removeExclamationMarks(input);
//            System.out.println(result);  // Output will be "Hello World"
//        }
//
//        public static String removeExclamationMarks(String input) {
//            // Replace all exclamation marks with an empty string
//            return input.replace("!", "");
//        }

    static int depth = 0;

    private static void recursiveStackOverflow() {
        depth++;
        recursiveStackOverflow();
    }

    public static void main(String[] args) {
        try {
            recursiveStackOverflow();
        } catch (StackOverflowError e) {
            System.out.println("Maximum depth of the call stack is " + depth);
        }
    }

}
