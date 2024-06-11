package az.atlacademy.tasks.eolimp;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //qeyid edim ki ilk once while dongusu ile
        //yazmisdim kodu 100% netice vermirdi do while
        //yazandan sonra 100% netice aldim cunki serde
        //sifirda daxil edile biler yazilib bu halda while
        //daxil olmayacaqdi amma do while en azi bir defe islediyi
        //ucun reqem sayi artacaqdir

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digits = 0;
        do {
            digits++;
            number = number/10;
        }
        while (number>0);

        System.out.println(digits);
    }
}
