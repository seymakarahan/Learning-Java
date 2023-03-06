package Main.Projeler;

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        double a, kdv, kdvOran, hesaplanan;

        try(
            Scanner input = new Scanner(System.in)) {
                System.out.print("KDV değeri hesaplanacak değeri giriniz : ");
                a = input.nextDouble();
            }
            boolean kdvTutari;
            kdvTutari = (0 < a) && (1000 > a);
            kdvOran = kdvTutari ? 0.18 : 0.08;


            kdv = a*kdvOran;
            hesaplanan = kdv + a;



        System.out.println("KDV miktarı : " + kdv); 
        System.out.println("KDV'li tutar : " + hesaplanan);
        
    }
}
