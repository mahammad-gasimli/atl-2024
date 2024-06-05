package az.atlacademy.tapsiriqlar150;

public class Class016 {
    public static void main(String[] args) {
        System.out.println("Write a Java program to print a face.");
        String[] textFace = {
                "[| o o |]",
                " |  ^  | ",
                " | '-' | ",
                " +-----+"};
        char [][] charArray = new char[textFace.length][textFace[0].length()];
        for (int i = 0; i < textFace.length; i++) {
            charArray[i] = textFace[i].toCharArray();
        }
        for (int i = 0; i < textFace.length; i++) {
            char [] text = charArray[i];
            System.out.println(text);

        }
    }
}
