package Main.Projeler;

import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, kilo1, kilo2, kilo3, kilo4, kilo5;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Armut kaç kilo?");
            kilo1 = input.nextDouble();
            System.out.print("Elma kaç kilo?");
            kilo2 = input.nextDouble();
            System.out.print("Domates kaç kilo?");
            kilo3 = input.nextDouble();
            System.out.print("Muz kaç kilo?");
            kilo4 = input.nextDouble();
            System.out.print("Patlıcan kaç kilo?");
            kilo5 = input.nextDouble();
        }
        double toplam = (armut*kilo1) + (elma*kilo2) + (domates*kilo3) + (muz*kilo4) + (patlican*kilo5);
        
        System.out.println("Toplam Tutar : " + toplam);
        





    }
}
