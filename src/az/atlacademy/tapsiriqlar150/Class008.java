package az.atlacademy.tapsiriqlar150;

public class Class008 {
    public static void main(String[] args) {
        System.out.println("Write a Java program to display the following pattern.");
        String st1 = "    J    a   v     v  a     ";
        String st2 = "    J   a a   v   v  a a    ";
        String st3 = " J  J  aaaaa   V V  aaaaa   ";
        String st4 = "  JJ  a     a   V  a     a  ";


        char [] [] charArray = new char[4][st1.length()];
        for (int i = 0; i < st1.length(); i++) {
            charArray[0][i] = st1.charAt(i);
        }
        for (int i = 0; i < st2.length(); i++) {
            charArray[1][i] = st2.charAt(i);
        }
        for (int i = 0; i < st3.length(); i++) {
            charArray[2][i] = st3.charAt(i);
        }
        for (int i = 0; i < st4.length(); i++) {
            charArray[3][i] = st4.charAt(i);
        }
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                System.out.print(charArray[i][j]);
            }
            System.out.println();

        }
        System.out.println();
        //Kodu yuxaridaki kimi yazdiqdan sonra ChatGPT ye asagidaki suali vererek
        //yazdigim kodu elave etdikde
        //salam aşağıdakı kodun nəticəsi eyni qalmaq həmin kodu necə qısa
        // şəkildə yazmaq olar
        //ve onun cavabi asagidaki kimidir
            String[] strings = {
                    "    J    a   v     v  a     ",
                    "    J   a a   v   v  a a    ",
                    " J  J  aaaaa   V V  aaaaa   ",
                    "  JJ  a     a   V  a     a  "
            };

            char[][] charArray1 = new char[strings.length][strings[0].length()];

            for (int i = 0; i < strings.length; i++) {
                charArray1[i] = strings[i].toCharArray();
            }

            for (char[] row : charArray1) {
                System.out.println(row);
            }



    }
}
