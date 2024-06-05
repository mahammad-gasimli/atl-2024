package az.atlacademy.tapsiriqlar150;

public class Class014 {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 46; j++) {
                if (j < 12 && i % 2 == 0 && i < 9) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (j < 12 && i % 2 == 1 && i < 9) {
                    if (j % 2 == 1 && j != 11) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else System.out.print("=");
            }
            System.out.println();

        }
    }
}
