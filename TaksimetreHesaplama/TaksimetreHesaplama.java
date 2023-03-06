package Main.Projeler;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        int mesafe;
        double permesafe = 2.20, total, startPrice = 10;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Mesafeyi km cinsinden giriniz : ");
            mesafe = input.nextInt();
        }
        
        total = mesafe*permesafe;
        total += startPrice;

        total = (total < 20) ? 20 : total;
        

        System.out.println("Toplam tutar : " + total);



    }
}
