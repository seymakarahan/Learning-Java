package ArtikYilHesaplama;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        year = input.nextInt();


        int kosul1 = year%4;
        int kosul2 = year%400;


        if (kosul1 == 0) {
            System.out.println(year +" "+ "bir artık yıldır.");
        }
        else if (kosul2 == 0) {
            System.out.println(year +" "+ "bir artık yıldır.");

        } else {
            System.out.println(year +" "+ "bir artık yıl değildir.");
        }

    }
}
