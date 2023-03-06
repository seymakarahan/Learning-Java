package DongulerProje1;

import java.util.Scanner;

public class Proje1 {
    public static void main(String[] args) {
        int n, number, maxNumber = 1, minNumber = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz? : ");
        n = input.nextInt();


        for ( int i = 1; i <= n; i++) {
            System.out.print(i + ".sayıyı giriniz : ");
            number = input.nextInt();

            if (number < minNumber) {
                minNumber = number;
            } 
            else if (number > maxNumber) {
                maxNumber = number;
            } 
            else if (i ==1) {
                maxNumber = number;
                minNumber = number;
            }

        }
        System.out.println("En buyuk sayi: " + maxNumber);
        System.out.println("En kucuk sayi: " + minNumber);
    }
}
