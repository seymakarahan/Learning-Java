package Main.Projeler;

import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
            boy = input.nextDouble();

            System.out.print("Lütfen kilonuzu giriniz : ");
            kilo = input.nextDouble();
        }
            double kitleendeksi = (kilo/boy)*boy;

        System.out.println("Vücut Kitle İndeksiniz : " + kitleendeksi);

    }
}
